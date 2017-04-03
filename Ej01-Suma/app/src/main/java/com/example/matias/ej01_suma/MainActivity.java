package com.example.matias.ej01_suma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Modelo miModelo= new Modelo();
        Vista miVista = new Vista(this);
        Controlador miControlador = new Controlador((new ListenerSumar(miVista)));
        miVista.setMiControlador(miControlador);
    }
}
