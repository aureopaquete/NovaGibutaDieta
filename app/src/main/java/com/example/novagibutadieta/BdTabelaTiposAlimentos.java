package com.example.novagibutadieta;

import android.database.sqlite.SQLiteDatabase;

public class BdTabelaTiposAlimentos {

    public static final String NOME_TABELA = "TiposAlimentos";
    public static final String CAMPO_DESCRICAO = "descricao";
    public static final String CAMPO_VALOR = "campo_valor";


    private SQLiteDatabase db;

    public BdTabelaTiposAlimentos(SQLiteDatabase db) {
        this.db = db;
    }

    public void cria() {

        db.execSQL(
                "CREATE TABLE NOME_TABELA(" +
                        "_ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "CAMPO_DESCRICAO TEXT NOT NULL," +
                        "CAMPO_VALOR TEXT NOT NULL" +
                        ")"
        );
    }
}
