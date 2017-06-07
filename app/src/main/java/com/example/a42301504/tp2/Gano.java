package com.example.a42301504.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Gano extends AppCompatActivity {


    public void botonaceptar (View vista){

        Intent ir3;
        ir3 = new Intent(Gano.this,PantallaJuego.class);
        startActivity(ir3);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gano);

    }

}
