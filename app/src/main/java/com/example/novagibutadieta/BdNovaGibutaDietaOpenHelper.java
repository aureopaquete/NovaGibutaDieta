package com.example.novagibutadieta;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;


public class BdNovaGibutaDietaOpenHelper extends SQLiteOpenHelper {

    public static final String NOME_BASE_DADOS = "NovaGibutaDieta.db";
    private static final int VERSAO_BASE_DADOS = 1;

    public BdNovaGibutaDietaOpenHelper(@Nullable Context context) {
        super(context, NOME_BASE_DADOS, null, VERSAO_BASE_DADOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        new BdTabelaTiposAlimentos(db).cria();
        new BdTabelaTiposBebidas(db).cria();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
