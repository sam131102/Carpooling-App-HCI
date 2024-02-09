package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Booking extends AppCompatActivity {
    Intent intent1;
    Intent intent2;
    Intent intent3;
    Intent intent4;
    Button driver;
    Button passenger;
    Button viewBookings;
    Button settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        driver = findViewById(R.id.button);
        passenger = findViewById(R.id.button5);
        viewBookings = findViewById(R.id.button16);
        settings = findViewById(R.id.button6);

        driver.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent1 = new Intent(Booking.this, AvailablePassengers.class);
                startActivity(intent1);
            }
        });
        passenger.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent2 = new Intent(Booking.this, PlaceBookingView.class);
                startActivity(intent2);
            }
        });
        viewBookings.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent3 = new Intent(Booking.this, YourBookings.class);
                startActivity(intent3);
            }
        });
        settings.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent4 = new Intent(Booking.this, settings.class);
                startActivity(intent4);
            }
        });
    }
}