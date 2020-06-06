package com.itstep.sixapplication.ex_013_grid_view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.itstep.sixapplication.R;


public class MainActivity extends Activity {
    private String[] data = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven"};

    private GridView gridView;
    private ArrayAdapter<String> adapter;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_013_main);
        adapter = new ArrayAdapter<String>(this, R.layout.ex_013_item, R.id.textView, data);
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
        adjustGridView();
    }


    private void adjustGridView() {
        //gridView.setNumColumns(3);
//        gridView.setNumColumns(GridView.AUTO_FIT);
//        gridView.setColumnWidth(50);
       gridView.setNumColumns(GridView.AUTO_FIT);
        gridView.setColumnWidth(100);
//        gridView.setVerticalSpacing(5);
//        gridView.setHorizontalSpacing(5);
    }

}
