package com.itstep.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class ListExampleFirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ListView listView = (ListView) findViewById(R.id.listView);

        String[] cars = {"Porsche", "Maseratti", "Ferrari", "Lamborghini", "Mercedes-Benz", "BMW"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cars);
        listView.setAdapter(arrayAdapter);
    }

}
