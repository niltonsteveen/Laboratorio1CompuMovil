package com.example.jesus.ejemplo_ventanas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    Button siguiente;
    public static String[] SITIOS_MOVIL = {
           "Bogotá","Medellín"," Cali "," Barranquilla "," Cartagena de Indias "," Cúcula "," Soledad "," Ibagué "," Bucaramanga "," Soacha "," Santa Marta "," Villavicencio "," Bello "," Pereira "," Valledupar "," Manizales "," Buenaventura "," Pasto "," Montería "," Neiva "
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente = ((Button)findViewById(R.id.btnSiguiente1));

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sig = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(sig);
            }
        });

        AutoCompleteTextView campoSugerencias =
                (AutoCompleteTextView) findViewById(R.id.campo_sugerencias);

        ArrayAdapter<String> adaptador =
                new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, SITIOS_MOVIL);

        campoSugerencias.setAdapter(adaptador);
    }
}
