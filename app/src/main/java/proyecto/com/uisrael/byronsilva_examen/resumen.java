package proyecto.com.uisrael.byronsilva_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resumen extends AppCompatActivity {
    TextView tvResumen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        tvResumen= (TextView)findViewById(R.id.tvResumen);
        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("pregunta1").toString();
        String dato2 = bundle.getString("nombre").toString();
        tvResumen.setText(dato2+" "+dato);
    }
}
