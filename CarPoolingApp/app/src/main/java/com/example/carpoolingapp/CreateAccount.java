package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {
    Intent intent1;
    Intent intent2;
    Button signup;
    Button back;
    EditText fName;
    EditText lname;
    EditText email;
    EditText password;
    EditText conPassword;

    String fNameCheck = "";
    String lnameCheck = "";
    String emailCheck = "";
    String passwordCheck = "";
    String conPasswordCheck = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        signup = findViewById(R.id.button9);
        back = findViewById(R.id.button7);
        fName = findViewById(R.id.firstName);
        lname = findViewById(R.id.lastName);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        conPassword = findViewById(R.id.confirmPassword);

        signup.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                fNameCheck = fName.getText().toString();
                lnameCheck = lname.getText().toString();
                emailCheck = email.getText().toString();
                passwordCheck = password.getText().toString();
                conPasswordCheck = conPassword.getText().toString();

                if(fNameCheck.equals("")){
                    fNameToast();
                }else if(lnameCheck.equals("")){
                    lNameToast();
                }else if(emailCheck.equals("")){
                    emailToast();
                }else if(passwordCheck.equals("")){
                    passwordToast();
                }else if(conPasswordCheck.equals("")){
                    conPasswordToast();
                }else{
                    intent1 = new Intent(CreateAccount.this, Booking.class);
                    startActivity(intent1);
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent2 = new Intent(CreateAccount.this, MainActivity.class);
                startActivity(intent2);
            }
        });

    }
    public void fNameToast()
    {
        Toast.makeText(this, "Please enter a first name", Toast.LENGTH_SHORT).show();
    }
    public void lNameToast()
    {
        Toast.makeText(this, "Please enter an last name", Toast.LENGTH_SHORT).show();
    }
    public void emailToast()
    {
        Toast.makeText(this, "Please enter an email", Toast.LENGTH_SHORT).show();
    }
    public void passwordToast()
    {
        Toast.makeText(this, "Please enter a password", Toast.LENGTH_SHORT).show();
    }
    public void conPasswordToast()
    {
        Toast.makeText(this, "Please confirm password", Toast.LENGTH_SHORT).show();
    }
}