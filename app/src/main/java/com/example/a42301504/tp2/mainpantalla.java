package com.example.a42301504.tp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mainpantalla extends AppCompatActivity {

    public void jugar(View vista){

        Intent ir2;
        ir2 = new Intent(mainpantalla.this,PantallaJuego.class);
        startActivity(ir2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpantalla);
    }
}
