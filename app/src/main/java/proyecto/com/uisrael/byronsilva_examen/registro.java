package proyecto.com.uisrael.byronsilva_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registro extends AppCompatActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void guardar (View view){

        String nombre = ((EditText)findViewById(R.id.etNombre)).getText().toString();


            Intent envresumen1 = new Intent(registro.this, encuesta.class);
            envresumen1.putExtra("nombre",nombre);
            startActivity(envresumen1);

    }
}
