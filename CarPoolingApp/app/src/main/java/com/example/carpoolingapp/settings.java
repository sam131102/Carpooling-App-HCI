package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class settings extends AppCompatActivity {

    Button homeButton;
    Button logoutButton;
    Button deleteAccountButton;
    Intent intent;
    int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        homeButton = findViewById(R.id.homeButtonSettings);
        logoutButton = findViewById(R.id.logoutButton);
        deleteAccountButton = findViewById(R.id.deleteAccountButton);

        homeButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent = new Intent(settings.this, Booking.class);
                startActivity(intent);
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent = new Intent(settings.this, MainActivity.class);
                startActivity(intent);
            }
        });

        deleteAccountButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                counter--;
                if(counter < 0) {
                    intent = new Intent(settings.this, CreateAccount.class);
                    startActivity(intent);
                }
                else deleteAccountToast();
            }
        });
    }

    public void deleteAccountToast()
    {
        Toast.makeText(this, "Are you sure you want to delete your account? Press again to confirm", Toast.LENGTH_SHORT).show();
    }
}