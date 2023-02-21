package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private TextView welcome;
    private ListView listView;
    private ArrayList<User> user;
    private ArrayAdapter<User> arrayAdapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        welcome = findViewById(R.id.welcome);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        welcome.setText(welcome.getText().toString()+' '+email.toString());
        listView = findViewById(R.id.user_list);
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Antony","antony.saleh2017@gnnail.com","123456",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Keeshond_Sibirian_Husky_crossbreed_puppy.jpg/1200px-Keeshond_Sibirian_Husky_crossbreed_puppy.jpg"));
        users.add(new User("Tareq","tareq.othmam17@gnnail.com","qwerty",
        "https://i.natgeofe.com/n/548467d8-c5f1-4551-9f58-6817a8d2c45e/NationalGeographic_2572187_square.jpg"));
        arrayAdapter = new UserArrayAdapter(this, R.layout.custom_row, users);
        listView.setAdapter(arrayAdapter);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        if (id == R.id.signout){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        return true;
    };

}