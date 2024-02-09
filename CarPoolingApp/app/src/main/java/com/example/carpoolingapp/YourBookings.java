package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YourBookings extends AppCompatActivity {

    Intent intent1;
    Intent intent2;
    Button simulate;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_bookings);

        simulate = findViewById(R.id.button17);
        home = findViewById(R.id.button15);

        simulate.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent1 = new Intent(YourBookings.this, bookingConfirmation.class);
                startActivity(intent1);
            }
        });
        home.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent2 = new Intent(YourBookings.this, Booking.class);
                startActivity(intent2);
            }
        });
    }
}