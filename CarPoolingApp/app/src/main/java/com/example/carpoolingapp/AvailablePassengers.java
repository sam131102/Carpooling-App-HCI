package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class AvailablePassengers extends AppCompatActivity {
    Intent intent1;
    Intent intent2;
    Button home;
    Button start;
    CheckBox c1;
    CheckBox c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_passengers);


        home = findViewById(R.id.button10);
        start = findViewById(R.id.button8);
        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);

        home.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent1 = new Intent(AvailablePassengers.this, Booking.class);
                startActivity(intent1);
            }
        });
        start.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {

                if (!c1.isChecked() && !c2.isChecked()){
                    toast();
                }else{
                    intent2 = new Intent(AvailablePassengers.this, bookingSummary.class);
                    startActivity(intent2);
                }

            }
        });

    }
    public void toast()
    {
        Toast.makeText(this, "Please check a box to accept a job", Toast.LENGTH_SHORT).show();
    }
}