package com.example.intentservice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

private EditText entrada;
public static TextView salida;

@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada= (EditText) findViewById(R.id.entrada);
        salida= (TextView) findViewById(R.id.salida);
        }

public void calcularOperacion(View view) {
        double n = Double.parseDouble(entrada.getText().toString());
        salida.append(n +"^2 = ");
        //Para apartado "Un servicio en un nuevo hilo con IntentService"
        // Intent i = new Intent(this, ServicioOperacion.class);
        //Para apartado "La clase IntentService"
        Intent i = new Intent(this, IntentServiceOperacion.class);
        i.putExtra("numero", n);
        startService(i);
        }
}

