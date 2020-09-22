package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Daytime1 extends AppCompatActivity {
Button gdesayuno, galmuerzo, gcena, gatrass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daytime1);

        gdesayuno=findViewById(R.id.gdesayuno);
        gdesayuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Daytime1.this,GDesayuno.class));
                finish();
            }
        });

        galmuerzo=findViewById(R.id.galmuerzo);
        galmuerzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Daytime1.this,GAlmuerzo.class));
                finish();
            }
        });

        gcena=findViewById(R.id.gcena);
        gcena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Daytime1.this,GCena.class));
                finish();
            }
        });

        gatrass=findViewById(R.id.gatrass);
        gatrass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Daytime1.this,Option.class));
                finish();
            }
        });

    }
}