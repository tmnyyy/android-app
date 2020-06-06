package com.itstep.sixapplication.ex_009_text_image;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


import androidx.annotation.Nullable;

import com.itstep.sixapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Day {

    private String name;
    private int temperature;

    public Day(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }

}

public class MainActivity extends Activity {

    private final int positive = android.R.drawable.arrow_up_float;
    private final int negative = android.R.drawable.arrow_down_float;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_003_main_layout);

        Day[] days = {new Day("Day1", 0), new Day("Day2", 1), new Day("Day3", -5), new Day("Day4", 14),
                new Day("Day5", -2), new Day("Day6", -3), new Day("Day7", 0), new Day("Day8", 22),
                new Day("Day9", 0), new Day("Day10", -1),};


        List<Map<String, Object>> valuesMapList = new ArrayList<>();
        Map<String, Object> currentMap;

        for (Day day : days) {
            currentMap = new HashMap<>();
            currentMap.put("text", day.getName());
            int temperature = day.getTemperature();
            currentMap.put("value", temperature);
            int img = (temperature == 0) ? 0 :( (temperature > 0) ? positive : negative );
            currentMap.put("img", img);
            valuesMapList.add(currentMap);
        }

        String[] from = {"text", "value", "img"};
        int[] to = {R.id.text2, R.id.text1, R.id.img};

        SimpleAdapter simpleAdapter = new MySimpleAdapter(this, valuesMapList, R.layout.ex_009_item, from, to);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(simpleAdapter);
    }

    private class MySimpleAdapter extends SimpleAdapter {

        public MySimpleAdapter(Context context, List<Map<String, Object>> maps, int idLayout,
                             String[] from, int[] to) {
            super(context, maps, idLayout, from, to);
        }

        @Override
        public void setViewText(TextView v, String text) {
            super.setViewText(v, text);
            if (v.getId() == R.id.text1) {
                int value = Integer.parseInt(text);
                int color = (value > 0) ? Color.GREEN : Color.RED;
                v.setTextColor(color);
            }
        }

        @Override
        public void setViewImage(ImageView v, int value) {
            super.setViewImage(v, value);
            if (value == positive) {
                v.setBackgroundColor(Color.GREEN);
            } else {
                v.setBackgroundColor(Color.RED);
            }
        }

    }

}
