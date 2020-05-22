package com.itstep.activityexample;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ChangeBackGroundActivity extends Activity {

    private TextView textView;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.change_background_color);

        textView = (TextView) findViewById(R.id.textView);
        linearLayout  = (LinearLayout) findViewById(R.id.layout);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.blue_button : textView.setTextColor(getResources().getColor(R.color.btn_text));
                break;
            case R.id.pink_button : textView.setTextColor(getResources().getColor(R.color.colorAccent));
                break;
            case R.id.red_button : textView.setTextColor(getResources().getColor(R.color.text));
                break;
            case R.id.backgound_color : changeBackgroundColor();

        }

    }

    private void changeBackgroundColor() {
        Drawable background = linearLayout.getBackground();
        int color = getResources().getColor(R.color.white);

        if (background.getClass() == ColorDrawable.class)
            color = ((ColorDrawable)background).getColor();

        if (color != getResources().getColor(R.color.green)) {
            linearLayout.setBackgroundColor(getResources().getColor(R.color.green));
        } else {
            linearLayout.setBackgroundColor(getResources().getColor(R.color.white));
        }

    }

}
