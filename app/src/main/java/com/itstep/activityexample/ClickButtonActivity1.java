package com.itstep.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class ClickButtonActivity1 extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.click_button_layout1);

        textView = (TextView) findViewById(R.id.textView);
    }

    public void click(View view) {
        textView.setText("Hello World!");
    }

}
