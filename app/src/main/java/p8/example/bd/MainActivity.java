package p8.example.bd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Response;

public class MainActivity extends AppCompatActivity {

    TextView txtReg;
    Button btnIniciar;
    EditText txteUsuario, txtePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtReg = (TextView) findViewById(R.id.txtReg);
        txteUsuario = (EditText) findViewById(R.id.txteUsuario);
        txtePassword = (EditText) findViewById(R.id.txtePassword);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);

        txtReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intReg = new Intent(MainActivity.this, Registro.class);
                startActivity(intReg);
            }
        });

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String username = txteUsuario.getText().toString();
                final String password = txtePassword.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                };
            }
        });

    }
}
