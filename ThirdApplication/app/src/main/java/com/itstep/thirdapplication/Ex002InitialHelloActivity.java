package com.itstep.thirdapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Ex002InitialHelloActivity extends Activity {

    private LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex002_initial_hello_layout);
        linearLayout = (LinearLayout) findViewById(R.id.layout);
    }

    public void click(View view) {
        Button button = new Button(this);
        button.setText(R.string.say_hello);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        button.setLayoutParams(params);
        final TextView textView = new TextView(this);
        textView.setGravity(Gravity.CENTER);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(R.string.hello_world);
            }
        });
        linearLayout.addView(textView);
        linearLayout.addView(button);
    }

}
