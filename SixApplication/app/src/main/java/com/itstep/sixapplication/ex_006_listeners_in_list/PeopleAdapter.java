package com.itstep.sixapplication.ex_006_listeners_in_list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.itstep.sixapplication.R;

import java.util.List;


public class PeopleAdapter extends BaseAdapter {

    private List<People> peoples;
    private LayoutInflater layoutInflater;

    public PeopleAdapter(List<People> peoples, LayoutInflater layoutInflater) {
        this.peoples = peoples;
        this.layoutInflater = layoutInflater;
    }

    @Override
    public int getCount() {
        return peoples.size();
    }

    @Override
    public Object getItem(int position) {
        return peoples.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = layoutInflater.inflate(R.layout.ex_003_people_item, parent, false);
        }

        People people = (People) getItem(position);

        TextView peopleName = (TextView) view.findViewById(R.id.name);
        TextView peopleAge = (TextView) view.findViewById(R.id.age);
        TextView peoplePosition = (TextView) view.findViewById(R.id.position);

        peopleName.setText("Name: " + people.getName());
        peopleAge.setText("Age: " +people.getAge());
        peoplePosition.setText("Position: " + people.getPosition());

        return view;
    }

}
