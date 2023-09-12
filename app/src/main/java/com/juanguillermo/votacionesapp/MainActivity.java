package com.juanguillermo.votacionesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int Cedula;
    String Nombre;
    String FechaNacimiento;
    String Votacion;

    Button opcionA;
    Button opcionB;
    Button opcionC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificar el boton

        opcionA = findViewById(R.id.opcionA);
        opcionB = findViewById(R.id.opcionB);
        opcionC = findViewById(R.id.opcionC);

        opcionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Votacion = "Candidato A";
                Intent enviarDatos = new Intent(MainActivity.this, Resultados.class);

                //Datos a enviar
                enviarDatos.putExtra("nombre",Nombre);
                enviarDatos.putExtra("cedula",Cedula);
                enviarDatos.putExtra("fechaNacimiento",FechaNacimiento);

                startActivity(enviarDatos);

            }
        });
    }
}