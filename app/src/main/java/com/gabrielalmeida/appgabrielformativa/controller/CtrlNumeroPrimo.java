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

public class CtrlNumeroPrimo extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_primo);

        EditText txtNumero   = findViewById(R.id.txtNumeroPrimo);
        TextView txtResposta = findViewById(R.id.txtNumeroPrimoResposta);
        Button btnCalcular   = findViewById(R.id.btnVerificaNumeroPrimo);

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String resposta;
                String numero = txtNumero.getText().toString();
                if (CalculosUtil.verificaNumeroPrimo(Integer.parseInt(numero)))
                    resposta = "O número ["+numero+"] informado é primo ";
                else
                    resposta = "O número ["+numero+"] informado não é primo";
                txtResposta.setText(resposta);
                Toast.makeText(CtrlNumeroPrimo.this, resposta, Toast.LENGTH_SHORT).show();
            }
        };
        btnCalcular.setOnClickListener(listener);
    }

}
