package com.example.novagibutadieta;

import android.database.sqlite.SQLiteDatabase;

public class BdTabelaTiposAlimentos {

    private SQLiteDatabase db;

    public BdTabelaTiposAlimentos(SQLiteDatabase db) {
        this.db = db;
    }

    public void cria() {

        db.execSQL(
                "CREATE TABLE categorias(" +
                        "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "descricao TEXT NOT NULL," +
                        "campo_valor TEXT NOT NULL" +
                        ")"
        );
    }
}
