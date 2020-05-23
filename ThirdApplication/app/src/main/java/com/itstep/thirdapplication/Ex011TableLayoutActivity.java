package com.itstep.thirdapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;


public class Ex011TableLayoutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex011_table_layout_example);

        TableRow row = (TableRow) findViewById(R.id.table_row);

        Button button = new Button(this);
        button.setText(R.string.hello_world);
        row.addView(button, 2);
    }

}
