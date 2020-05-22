package com.itstep.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class HelloNameActivity extends Activity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_name_layout);

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
    }

    public void clickButton(View view) {
        String text = editText.getText().toString();
        textView.setText("Hello " + text + "!");
    }

}
