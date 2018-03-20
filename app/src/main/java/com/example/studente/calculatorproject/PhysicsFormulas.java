package com.example.studente.calculatorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.studente.calculatorproject.R.id.buttonCalcola;
import static com.example.studente.calculatorproject.R.id.valoreA;
import static com.example.studente.calculatorproject.R.id.valoreT;
import static com.example.studente.calculatorproject.R.id.valoreV0;

public class PhysicsFormulas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_formulas);

        View calculation = findViewById(buttonCalcola);
        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Velocity();
            }
        });
    }

    private void Velocity(){
        double time, vel, acc, ris;
        EditText V0=(EditText) findViewById(R.id.valoreV0);
        EditText T =(EditText) findViewById(R.id.valoreT);
        EditText A =(EditText) findViewById(R.id.valoreA);
        TextView Ris = (TextView) findViewById(R.id.risultato);

        vel=Double.parseDouble(V0.getText().toString());
        time=Double.parseDouble(T.getText().toString());
        acc=Double.parseDouble(A.getText().toString());

        ris=vel+(time*acc);
        Ris.setText(""+(int) ris);

    }
}
