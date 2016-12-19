package com.alicia.tanski.calculadoraimc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1 extends AppCompatActivity {

    //widgets
    private Button btn_abrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        //referencias
        btn_abrir = (Button) findViewById(R.id.btn_abrir);

        btn_abrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  it = new Intent(Tela1.this, MainActivity.class);
                startActivity(it);
                finish();
            }//fecha onCreate
        });//fecha listener

    }//fecha onCreate
}//fecha class
