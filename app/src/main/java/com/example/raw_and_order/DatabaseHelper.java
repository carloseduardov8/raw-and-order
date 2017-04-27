package com.example.raw_and_order;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by gabriel on 27/04/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "raw_and_order.db";
    public static final String TABLE_NAME_1 = "restaurants";
    public static final String COL_1_1 = "id";
    public static final String COL_1_2 = "name";
    public static final String COL_1_3 = "cnpj";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + DATABASE_NAME + " (id integer primary key, name text, cnpj integer)"   );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_NAME_1);
        onCreate(db);
    }
}
