package com.itstep.thirdapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Ex006LinearLayoutHorizonalActivity extends Activity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex006_linear_layout_horizontal);

        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void click(View view) {
        textView.setText("Hello " + editText.getText().toString());
    }

}
