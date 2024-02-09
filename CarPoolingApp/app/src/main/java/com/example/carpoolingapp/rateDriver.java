package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class rateDriver extends AppCompatActivity {

    Button homeButton;
    Button submitButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_driver);

        homeButton = findViewById(R.id.homeButtonDriver);
        submitButton = findViewById(R.id.submitButtonDriver);

        homeButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent = new Intent(rateDriver.this, Booking.class);
                startActivity(intent);
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                submitButtonToast();
                intent = new Intent(rateDriver.this, Booking.class);
                startActivity(intent);
            }
        });
    }

    public void submitButtonToast()
    {
        Toast.makeText(this, "Rating Submited", Toast.LENGTH_SHORT).show();
    }
}