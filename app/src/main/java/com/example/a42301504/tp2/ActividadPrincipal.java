package com.example.a42301504.tp2;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ActividadPrincipal extends AppCompatActivity
{


    int n1 = 0 ;
    int n2 = 0;
    Random cuentas;
    String moni = "";

    tp3sqplite accesoBaseTP3;

    SQLiteDatabase baseDatos;

    List<String>Usuarios = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);

        TextView cuenta;
        cuenta = (TextView) findViewById(R.id.cuenta);


        cuentas = new Random();

        n1 = cuentas.nextInt(10);

        n2 = cuentas.nextInt(10);

        cuenta.setText(n1+"+"+n2);



    }

        Boolean BasedeDatosAbierta() {
            Boolean Responder;

            accesoBaseTP3=new tp3sqplite(this, "baseTp3", null, 1);

            baseDatos=accesoBaseTP3.getWritableDatabase();

            if (baseDatos !=null){
                Log.d("SQLite","base de datos abierta correctamente");
                Responder = true;
            }else {
                Log.d("SQLite","base de datos abierta incorrectamente");
                Responder = false;
            }
            return Responder;

        }




    public void botonaceptar(View vista)
    {
        Log.d("mori","gg");
        int resultado = n1 + n2;


        EditText ingresar;
        ingresar = (EditText) findViewById(R.id.nombre);

        EditText captcha;
        captcha = (EditText) findViewById(R.id.captcha);

        TextView mensaje;
        mensaje = (TextView) findViewById(R.id.error);


        String valor=captcha.getText().toString();

        String Nombre = ingresar.getText().toString().trim();

        int valor1 = Integer.parseInt(valor);

        if (ingresar.getText().length() != 0 && resultado == valor1)
        {

            if (BasedeDatosAbierta()== true)
            {
                Boolean pasitoApasito = false;
                for (int i = 0; i < Usuarios.size(); i++){
                    String hola = Usuarios.get(i).toString();
                    if (hola.equals(Nombre) && !pasitoApasito){
                        pasitoApasito = true;
                    }
                }
                Cursor conjuntoregistros;
                conjuntoregistros = baseDatos.rawQuery("select nombre from personas;",null);
                if (conjuntoregistros.moveToFirst() == true)
                {
                    do
                    {
                        moni = conjuntoregistros.getString(0);
                        if (Nombre.equals(""))
                        {
                            pasitoApasito = true;
                        }
                    }
                    while (conjuntoregistros.moveToNext() == true);
                }
                if (pasitoApasito = false)
                {
                    ContentValues nuevoRegitro;
                    nuevoRegitro=new ContentValues();

                    nuevoRegitro.put("Nombre",Nombre);
                    baseDatos.insert("personas", null, nuevoRegitro);

                    Cursor conjuntoregistros2;
                    conjuntoregistros2 = baseDatos.rawQuery("select nombre from personas", null);
                    baseDatos.close();

                    Toast t1;
                    t1 = Toast.makeText(this, "Este es su primer ingreso al juego", Toast.LENGTH_SHORT);
                    t1.show();

                    Intent ir1;
                    ir1 = new Intent(ActividadPrincipal.this,mainpantalla.class);
                    startActivity(ir1);
                }
                else
                {
                    Toast t1;
                    t1 = Toast.makeText(this, "Usted ya haia ingresado con anterioridad", Toast.LENGTH_SHORT);
                    t1.show();

                    Intent ir1;
                    ir1 = new Intent(ActividadPrincipal.this,mainpantalla.class);
                    startActivity(ir1);

                }
            }
        }
        else
        {
            mensaje.setText("No Ingreso un nombre o el Captcha es incorrecto");
        }
    }
}







