package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PlaceBookingView extends AppCompatActivity {

    Intent intent1;
    Intent intent2;
    Button home;
    Button bookNow;

    String pickupAddress = "";
    String dropoffAddress = "";
    String date = "";
    String time = "";
    String payment = "0";

    EditText editTextPickupAddress;
    EditText editTextDropoffAddress;
    EditText editTextDate;
    EditText editTextTime;
    EditText editTextPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_booking_view);

        home = findViewById(R.id.button12);
        bookNow = findViewById(R.id.button11);
        editTextPickupAddress = findViewById(R.id.pickupAddress);
        editTextDropoffAddress = findViewById(R.id.dropoffAddress);
        editTextDate = findViewById(R.id.pickupDate);
        editTextTime = findViewById(R.id.pickupTime);
        editTextPayment = findViewById(R.id.payment);


        home.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent1 = new Intent(PlaceBookingView.this, Booking.class);
                startActivity(intent1);
            }
        });
        bookNow.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {

                pickupAddress = editTextPickupAddress.getText().toString();
                dropoffAddress = editTextDropoffAddress.getText().toString();
                date = editTextDate.getText().toString();
                time = editTextTime.getText().toString();
                if(!editTextPayment.getText().toString().equals(""))
                    payment = editTextPayment.getText().toString();


                if(pickupAddress.equals("")){
                    pickupAddressToast();
                }
                else if(dropoffAddress.equals("")){
                    dropoffAddressToast();
                }
                else if(date.equals("")){
                    dateToast();
                }
                else if(time.equals("")){
                    timeToast();
                }
                else if(Double.parseDouble(payment) < 1){
                    paymentToast();
                }
                else{
                    intent2 = new Intent(PlaceBookingView.this, YourBookings.class);
                    startActivity(intent2);
                }
            }
        });
    }

    public void pickupAddressToast()
    {
        Toast.makeText(this, "Please Enter a Pickup Address", Toast.LENGTH_SHORT).show();
    }

    public void dropoffAddressToast()
    {
        Toast.makeText(this, "Please Enter an Arrival Address", Toast.LENGTH_SHORT).show();
    }

    public void dateToast()
    {
        Toast.makeText(this, "Please Enter a Pickup Date", Toast.LENGTH_SHORT).show();
    }

    public void timeToast()
    {
        Toast.makeText(this, "Please Enter a Pickup Time", Toast.LENGTH_SHORT).show();
    }

    public void paymentToast()
    {
        Toast.makeText(this, "Please Enter a Payment Offer", Toast.LENGTH_SHORT).show();
    }
}