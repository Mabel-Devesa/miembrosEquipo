package com.mdevesa.activitats.miembrosdelequipo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Capturar los elementos del layout en java
        Button b1 = (Button)findViewById(R.id.b1_nom1);
        Button b2 = (Button)findViewById(R.id.b2_nom2);
        Button b3 = (Button)findViewById(R.id.b3_nom3);
        Button b4 = (Button)findViewById(R.id.b4_nom4);

        //Els metodes setOnClickListener per a cada button

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Crear un intent
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                //Creamos la información a pasar entre actividades
                Bundle b = new Bundle();
                b.putString("NOMBRE", getResources().getString(R.string.nom1));
                //b.putString("IMAGEN",getResources().getString(R.drawable.persona));
                b.putString("DESC", "Es un miembro del equipo");
                b.putString("APT", "Aptitudes");
                //Añadimos la información al intent
                intent.putExtras(b);
                //Iniciamos la nueva actividad
                startActivity(intent);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Crear un intent
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                //Creamos la información a pasar entre actividades
                Bundle b = new Bundle();
                b.putString("NOMBRE", getResources().getString(R.string.nom2));
                //b.putString("IMAGEN",getResources().getString(R.drawable.persona));
                b.putString("DESC", "Es un miembro del equipo");
                b.putString("APT", "Aptitudes");
                //Añadimos la información al intent
                intent.putExtras(b);
                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Crear un intent
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                //Creamos la información a pasar entre actividades
                Bundle b = new Bundle();
                b.putString("NOMBRE", getResources().getString(R.string.nom3));
                //b.putString("IMAGEN",getResources().getString(R.drawable.persona));
                b.putString("DESC", "Es un miembro del equipo");
                b.putString("APT", "Aptitudes");
                //Añadimos la información al intent
                intent.putExtras(b);
                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Crear un intent
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                //Creamos la información a pasar entre actividades
                Bundle b = new Bundle();
                b.putString("NOMBRE", getResources().getString(R.string.nom4));
                //b.putString("IMAGEN",getResources().getString(R.drawable.persona));
                b.putString("DESC", "Es un miembro del equipo");
                b.putString("APT", "Aptitudes");
                //Añadimos la información al intent
                intent.putExtras(b);
                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

    }
}
