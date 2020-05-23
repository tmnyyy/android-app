package com.itstep.fourapplication.ex_006_activity_return_result;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;


public class ChangeLanguageActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_006_chose_language_layout);
    }

    public void chose(View view) {
        Button button = (Button) view;
        String language = button.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("language", language);
        setResult(RESULT_OK, intent);
        finish();
    }
}
