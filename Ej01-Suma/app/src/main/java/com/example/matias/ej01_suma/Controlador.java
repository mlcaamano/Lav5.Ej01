package com.example.matias.ej01_suma;

/**
 * Created by matias on 02/04/2017.
 */

public class Controlador {

    ListenerSumar miListener;

    public Controlador(ListenerSumar m){

        this.miListener=m;
    }

    public ListenerSumar getMiListener(){
        return miListener;
    }
}
