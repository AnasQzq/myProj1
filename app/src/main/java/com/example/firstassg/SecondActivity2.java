package com.example.firstassg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.firstassg.model.Interface;
import com.example.firstassg.model.factory;

import java.util.ArrayList;

public class SecondActivity2 extends AppCompatActivity {
    factory fac =new factory();
    Interface obj = fac.getModel();
    Spinner spinner;
    ListView list;
    private ArrayAdapter<String> arrayAdapter;
    private ArrayList<String> arr;
    private ArrayAdapter<String> arrayAdapterList;
    private ArrayList<String> arrList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        list=(ListView) findViewById(R.id.list1);
        spinner=findViewById(R.id.spinner);
        arr = new ArrayList<>();
        for (int i = 0; i < obj.getAllChampions().size(); i++) {
            arr.add(obj.getAllChampions().get(i).getName());
        }
        arrayAdapter = new ArrayAdapter<String>(SecondActivity2.this, android.R.layout.simple_spinner_dropdown_item, arr);
        spinner.setAdapter(arrayAdapter);
    }

    public void showResult(View view) {
        Thread thread = new Thread(new threadclass(10));
        thread.start();
        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
        String str =spinner.getSelectedItem().toString();
        arrList = new ArrayList<>();
        for (int i = 0; i < obj.getChampions(str).size(); i++) {
            for (int j=0;j<obj.getChampions(str).get(i).getInfo().size();j++) {
                arrList.add(obj.getChampions(str).get(i).getInfo().get(j));
            }
        }
        arrayAdapterList = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arrList);
        list.setAdapter(arrayAdapterList);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });






    }










    class threadclass implements Runnable {
        int seconds;

        public threadclass(int seconds) {
            this.seconds = seconds;
        }

        @Override
        public void run() {

            for (int i = 0; i < seconds; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}