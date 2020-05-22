package com.itstep.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;



public class ListExampleSecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        ListView listView = (ListView) findViewById(R.id.listView);
        List<String> items = getItems();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(arrayAdapter);
    }

    private List<String> getItems() {
        List<String> items = new ArrayList<>();

        items.add("Porsche");
        items.add("Maserati");
        items.add("Ferrari");
        items.add("Lamborghini");
        items.add("Mercedes-Benz");
        items.add("BMW");

        return items;
    }

}
