package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent intent1;
    Intent intent2;
    Button loginButton;
    Button create;
    Button forgotPassword;
    EditText email;
    EditText password;

    String emailCheck = "";
    String passwordCheck = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.button2);
        create = findViewById(R.id.button3);
        forgotPassword = findViewById(R.id.button4);
        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);

        loginButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                emailCheck = email.getText().toString();
                passwordCheck = password.getText().toString();

                if(emailCheck.equals("")){
                    emailToast();
                }else if(passwordCheck.equals("")){
                    passwordToast();
                }else{
                    intent1 = new Intent(MainActivity.this, Booking.class);
                    startActivity(intent1);
                }
            }
        });
        create.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent2 = new Intent(MainActivity.this, CreateAccount.class);
                startActivity(intent2);
            }
        });
        forgotPassword.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                forgotPasswordToast();
            }
        });

    }

    public void forgotPasswordToast()
    {
        Toast.makeText(this, "An email has been sent to reset your password", Toast.LENGTH_SHORT).show();
    }
    public void passwordToast()
    {
        Toast.makeText(this, "Please enter a password", Toast.LENGTH_SHORT).show();
    }
    public void emailToast()
    {
        Toast.makeText(this, "Please enter an email", Toast.LENGTH_SHORT).show();
    }

}