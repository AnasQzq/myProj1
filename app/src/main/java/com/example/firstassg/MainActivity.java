package com.example.firstassg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View view) {
        Intent intent = new Intent(this,SecondActivity2.class);
        startActivity(intent);
    }
    public void next2(View view) {
        Intent intent = new Intent(this,ThirdActivity2.class);
        startActivity(intent);
    }

    public void next3(View view) {
        Intent intent = new Intent(this,expectationsActivity.class);
        startActivity(intent);
    }
}