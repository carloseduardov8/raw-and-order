package com.example.raw_and_order;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "db_rawandorder";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_FRANQUIA = "tb_franquia";
    private static final String FRANQUIA_ID = "id";
    private static final String FRANQUIA_NOME = "nome";
    private static final String FRANQUIA_CNPJ = "cnpj";

    public DBHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TABLE = "CREATE TABLE " + TABLE_FRANQUIA + "("
                + FRANQUIA_ID + " INTEGER PRIMARY KEY, " + FRANQUIA_NOME + " TEXT, "
                + FRANQUIA_CNPJ + " TEXT)";

        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /* CRUD */

    void addFranquia(Franquia franquia){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(FRANQUIA_NOME, franquia.getNome());
        values.put(FRANQUIA_CNPJ, franquia.getCnpj());

        db.insert(TABLE_FRANQUIA, null, values);
        db.close();
    }
}
