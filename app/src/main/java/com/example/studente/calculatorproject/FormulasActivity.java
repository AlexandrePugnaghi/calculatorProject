package com.example.studente.calculatorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormulasActivity extends AppCompatActivity {
    private Button physics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulas);

        physics = findViewById(R.id.buttonPhysics);

        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambioValue();
            }
        });
    }

    public void cambioValue(){
        Intent intent = new Intent(this, PhysicsFormulas.class);
        startActivity(intent);
    }
}
