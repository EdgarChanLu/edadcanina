package com.example.edadcanina;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText edadedit = findViewById(R.id.age_id);
        TextView resulttext = findViewById(R.id.text_result);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edad = edadedit.getText().toString();
                if (!edad.isEmpty()) {
                    int edadint = Integer.parseInt(edad);
                    int resultado = edadint * 7;
                    String resultadostring = "La edad de tu perro es: " + resultado + " años";
                    resulttext.setText(resultadostring);
                } else {
                    Toast.makeText(MainActivity.this, "Se debe agregar una edad", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

