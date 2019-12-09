package proyecto.com.uisrael.byronsilva_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class encuesta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
    }

    public void guardar (View view){

        String pregunta1= ((EditText)findViewById(R.id.etPregunta)).getText().toString();


        Intent envresumen2 = new Intent(encuesta.this, resumen.class);
        envresumen2.putExtra("pregunta1",pregunta1);
        startActivity(envresumen2);

    }
}
