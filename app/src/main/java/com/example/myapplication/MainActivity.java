package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView SignInText;
    private EditText Email;
    private EditText Password;
    private Button signin;
    private Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SignInText = findViewById(R.id.textView);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        signin = findViewById(R.id.button);
        signup = findViewById(R.id.button2);
        signin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (Email.getText().toString().contains("@") && Email.getText().toString().contains(".com") && Password.getText().toString().length() == 6)
                    SignInText.setText(Email.getText().toString());
            }
        });
        signup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(MainActivity.this, "Signup is under construction", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}