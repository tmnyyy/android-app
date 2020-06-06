package com.itstep.sixapplication.ex_003_custom_item;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ListView;


import androidx.annotation.Nullable;

import com.itstep.sixapplication.R;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_003_main_layout);

        ListView listView = (ListView) findViewById(R.id.list);
        List<People> peoples = getPeopleList();
        LayoutInflater inflater = getLayoutInflater();
        PeopleAdapter adapter = new PeopleAdapter(peoples, inflater);
        listView.setAdapter(adapter);
    }

    private List<People> getPeopleList() {
        List<People> peoples = new ArrayList<>();

        peoples.add(new People(23, "Andrew", "Android Developer"));
        peoples.add(new People(23, "Roman", "Java Developer"));
        peoples.add(new People(21, "Igor", "C++ Enginear"));

        return peoples;
    }

}
