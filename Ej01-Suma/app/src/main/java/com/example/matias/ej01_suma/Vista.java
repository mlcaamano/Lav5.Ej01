package com.example.matias.ej01_suma;

import android.widget.Button;
import android.widget.EditText;

/**
 * Created by matias on 02/04/2017.
 */

public class Vista implements IMostrarResultado {
    private MainActivity actividad;
    private Button btnCalcular;
    private EditText numero1;
    private EditText numero2;
    private EditText resultado;
    private Controlador miControlador;

    public void setMiControlador(Controlador c){
        this.miControlador=c;
        btnCalcular.setOnClickListener(miControlador.getMiListener());
    }

    public Vista(MainActivity a){
        this.actividad=a;

        btnCalcular = (Button) actividad.findViewById(R.id.button);
        numero1= (EditText) actividad.findViewById(R.id.editTextSumando1);
        numero2= (EditText) actividad.findViewById(R.id.editTextSumando2);
        resultado= (EditText) actividad.findViewById(R.id.editTextResultado);
    }

    @Override
    public void mostrarResultado(){

        Double valor=Double.parseDouble(numero1.getText().toString())+Double.parseDouble(numero2.getText().toString());
        resultado.setText(resultado.toString());

        //tv.setText(miModelo.getCambiarInfo());
    }
}
