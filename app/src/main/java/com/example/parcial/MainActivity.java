package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void Nuevavista(View view) {
        EditText edtVal1 = findViewById(R.id.edtVal1);
        EditText edtVal2 = findViewById(R.id.edtVal2);

        String usuario = edtVal1.getText().toString();
        String contrasena = edtVal2.getText().toString();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
        } else {
            // Aquí está la lógica para cambiar a la nueva vista
            Intent intent = new Intent(this, Nuevavista.class);
            startActivity(intent);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}