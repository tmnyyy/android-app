package com.itstep.sixapplication.ex_005_multiple_choice;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.itstep.sixapplication.R;


public class MainActivity extends Activity {

    private final String TAG = "MultipleChose";

    private ListView listView;
    private String[] array = {"one", "two", "three", "four", "five", "six"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_004_main_layout);

        listView = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, array);
        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }

    public void click(View view) {
        SparseBooleanArray booleanArray = listView.getCheckedItemPositions();

        for (int i = 0; i < booleanArray.size(); i++) {
            int key = booleanArray.keyAt(i);
            if (booleanArray.get(key)) {
                Log.d(TAG, "click: " + array[i]);
            }
        }
    }

}
