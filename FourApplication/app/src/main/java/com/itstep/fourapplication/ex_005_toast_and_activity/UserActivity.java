package com.itstep.fourapplication.ex_005_toast_and_activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;


public class UserActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_005_user_layout);

        TextView congratulationTxt;
        congratulationTxt = (TextView) findViewById(R.id.congratulation);

        String message = getIntent().getStringExtra("message");
        congratulationTxt.setText(message);
    }

    public void exit(View view) {
        finish();
    }

}
