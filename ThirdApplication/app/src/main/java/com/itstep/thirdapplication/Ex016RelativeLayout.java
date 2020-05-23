package com.itstep.thirdapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Ex016RelativeLayout extends Activity {

    private Button hourUp;
    private Button hourDown;
    private Button minUp;
    private Button minDown;
    private TextView hours;
    private TextView minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex016_relative_layout);

        hourUp = (Button) findViewById(R.id.button8);
        hourDown = (Button) findViewById(R.id.button5);
        minUp = (Button) findViewById(R.id.button4);
        minDown = (Button) findViewById(R.id.button9);

        hours = (TextView) findViewById(R.id.textView4);
        minutes = (TextView) findViewById(R.id.textView6);

    }

    public void click(View view) {
        String hourTxt = hours.getText().toString();
        String minTxt = minutes.getText().toString();
        int hour = Integer.parseInt(hourTxt);
        int min = Integer.parseInt(minTxt);

        switch (view.getId()) {
            case R.id.button8 : hour = resultPlus(hour, true);
                        hours.setText(String.valueOf(hour));
                break;
            case R.id.button5 : hour = resultMinus(hour, true);
                   hours.setText(String.valueOf(hour));
                break;
            case R.id.button4 : min = resultPlus(min, false);
                   minutes.setText(String.valueOf(min));
                break;
            case R.id.button9 : min = resultMinus(min, false);
                 minutes.setText(String.valueOf(min));
                break;
        }

     }

    private int resultPlus(int value, boolean isHour) {
        int maxValue = (isHour) ? 23 : 59;

        value++;

        if (value > maxValue) {
            value = 0;
        }

        return value;
    }

    private int resultMinus(int value, boolean isHour) {
        int maxValue = (isHour) ? 23 : 59;

        value--;

        if (value < 0) {
            value = maxValue;
        }

        return value;
    }

}
