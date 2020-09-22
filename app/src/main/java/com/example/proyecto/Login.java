package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
Button btn_ir_crearCuenta, iniciar_sesion, atraslog;
EditText cedula, contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cedula=findViewById(R.id.et_cedula);
        contraseña=findViewById(R.id.et_contraseña);
        btn_ir_crearCuenta=findViewById(R.id.btn_ir_crearCuenta);
        iniciar_sesion=findViewById(R.id.iniciar_sesion);


        btn_ir_crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(Login.this,SignUp.class));
            finish();
            }
        });

        iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String v_cedula = cedula.getText().toString();
                String v_contraseña = contraseña.getText().toString();
                if(v_cedula.equals("8-938-509")&& v_contraseña.equals("123456"))
                {
                Toast.makeText(Login.this,"Bienvenido Usuario:",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Login.this,Option.class));
                finish();
            }
                else{
                    Toast.makeText(getApplicationContext(), "Usuario o Contraseña errónea", Toast.LENGTH_SHORT).show();
                }
            }
        });

        atraslog=findViewById(R.id.atraslog);
        atraslog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,MainActivity.class));
                finish();
            }
        });
    }
}