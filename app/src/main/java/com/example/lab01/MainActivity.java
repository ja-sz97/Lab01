package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnSiguiente;
    TextView tvBienvenida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MainActivity", "onCreate: ");

        btnSiguiente = findViewById(R.id.btnCambio);

        tvBienvenida = findViewById(R.id.tvHola);
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Ir a actividad 2", Toast.LENGTH_LONG).show();

                //finish();
            }
        });

    }
    @Override
    protected void onResume(){
        super.onResume();

        Log.i("MainActivity", "onResume: ");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("MainActivity", "onStop: ");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();


        Log.i("MainActivity", "onDestroy: ");
    }
}