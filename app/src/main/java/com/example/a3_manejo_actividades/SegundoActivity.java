package com.example.a3_manejo_actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {
    //DECLARACION DE VARIABLES GLOBALES
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        //instanciamos el textview para enlazar la parte gráfica de la parte lógica
        textView = (TextView)findViewById(R.id.textview_mostrar);

        //VARIABLE QUE GUARDARA EL DATO QUE EL USUARIO ENVIO EN EL PRIMER ACTIVITY
        String dato = getIntent().getStringExtra("dato");
        textView.setText("Este es tu texto del activity anterior: " + dato);
    }
    //METODO PARA REGRESAR
    public void Anterior(View view){
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }


}