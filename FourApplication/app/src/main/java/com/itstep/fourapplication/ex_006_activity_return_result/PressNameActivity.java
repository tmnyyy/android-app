package com.itstep.fourapplication.ex_006_activity_return_result;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;

public class PressNameActivity extends Activity {

    private EditText nameTxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_006_press_name_layout);

        nameTxt = (EditText) findViewById(R.id.nameTxt);
    }

    public void confirm(View view) {
        Intent intent = new Intent();
        String name = nameTxt.getText().toString();
        intent.putExtra("name", name);
        setResult(RESULT_OK, intent);
        finish();
    }

}
