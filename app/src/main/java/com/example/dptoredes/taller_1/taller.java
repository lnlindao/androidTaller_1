package com.example.dptoredes.taller_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class taller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);
    }

    /**
     * onRestart escribe en el Log el paso por este
     * método. Android llama al método onRestart cuando
     * se vuelve a iniciar un actividad. Va seguida de
     * una llamada a onStart
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ESto es en onRestart","onRestart");
    }

    /**
     * onStart escribe en el Log el paso por este método.
     * Android llama al método onStart cuando se la
     * actividad es visible para el usuario. Va seguida
     * de una llamada a onStop o a onResume
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESto es en onStart","onStart");
    }

    /**
     * onResume escribe en el Log el paso por este
     * método. Android llama al método onResume cuando
     * la actividad es visible e interactiva para el
     *  usuario. Va seguida de onPause
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESto es en onResume","onResume");
    }

    /**
     * onPause escribe en el Log el paso por este método.
     * Android llama al método onPause cuando se quiere
     * recuperar una actividad previa. En este método se
     * recomienda hacer persistentes los cambios. Va
     * seguida de onPause
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESto es en onPause","onPause");
    }

    /**
     * onStop escribe en el Log el paso por este método.
     * Android llama al método onStop cuando la actividad
     * deja de ser visible al usuario. Va seguida de
     * onRestart o OnStop
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ESto es en onStop","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESto es en onDestroy","onDestroy");
    }

    public final static String EXTRA_MESSAGE = "dptoredes.MESSAGE";

    /** Called when the user clicks the Send button */
    public void abrirAcercaDe(View view) {
        /* ABRIR VENTANA DE ACERCA DE */
        /*Intent intent = new Intent(this, AcercaDeActivity.class);*/

        /* ABRIR LLAMADAS Y PASO EL NÚMERO*/
        /*Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:962849347"));*/

        Intent intent = new Intent(this, AcercaDeActivity.class);
        EditText editText = (EditText) findViewById(R.id.nombre_usuario);
        EditText claveText = (EditText) findViewById(R.id.clave);
        String message = editText.getText().toString();
        String message1 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MESSAGE, message1);
        /*EJECUTAR E INTENT*/
        startActivity(intent);
    }
}
