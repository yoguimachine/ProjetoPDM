package pmd.di.ubi.pt.levamecontigov2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static pmd.di.ubi.pt.levamecontigov2.Contract.TabelaTokens.TABLE_NAME;

public class DBL extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Tokens.db";
    private static final int DATABASE_VERSION = 2;
    private SQLiteDatabase database;

    public DBL(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        database = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.database = db;
        final String SQL_CREATE_TOKENS_TABLE = "CREATE TABLE " +
                TABLE_NAME + "(" +
                Contract.TabelaTokens.COLUMN_NUM + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Contract.TabelaTokens.COLUMN_ID + " TEXT," +
                Contract.TabelaTokens.COLUMN_USERNAME + " TEXT" + ")" ;
        db.execSQL(SQL_CREATE_TOKENS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean chkDB() {
        boolean flag = false;
        Cursor cur = database.rawQuery("SELECT count(*) FROM Users ", null);
        cur.moveToFirst();
        int count = cur.getInt(0);
        if(count==0 || database == null){
            flag=true;
            cur.close();
        }
        return flag;
    }

    public void addToken(String username, String id) {
        ContentValues cv= new ContentValues();
        cv.put(Contract.TabelaTokens.COLUMN_USERNAME, username);
        cv.put(Contract.TabelaTokens.COLUMN_ID, id);
        database.insert(TABLE_NAME, null, cv);
    }

    //TODO função para mostrar os atributos no nosso token
    public List<String> user_id() {
        ArrayList<String> user_id= new ArrayList<>();
        Cursor cur = database.rawQuery("SELECT " + Contract.TabelaTokens.COLUMN_USERNAME + ", " +
                Contract.TabelaTokens.COLUMN_ID + " FROM " + TABLE_NAME, null);
        if(cur.moveToFirst()){
            String username = (cur.getString(cur.getColumnIndex(Contract.TabelaTokens.COLUMN_USERNAME)));
            String id = (cur.getString(cur.getColumnIndex(Contract.TabelaTokens.COLUMN_ID)));
            user_id.add(username);
            user_id.add(id);
        }
        return user_id;
    }
}
