package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Option extends AppCompatActivity {
Button regresar, combo, gusto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);


       regresar=findViewById(R.id.regresar);
       regresar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(Option.this,Login.class));
               finish();
           }
       });


       combo=findViewById(R.id.combo);
       combo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(Option.this,Daytime.class));
               finish();
           }
       });

       gusto=findViewById(R.id.gusto);
       gusto.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(Option.this,Daytime1.class));
               finish();
           }
       });
    }
}