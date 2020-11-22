package com.thiago.trabalhon2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "abastece";   //constante que é o nome do banco
    private static final int VERSAO_BANCO = 1;              //contante que é o a versão do banco

    public Banco(Context context){
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }

    @Override   //metodo para criar o banco
    public void onCreate(SQLiteDatabase sqLiteDatabase) {   //
        sqLiteDatabase.execSQL( "CREATE TABLE produtos (" +
                                "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                                "automovel TEXT NOT NULL," +
                                "kml INTEGER NOT NULL," +
                                "quilometragem INTEGER NOT NUL," +
                                "data INTEGER NOT NULL," +
                                "valorGasoline DOUBLE NOT NULL," +
                                "valorEtanol Double NOT NULL )" );
    }

    @Override   //metodo que altera a versão do banco
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {   //

    }
}