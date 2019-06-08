package com.example.novagibutadieta;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class BdTabelaTiposBebidas implements BaseColumns {

    private SQLiteDatabase db;

    public BdTabelaTiposBebidas(SQLiteDatabase db) {
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
