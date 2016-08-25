package com.example.estudiante.leccion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class segunda extends AppCompatActivity {

    private TextView txtmuestra;
    private String nombre="";
    private Button btnjugar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtmuestra=(TextView)findViewById(R.id.txtmuestra);
        nombre = getIntent().getStringExtra("nombre");
        txtmuestra.setText(nombre.toString());

        btnjugar=(Button)findViewById(R.id.btnjugar);

        btnjugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(segunda.this, jugar.class);
                i.putExtra("nombre", nombre.toString());
                startActivity(i);


            }
        });

    }
}
