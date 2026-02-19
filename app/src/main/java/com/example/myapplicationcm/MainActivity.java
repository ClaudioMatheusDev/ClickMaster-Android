package com.example.myapplicationcm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOK = findViewById(R.id.btnOK);
        TextView txtContador = findViewById(R.id.txtContador);
        TextView txtSaudacao = findViewById(R.id.txtSaudacao);
        EditText editNameInput = findViewById(R.id.EditNameInput);
        EditText editMetaInput = findViewById(R.id.EditMetaInput);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                txtContador.setText("Cliques: " + contador);

                String nome = editNameInput.getText().toString();
                String metaStr = editMetaInput.getText().toString();

                if (!nome.isEmpty()) {
                    txtSaudacao.setText("Olá, " + nome + "!");
                }

                if (!metaStr.isEmpty()) {
                    int meta = Integer.parseInt(metaStr);

                    if (contador >= meta) {
                        txtContador.setTextColor(android.graphics.Color.GREEN);
                        txtSaudacao.setText("Parabéns " + nome + ", meta batida!");
                    } else {
                        txtContador.setTextColor(android.graphics.Color.BLACK);
                    }
                }
            }
        });
    }
}