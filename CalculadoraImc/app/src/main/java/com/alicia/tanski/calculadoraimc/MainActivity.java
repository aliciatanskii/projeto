package com.alicia.tanski.calculadoraimc;

import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    //widgets
    private EditText etAltura;
    private EditText etPeso;
    private Button btnCalcular;

    //objeto

    private Calculadora_Imc cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //referencias
        etAltura = (EditText) findViewById(R.id.home_edt_altura);
        etPeso = (EditText) findViewById(R.id.home_edt_peso);
        btnCalcular = (Button) findViewById(R.id.btn_calcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intanciando

                cal = new Calculadora_Imc();

                cal.setAltura(Double.parseDouble(etAltura.getText().toString()));
                cal.setPeso(Double.parseDouble(etPeso.getText().toString()));


                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle("Resultado");
                msg.setMessage(cal.toString());
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton("Ok", null);
                msg.show();
            }//fecha oncreate
        });//fecha listener
    }//fecha onCreate
}//fecha class
