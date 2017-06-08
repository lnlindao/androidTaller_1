package com.example.dptoredes.taller_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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
}
