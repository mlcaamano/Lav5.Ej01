package com.example.matias.ej01_suma;

import android.view.View;

/**
 * Created by matias on 02/04/2017.
 */

public class ListenerSumar implements View.OnClickListener {

    IMostrarResultado a;

    public ListenerSumar( IMostrarResultado a)
    {
        this.a=a;
    }

    public void onClick(View v)
    {
        if(v.getId()== R.id.button)
        {
            a.mostrarResultado();
        }

    }

}
