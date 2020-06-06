package com.itstep.sixapplication.ex_008_simple_list_adapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;


import androidx.annotation.Nullable;

import com.itstep.sixapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_003_main_layout);

        int img = R.mipmap.ic_launcher_round;

        MyObj[] myObj = {new MyObj("text1", false, img), new MyObj("text2", true, img),
                new MyObj("text3", false, img), new MyObj("text4", true, img), new MyObj("text5", false, img)};


        List<Map<String, Object>> valuesMapList = new ArrayList<>();
        Map<String, Object> currentMap;

        for (MyObj object : myObj) {
            currentMap = new HashMap<>();
            currentMap.put("text", object.getValue());
            currentMap.put("check", object.isCheck());
            currentMap.put("img", object.getImgId());
            valuesMapList.add(currentMap);
        }

        String[] from = {"text", "check", "img"};
        int[] to = {R.id.textView, R.id.checkbox, R.id.images};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, valuesMapList, R.layout.ex_008_item, from, to);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(simpleAdapter);
    }

    private class MyObj {
        private String value;
        private boolean check;
        private int imgId;

        public MyObj(String value, boolean check, int imgId) {
            this.value = value;
            this.check = check;
            this.imgId = imgId;
        }

        public String getValue() {
            return value;
        }

        public boolean isCheck() {
            return check;
        }

        public int getImgId() {
            return imgId;
        }

    }

}
