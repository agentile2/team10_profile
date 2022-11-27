package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
            EditText etName, etGradYear, etCurrentMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.editTextName);
        etGradYear = findViewById(R.id.editTextGradYear);
        etCurrentMe = findViewById(R.id.editText_currentMe);
        Button createProfile = findViewById(R.id.createProfile);
        createProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                String year = etGradYear.getText().toString().trim();
                String currentMe = etCurrentMe.getText().toString().trim();
                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                bundle.putString("year", year);
                bundle.putString("currentMe", currentMe);
                Intent intent = new Intent(MainActivity.this, CreateProfile.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}
