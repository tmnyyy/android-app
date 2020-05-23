package com.itstep.fourapplication.ex_002_send_data_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;


public class HelloNameActivity extends Activity {

    private EditText nameTxt;
    private EditText ageTxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_002_hello_name_layout);

        nameTxt = (EditText) findViewById(R.id.name);
        ageTxt = (EditText) findViewById(R.id.age);
    }

    public void goToNewActivity(View v) {
        Intent intent = new Intent(this, CheckContentActivity.class);
        int age = Integer.valueOf(ageTxt.getText().toString());
        intent.putExtra("name", nameTxt.getText().toString());
        intent.putExtra("age", age);
        startActivity(intent);
    }

}
