package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Daytime extends AppCompatActivity {
Button desayuno, almuerzo, cena, atrass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daytime);

        desayuno=findViewById(R.id.desayuno);
        desayuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Daytime.this,Desayuno.class));
                finish();
            }
        });

        almuerzo=findViewById(R.id.almuerzo);
        almuerzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Daytime.this,Almuerzo.class));
                finish();
            }
        });

        cena=findViewById(R.id.cena);
        cena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Daytime.this,Cena.class));
                finish();
            }
        });
        atrass=findViewById(R.id.atrass);
        atrass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Daytime.this,Option.class));
                finish();
            }
        });
    }
}