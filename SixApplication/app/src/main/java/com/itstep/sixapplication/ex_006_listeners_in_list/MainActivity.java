package com.itstep.sixapplication.ex_006_listeners_in_list;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.Nullable;

import com.itstep.sixapplication.R;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private final String TAG = "Listeners";
    private List<People> peoples;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_003_main_layout);

        ListView listView = (ListView) findViewById(R.id.list);
        peoples = getPeopleList();
        LayoutInflater inflater = getLayoutInflater();
        PeopleAdapter adapter = new PeopleAdapter(peoples, inflater);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
         People people = peoples.get(position);
         Log.d(TAG, "onItemClick: " + people.getName() + " " + people.getAge() + " " + people.getPosition());

         TextView name = (TextView) view.findViewById(R.id.name);
         TextView age = (TextView) view.findViewById(R.id.age);
         TextView pos = (TextView) view.findViewById(R.id.position);

         Log.d(TAG, "Elements from TextView: " + name.getText() + " " + age.getText() + " " + pos.getText());
        Toast.makeText(this, "Elements from TextView: " + name.getText() + " " + age.getText() + " " + pos.getText(),
                Toast.LENGTH_SHORT).show();
    }

    private List<People> getPeopleList() {
        List<People> peoples = new ArrayList<>();

        peoples.add(new People(23, "Andrew", "Android Developer"));
        peoples.add(new People(23, "Roman", "Java Developer"));
        peoples.add(new People(21, "Igor", "C++ Enginear"));
        peoples.add(new People(23, "Andrew", "Android Developer"));
        peoples.add(new People(23, "Roman", "Java Developer"));
        peoples.add(new People(21, "Igor", "C++ Enginear"));
        peoples.add(new People(23, "Andrew", "Android Developer"));
        peoples.add(new People(23, "Roman", "Java Developer"));
        peoples.add(new People(21, "Igor", "C++ Enginear"));
        peoples.add(new People(23, "Andrew", "Android Developer"));
        peoples.add(new People(23, "Roman", "Java Developer"));
        peoples.add(new People(21, "Igor", "C++ Enginear"));
        peoples.add(new People(23, "Andrew", "Android Developer"));
        peoples.add(new People(23, "Roman", "Java Developer"));
        peoples.add(new People(21, "Igor", "C++ Enginear"));


        return peoples;
    }

}
