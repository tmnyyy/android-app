package com.itstep.sixapplication.ex_001_simple_list;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.itstep.sixapplication.R;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_001_main_layout);

        ListView list = (ListView) findViewById(R.id.list);
        String[] array = {"one", "two", "three", "four", "five", "six"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);
        list.setAdapter(adapter);
    }

}
