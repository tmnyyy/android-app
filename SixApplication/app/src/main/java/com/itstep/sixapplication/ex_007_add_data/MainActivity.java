package com.itstep.sixapplication.ex_007_add_data;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;


import androidx.annotation.Nullable;

import com.itstep.sixapplication.R;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends Activity {

    private int id;
    private List<People> peoples;
    private PeopleAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_007_main_layout);

        ListView listView = (ListView) findViewById(R.id.list);
        peoples = getPeopleList();
        LayoutInflater inflater = getLayoutInflater();
        adapter = new PeopleAdapter(peoples, inflater);
        listView.setAdapter(adapter);
    }

    private List<People> getPeopleList() {
        List<People> peoples = new ArrayList<>();

        peoples.add(new People(23, "Andrew", "Android Developer"));
        peoples.add(new People(23, "Roman", "Java Developer"));
        peoples.add(new People(21, "Igor", "C++ Enginear"));

        return peoples;
    }

    public void click(View view) {

        switch (view.getId()) {
            case R.id.add :
                peoples.add(new People(++id, "people " + id, "Programmer " + id));
                break;
            case R.id.remove :
                peoples.remove(peoples.size() - 1);
                id--;
                break;
        }

        adapter.notifyDataSetChanged();

    }


}
