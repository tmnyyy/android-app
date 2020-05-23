package com.itstep.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class ClickButtonActivity2 extends Activity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.click_button_layout2);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = getResources().getString(R.string.text);
                textView.setText(text);
            }
        });
    }
}
