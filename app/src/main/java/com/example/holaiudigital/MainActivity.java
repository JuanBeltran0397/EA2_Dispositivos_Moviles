package com.example.holaiudigital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    //declaramos los objetos
    private EditText Lin_Mensaje;
    private Button btnEnviar;
    private TextView Estado;

    // se declara el lanzador que esta atento a la respuesta de la actividad 2
    private final ActivityResultLauncher<Intent> LanzadorActivity2 = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            resultado ->{
                // proceso el cual se ejecuta cuando Activity2 se cierra con finish()
                if (resultado.getResultCode()==RESULT_OK && resultado.getData()!=null){
                    String Respuesta = resultado.getData().getStringExtra("Estado_Respuesta");
                    Estado.setText("Estado: "+ Respuesta);
                } else if (resultado.getResultCode()==RESULT_CANCELED) {
                    Estado.setText("Estado: Cancelado");
                }
            }

    );


    @Override
    protected void onCreate(Bundle guardarEstado) {
        super.onCreate(guardarEstado);
        setContentView(R.layout.activity_main);
        Button btnSalir = findViewById(R.id.btnSalir);
        // se configura el boton para salir de la aplicacion
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra la actividad actual
            }
        });
        // Vinculamos las variables con los IDs del Archivo XML
        Lin_Mensaje = findViewById(R.id.Lin_Mensaje);
        btnEnviar = findViewById(R.id.btnEnviar);
        Estado = findViewById(R.id.Estado);


        // se configura la accion del boton
        btnEnviar.setOnClickListener(v -> {
            // se extrae la informacion ingresada por el usuario
            String Mensaje= Lin_Mensaje.getText().toString();
            // se crea el proceso de pasar a la pantalla Activity2
            Intent transicion = new Intent(MainActivity.this, Activity2.class);
            // se guarda todo en Intent y se lanza la nueva pantalla
            transicion.putExtra("Informacion Enviada", Mensaje);
            LanzadorActivity2.launch(transicion);

        });
    }
}