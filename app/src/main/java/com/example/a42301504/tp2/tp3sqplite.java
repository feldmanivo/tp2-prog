package com.example.a42301504.tp2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by ADNINSTRADOR on 04/06/2017.
 */

public class tp3sqplite extends SQLiteOpenHelper {

        public tp3sqplite(Context contexto, String Nombre, SQLiteDatabase.CursorFactory fabrica, int Version){

            super(contexto, Nombre, fabrica, Version);
        }

        @Override
        public void onCreate(SQLiteDatabase basededatos){

            String sqlCrearTablaPersonas;
            sqlCrearTablaPersonas="create tabla personas (nombre text, edad integer)";

            basededatos.execSQL(sqlCrearTablaPersonas);

        }

        @Override
        public void onUpgrade(SQLiteDatabase basededatos, int versionanterior, int versionnueva){

        }
}
