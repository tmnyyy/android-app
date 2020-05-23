package com.itstep.fourapplication.ex_004_toast_example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;


public class ToastExampleActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_004_toast_example);
    }

    public void showToast(View v) {
        boolean logic = v.getId() == R.id.toast_short;
        String message = (logic) ? "Short message" : "Long message";
        int length = (logic) ? Toast.LENGTH_SHORT : Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(this, message, length);
        toast.show();
    }

}
