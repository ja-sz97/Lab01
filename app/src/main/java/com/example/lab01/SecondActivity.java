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

public class SecondActivity extends AppCompatActivity {

    SeekBar seek;
    TextView tvSecond;
    Button btnAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        seek = findViewById(R.id.seekBar2);
        tvSecond = findViewById(R.id.tvDos);
        btnAtras = findViewById(R.id.btnVuelta);

        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvSecond.setText("SeekBar: " + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(SecondActivity.this, "Volviendo a actividad 1", Toast.LENGTH_LONG).show();


                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("SecondActivity", "onResume: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SecondActivity", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SecondActivity", "Destroy: ");

    }

}