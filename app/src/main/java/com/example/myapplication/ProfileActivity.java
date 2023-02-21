package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ProfileActivity extends AppCompatActivity {
    public TextView nameView;
    public TextView emailView;
    public ImageView ImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String email = intent.getStringExtra("Email");
        String src = intent.getStringExtra("Src");
        nameView = findViewById(R.id.name);
        emailView = findViewById(R.id.email);
        nameView.setText(name);
        emailView.setText(email);


}}