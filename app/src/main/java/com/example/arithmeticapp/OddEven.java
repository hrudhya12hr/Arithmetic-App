package com.example.arithmeticapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OddEven extends AppCompatActivity {

    EditText e1;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_odd_even);

        e1=(EditText) findViewById(R.id.num);
        b1=(AppCompatButton) findViewById(R.id.oddevenbtn);
        b2=(AppCompatButton) findViewById(R.id.backtomenu);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String getNum1 = e1.getText().toString();

                    int n1 = Integer.parseInt(getNum1);
                    if (n1 % 2 == 0) {
                        Toast.makeText(getApplicationContext(), "EVEN", Toast.LENGTH_SHORT).show();
                    }
                    else if (n1 % 2 != 0){
                        Toast.makeText(getApplicationContext(), "ODD", Toast.LENGTH_SHORT).show();
                    }
                }
                catch(Exception e) {
                    Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_SHORT).show();
                }
            }


        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}