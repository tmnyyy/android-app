package com.itstep.fourapplication.ex_001_change_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;


public class FirstActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex001_first_layout);

    }

    public void goToNewActivity(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
