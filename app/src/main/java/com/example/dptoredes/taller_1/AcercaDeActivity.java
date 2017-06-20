package com.example.dptoredes.taller_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AcercaDeActivity extends AppCompatActivity {

    TextView parametro;

    /*http://desarrollador-android.com/desarrollo/formacion/empezar-formacion/crear-tu-primera-app/iniciar-otra-actividad/*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_acerca_de);*/


        setContentView(R.layout.activity_acerca_de);
        parametro = (TextView) findViewById( R.id.parametro);

        Intent intent=getIntent();
        String message = intent.getStringExtra("nombre_usuario");
        String message2 = intent.getStringExtra("clave");
        parametro.setText("Nombre usuario: "+message+"        Clave: "+message2);

    }
}
