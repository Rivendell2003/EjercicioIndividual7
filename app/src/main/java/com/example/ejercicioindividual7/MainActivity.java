package com.example.ejercicioindividual7;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Bienvenido !", Toast.LENGTH_SHORT).show();

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {

            Toast.makeText(this, "Botón presionado", Toast.LENGTH_SHORT).show();
        });
    }
}
