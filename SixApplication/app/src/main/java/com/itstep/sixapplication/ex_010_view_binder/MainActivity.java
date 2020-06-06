package com.itstep.sixapplication.ex_010_view_binder;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;


import com.itstep.sixapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends Activity {
    // имена атрибутов для Map
    private final String ATTRIBUTE_NAME_TEXT = "text";
    private final String ATTRIBUTE_NAME_PB = "pb";
    private final String ATTRIBUTE_NAME_LL = "ll";

    private ListView list;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_003_main_layout);

        // массив данных
        int load[] = { 41, 48, 22, 35, 30, 67, 51, 88 };

        // упаковываем данные в понятную для адаптера структуру
        ArrayList<Map<String, Object>> data = new ArrayList<Map<String, Object>>(
                load.length);
        Map<String, Object> m;
        for (int i = 0; i < load.length; i++) {
            m = new HashMap<String, Object>();
            m.put(ATTRIBUTE_NAME_TEXT, "Day " + (i+1) + ". Load: " + load[i] + "%");
            m.put(ATTRIBUTE_NAME_PB, load[i]);
            m.put(ATTRIBUTE_NAME_LL, load[i]);
            data.add(m);
        }

        // массив имен атрибутов, из которых будут читаться данные
        String[] from = { ATTRIBUTE_NAME_TEXT, ATTRIBUTE_NAME_PB,
                ATTRIBUTE_NAME_LL };
        // массив ID View-компонентов, в которые будут вставлять данные
        int[] to = { R.id.textView, R.id.progressBar, R.id.linearLayout };

        // создаем адаптер
        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.ex_010_item,
                from, to);
        // Указываем адаптеру свой биндер
        adapter.setViewBinder(new MyViewBinder());

        // определяем список и присваиваем ему адаптер
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }

    class MyViewBinder implements SimpleAdapter.ViewBinder {

        int red = getResources().getColor(R.color.red);
        int orange = getResources().getColor(R.color.orange);
        int green = getResources().getColor(R.color.green);

        @Override
        public boolean setViewValue(View view, Object data,
                                    String textRepresentation) {
            int i = 0;
            switch (view.getId()) {
                // LinearLayout
                case R.id.linearLayout:
                    i = ((Integer) data).intValue();
                    if (i < 40) view.setBackgroundColor(green);
                    else if (i < 70) view.setBackgroundColor(orange);
                    else
                        view.setBackgroundColor(red);
                    return true;
                // ProgressBar
                case R.id.progressBar:
                    i = ((Integer) data).intValue();
                    ((ProgressBar)view).setProgress(i);
                    return true;
            }
            return false;
        }
    }

}
