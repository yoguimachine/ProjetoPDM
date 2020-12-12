package pmd.di.ubi.pt.levamecontigov2;

import android.provider.BaseColumns;

public class Contract {
    private Contract(){}

    public static class TabelaTokens implements BaseColumns{
        public static final String TABLE_NAME = "Users";
        public static final String COLUMN_NUM = "Num";
        public static final String COLUMN_ID = "Id";
        public static final String COLUMN_USERNAME = "Username";
    }
}
