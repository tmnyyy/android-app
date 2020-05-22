package com.itstep.activityexample.object.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


import com.itstep.activityexample.R;
import com.itstep.activityexample.object.adapter.CarAdapter;
import com.itstep.activityexample.object.pojo.Car;

import java.util.ArrayList;
import java.util.List;


public class ListExampleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        ListView listView = (ListView) findViewById(R.id.listView);
        List<Car> items = items();
        CarAdapter carAdapter = new CarAdapter(this, items);
        listView.setAdapter(carAdapter);
    }

    private List<Car> items() {
        List<Car> items = new ArrayList<>();

        items.add(new Car("Porsche", 310, 3.6));
        items.add(new Car("Maseratti", 285, 4.7));
        items.add(new Car("Ferrari", 325, 4.5));
        items.add(new Car("Lamborghini", 325, 5.2));
        items.add(new Car("Mercedes-Banz", 300, 6.3));
        items.add(new Car("BMW", 280, 4.2));
        items.add(new Car("Audi", 250, 3.2));

        return items;
    }
}
