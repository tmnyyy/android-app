package com.itstep.fourapplication.ex_002_send_data_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;


public class CheckContentActivity extends Activity {

    private TextView checkText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_002_check_content_layout);

        checkText = (TextView) findViewById(R.id.check_content);

        String name = getIntent().getStringExtra("name");
        int age = getIntent().getIntExtra("age", 0);

        checkAge(age, name);
    }


    private void checkAge(int age, String name) {
        if (age >= 18) {
            checkText.setText("Hello " + name + " your age: " + age);
        } else {
            checkText.setText("You are don't have 18. Go to sleep");
        }
    }

    public void goToNewActivity(View v) {
        Intent intent = new Intent(this, HelloNameActivity.class);
        startActivity(intent);
    }

}
