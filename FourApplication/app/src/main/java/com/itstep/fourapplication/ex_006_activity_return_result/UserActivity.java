package com.itstep.fourapplication.ex_006_activity_return_result;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;
import com.itstep.fourapplication.ex_006_activity_return_result.utils.RequestCode;

public class UserActivity extends Activity {

    private TextView nameTxt;
    private TextView languageTxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_006_user_layout);

        nameTxt = (TextView) findViewById(R.id.name);
        languageTxt = (TextView) findViewById(R.id.language);
    }

    public void settings(View view) {
        boolean logic = view.getId() == R.id.nameBtn;
        Intent intent = (logic) ? new Intent(this, PressNameActivity.class) : new Intent(this, ChangeLanguageActivity.class);
        int result = (logic) ? RequestCode.NAME : RequestCode.LANGUAGE;
        startActivityForResult(intent, result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {

            switch (requestCode) {
                case RequestCode.NAME :
                    String name = data.getStringExtra("name");
                    nameTxt.setText("Your name : " + name);
                    break;
                case RequestCode.LANGUAGE :
                    String language = data.getStringExtra("language");
                    languageTxt.setText("Your language : " + language);
                    break;
            }

        } else {
            Toast.makeText(this, "Error get data", Toast.LENGTH_SHORT).show();
        }
    }

}
