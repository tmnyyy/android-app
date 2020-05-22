package com.itstep.activityexample.object.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.itstep.activityexample.R;
import com.itstep.activityexample.object.pojo.Car;

import java.util.List;


public class CarAdapter extends BaseAdapter {

    private List<Car> cars;
    private LayoutInflater layoutInflater;

    public CarAdapter(Context context, List<Car> cars) {
        this.cars = cars;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return cars.size();
    }

    @Override
    public Object getItem(int position) {
        return cars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = layoutInflater.inflate(R.layout.car_item_layout, parent, false);
        }

        Car car = (Car) getItem(position);

        TextView carName = (TextView) view.findViewById(R.id.car_name);
        TextView carSpeed = (TextView) view.findViewById(R.id.car_speed);
        TextView carEngine = (TextView) view.findViewById(R.id.car_engine);

        carName.setText("Model: " + car.getModel());
        carSpeed.setText("Top speed: " + car.getMaxSpeed());
        carEngine.setText("Engine value: " + car.getEngineValue());


        return view;
    }

}
