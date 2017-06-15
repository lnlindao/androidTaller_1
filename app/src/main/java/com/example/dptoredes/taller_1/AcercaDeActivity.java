package com.example.dptoredes.taller_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AcercaDeActivity extends AppCompatActivity {

    /*http://desarrollador-android.com/desarrollo/formacion/empezar-formacion/crear-tu-primera-app/iniciar-otra-actividad/*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_acerca_de);*/

        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(taller.EXTRA_MESSAGE);

        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // Set the text view as the activity layout
        setContentView(textView);
    }
}
