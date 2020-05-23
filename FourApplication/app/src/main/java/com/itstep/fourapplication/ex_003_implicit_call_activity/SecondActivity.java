package com.itstep.fourapplication.ex_003_implicit_call_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex001_second_layout);
    }

    public void goToNewActivity(View v) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

}
