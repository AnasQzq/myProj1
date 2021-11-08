package com.example.firstassg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firstassg.model.Expectations;
import com.google.gson.Gson;

public class expectationsActivity extends AppCompatActivity {
    TextView team;
    TextView year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expectations);
        team=findViewById(R.id.team);
        year=findViewById(R.id.year);
    }

    public void add(View view) {
        Expectations ex = new Expectations(team.getText().toString(),year.getText().toString());
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String data = gson.toJson(ex);

        editor.putString("DATA", data);
        editor.commit();
        Toast.makeText(this, "Thank you !! :)",
                Toast.LENGTH_SHORT).show();

    }
}