package com.example.a3_manejo_actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //DECLARACIÓN DE VARIABLES GLOBALES
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //INSTANCIAMOS NUESTRA VAARIABLE CON EL ID DE NUESTRO EDITTEXT
        editText = (EditText)findViewById(R.id.editText_capturar);
    }

    //METODO PARA EL BOTON "ENVIAR", donde configuramos la captura de datos en el EditText y
    //enviamos el dato al activity 2
    public void Enviar(View view){
        Intent siguiente = new Intent(this, SegundoActivity.class);
        siguiente.putExtra("dato", editText.getText().toString());
        startActivity(siguiente);
    }


}