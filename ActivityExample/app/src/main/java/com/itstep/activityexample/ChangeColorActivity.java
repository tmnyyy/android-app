package com.itstep.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class ChangeColorActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_text_color);

        textView = (TextView) findViewById(R.id.textView);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.blue_button: textView.setTextColor(getResources().getColor(R.color.btn_text));
                break;
            case R.id.pink_button : textView.setTextColor(getResources().getColor(R.color.colorAccent));
                break;
            case R.id.red_button : textView.setTextColor(getResources().getColor(R.color.text));
        }

    }

}
