package proyecto.com.uisrael.byronsilva_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void login (View view){
        String usuario = ((EditText)findViewById(R.id.etUsuario)).getText().toString();
        String password = ((EditText)findViewById(R.id.etPassword)).getText().toString();
        if (usuario.equals("estudiante2019") &&password.equals("uisrael2019")){
            Intent actRegistro = new Intent(MainActivity.this, registro.class);
            //actRegistro.putExtra("usuario",usuario.getText().toString());
            startActivity(actRegistro);
        }
        else {
            Toast.makeText(getApplicationContext(),"Usuario o Password Incorrecto", Toast.LENGTH_LONG).show();
        }
    }

}
