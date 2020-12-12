package pmd.di.ubi.pt.levamecontigov2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.nio.charset.StandardCharsets;

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
                Contract.TabelaTokens.TABLE_NAME + "(" +
                Contract.TabelaTokens.COLUMN_NUM + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Contract.TabelaTokens.COLUMN_ID + " TEXT," +
                Contract.TabelaTokens.COLUMN_USERNAME + " TEXT" + ")" ;
        db.execSQL(SQL_CREATE_TOKENS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addToken(String username, String id) {
        ContentValues cv= new ContentValues();
        cv.put(Contract.TabelaTokens.COLUMN_USERNAME, username);
        cv.put(Contract.TabelaTokens.COLUMN_ID, id);
        database.insert(Contract.TabelaTokens.TABLE_NAME, null, cv);
    }
}
