package com.example.holaiudigital;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity{
    private TextView MensajeRecibido;
    private Button btnRecibido;
    private Button btnCancelado;

    @Override
    protected void onCreate (Bundle guardarEstado){
        super.onCreate(guardarEstado);
        setContentView(R.layout.activity_2);

        // se relacionan los elementos declarados en el XML
        MensajeRecibido = findViewById(R.id.MensajeRecibido);
        btnRecibido = findViewById(R.id.btnRecibido);
        btnCancelado = findViewById(R.id.btnCancelado);

        // se obtiene el Intent y extrae el mensaje

        Intent IntentRecibido = getIntent();
        if (IntentRecibido != null && IntentRecibido.hasExtra("Informacion Enviada")){
            String Mensaje = IntentRecibido.getStringExtra("Informacion Enviada");
            MensajeRecibido.setText(Mensaje);
        }
        // se configura la accion del boton "Recibido"
        btnRecibido.setOnClickListener(v -> {
            Intent Respuesta = new Intent();
            Respuesta.putExtra("Estado_Respuesta","Recibido");
            setResult(RESULT_OK, Respuesta);
            finish();// esta accion cierra la pantalla y retorna al MainActivity
        });
        // se configura la accion para el boton "Cancelado"
        btnCancelado.setOnClickListener(v -> {
            Intent Respuesta= new Intent();
            Respuesta.putExtra("Estado_Respuesta", "Cancelado");
            setResult(RESULT_CANCELED, Respuesta);
            finish();
        });
    }
}