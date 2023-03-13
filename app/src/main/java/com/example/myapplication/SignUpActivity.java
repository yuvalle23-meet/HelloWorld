package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    private Button submit;
    private EditText Email;
    private EditText Password;
    private EditText Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        Name = findViewById(R.id.Name);
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (Email.getText().toString().contains("@") && Email.getText().toString().contains(".com") && Password.getText().toString().length() >= 6){
                    Intent intent = new Intent(SignUpActivity.this, HomeActivity.class);
                    intent.putExtra("email",Email.getText().toString());
                    startActivity(intent);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Invalid Email or Password", Toast.LENGTH_SHORT);
                    toast.show();
                };
            }
        });
    }
}