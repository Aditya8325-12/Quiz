package com.example.quiz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.security.PrivateKey;

public class database extends SQLiteOpenHelper {


    private  static  final String DATABASENAME="MyDataBase";
    private  static  final int DATABASEVERSION=1;
    private  static  final String TABLENAME="myTable";
    private  static  final String ID="id";
    private  static  final String STAR="star";
    private  static  final String QUESTIONLIST="questionList";


    public database(@Nullable Context context) {
        super(context, DATABASENAME, null, DATABASEVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        String CreateTable="CREATE TABLE "+TABLENAME+"("+ID+" INTEGER PRIMARY KEY, "+QUESTIONLIST+""
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

