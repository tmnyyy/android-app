package com.itstep.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class HelloAndCleanActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_and_clean_layout);

        textView = (TextView) findViewById(R.id.textView);

    }

    public void click(View view) {
        String text = " ";

        if (view.getId() == R.id.button) {
            text = getResources().getString(R.string.text);
        }

        textView.setText(text);
    }

}
