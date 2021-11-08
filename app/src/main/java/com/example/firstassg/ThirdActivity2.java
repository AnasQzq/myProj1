package com.example.firstassg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.firstassg.model.Interface;
import com.example.firstassg.model.factory;

import java.util.ArrayList;

public class ThirdActivity2 extends AppCompatActivity {
    factory fac = new factory();
    Interface obj = fac.getModel();
    Spinner spinner;
    ListView list;
    private ArrayAdapter<String> arrayAdapter;
    private ArrayList<String> arr;
    private ArrayAdapter<String> arrayAdapterList;
    private ArrayList<String> arrList;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third2);
        list =(ListView) findViewById(R.id.lis2);
        spinner = findViewById(R.id.spinner2);
        arr = new ArrayList<>();
        for (int i = 0; i < obj.getAllWorld().size(); i++) {
            arr.add(obj.getAllWorld().get(i).getYear());
        }
        arrayAdapter = new ArrayAdapter<String>(ThirdActivity2.this, android.R.layout.simple_spinner_dropdown_item, arr);
        spinner.setAdapter(arrayAdapter);
    }

    public void showResult(View view) {
        String str = spinner.getSelectedItem().toString();
        arrList = new ArrayList<>();
        for (int i = 0; i < obj.getWorld(str).size(); i++) {

            arrList.add(obj.getWorld(str).get(i).getStr());

        }
        arrayAdapterList = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, arrList);
        list.setAdapter(arrayAdapterList);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }
}