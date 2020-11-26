package com.gabrielalmeida.appgabrielformativa.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.gabrielalmeida.appgabrielformativa.R;
import com.gabrielalmeida.appgabrielformativa.util.CalculosUtil;

public class CtrlAreaCirculo extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceSate){
        super.onCreate(savedInstanceSate);
        setContentView(R.layout.activity_area_circulo);

        Button btnCalcular  = findViewById(R.id.btnCalcularArea);
        EditText raio       = findViewById(R.id.txtRaio);
        TextView txtReposta = findViewById(R.id.txtAreaCirculoCalculada);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double raioDouble = Double.parseDouble(raio.getText().toString());
                String resposta = "A área é: "+Double.toString(CalculosUtil.calculaAreaCirculo(raioDouble));
                txtReposta.setText(resposta);
                Toast.makeText(CtrlAreaCirculo.this, resposta, Toast.LENGTH_SHORT).show();
            }
        };
        btnCalcular.setOnClickListener(listener);
    }

}
