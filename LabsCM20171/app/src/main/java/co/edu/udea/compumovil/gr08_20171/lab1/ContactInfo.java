package co.edu.udea.compumovil.gr08_20171.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class ContactInfo extends AppCompatActivity {

    Button btnSiguiente;
    public static String[] paises_lati = {
            "Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Costa Rica", "Cuba", "Ecuador",
            "El Salvador", "Guayana Francesa", "Granada", "Guatemala", "Guayana", "Haití",
            "Honduras", "Jamaica", "México", "Nicaragua", "Paraguay", "Panamá", "Perú",
            "Puerto Rico", "República Dominicana", "Surinam", "Uruguay", "Venezuela"
    };

    public static String[] ciudad_prin = {
            "Bogotá","Medellín"," Cali "," Barranquilla "," Cartagena de Indias "," Cúcula ",
            " Soledad "," Ibagué "," Bucaramanga "," Soacha "," Santa Marta "," Villavicencio ",
            " Bello "," Pereira "," Valledupar "," Manizales "," Buenaventura "," Pasto ",
            " Montería "," Neiva "
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);

        btnSiguiente = (Button)findViewById(R.id.btnSiguiente2);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sig2 = new Intent(ContactInfo.this, OtherInfo.class);
                startActivity(sig2);
            }
        });

        AutoCompleteTextView paisesSugerencias = (AutoCompleteTextView) findViewById(R.id.campo_pais);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, paises_lati);
        paisesSugerencias.setAdapter(adaptador);

        AutoCompleteTextView ciudadesSugerencias = (AutoCompleteTextView) findViewById(R.id.campo_ciudad);
        ArrayAdapter<String> adaptador2 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,ciudad_prin);
        ciudadesSugerencias.setAdapter(adaptador2);
    }
}
