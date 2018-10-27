package mx.edu.ittepic.dadm_u3_ejercicio2a_alejandragrande;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( new LienzoCirculos (this));
    }
}
