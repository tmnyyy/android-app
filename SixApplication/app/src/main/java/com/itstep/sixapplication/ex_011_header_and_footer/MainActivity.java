package com.itstep.sixapplication.ex_011_header_and_footer;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.itstep.sixapplication.R;


public class MainActivity extends Activity {
    final String LOG_TAG = "Log";

    private String[] data = {"one", "two", "three", "four", "five"};
    private ListView list;
    private ArrayAdapter<String> adapter;

    private View header1;
    private View header2;

    private View footer1;
    private View footer2;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_011_main);

        list = (ListView) findViewById(R.id.list);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        // создаем Header и Footer
        header1 = createHeader("header 1");
        header2 = createHeader("header 2");
        footer1 = createFooter("footer 1");
        footer2 = createFooter("footer 2");

        fillList();

    }

    // формирование списка
    void fillList() {
        list.addHeaderView(header1);
        list.addHeaderView(header2, "some text for header 2", false);
        list.addFooterView(footer1);
        list.addFooterView(footer2, "some text for footer 2", false);
        list.setAdapter(adapter);
    }

    // нажатие кнопки
    public void onClick(View v) {
//        list.removeHeaderView(header2);
//        list.removeFooterView(footer2);
        Object obj;
        HeaderViewListAdapter adapter = (HeaderViewListAdapter) list.getAdapter();
        obj = adapter.getItem(1);
        Log.d(LOG_TAG, "adapter.getItem(1) = " + obj.toString());
        obj = adapter.getItem(4);
        Log.d(LOG_TAG, "adapter.getItem(4) = " + obj.toString());

        ArrayAdapter<String> arrayAdapter = (ArrayAdapter<String>) adapter.getWrappedAdapter();
        obj =  arrayAdapter.getItem(1);
        Log.d(LOG_TAG, "arrayAdapter.getItem(1) = " + obj.toString());
        obj =  arrayAdapter.getItem(4);
        Log.d(LOG_TAG, "arrayAdapter.getItem(4) = " + obj.toString());
    }

    // создание Header
    View createHeader(String text) {
        View v = getLayoutInflater().inflate(R.layout.ex_011_header, null);
        ((TextView)v.findViewById(R.id.text)).setText(text);
        return v;
    }

    // создание Footer
    View createFooter(String text) {
        View v = getLayoutInflater().inflate(R.layout.ex_011_footer, null);
        ((TextView)v.findViewById(R.id.text)).setText(text);
        return v;
    }
}
