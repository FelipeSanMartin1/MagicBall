package com.example.magicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton Ball;
    private TextView respuesta;
    private String [] respuestaArray ={"Es cierto", "Definitivamente es así", "Sin duda",
            "Sí definitivamente", "Mejor pregunte a la caracola magica", "Como yo lo veo, sí","Lo más probable",
            "Perspectiva buena", "Sí", "Cuando mires a las estrellas,sabras la respuesta",
            "Respuesta confusa, intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "La interferencia energetica no me permite predecir", "Concéntrate y pregunta de nuevo",
            "No cuentes con eso","Mi respuesta es no", "Mis fuentes dicen que no",
            "No lo afirmo ni lo niego", "Muy dudoso"}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia la imagen
        Ball = findViewById(R.id.btn);
        //referencia texto
        respuesta = findViewById(R.id.respuestavista);
        //proceso
        Ball.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "Consulta tu Suerte", Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onClick(View v){
        //Creacion Metodo Switch
        switch (v.getId()){
            case R.id.btn:

                int rand = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[rand]);

                break;
        }
    }
}