package com.itstep.thirdapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Ex012LoginActivity extends Activity {

    private TextView textView;
    private EditText login;
    private EditText password;
    private String realLogin;
    private String realPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex012_login);

        realLogin = "Admin";
        realPassword = "a072se";

        textView = (TextView) findViewById(R.id.textView);
        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
    }

    public void click(View view) {
        String loginTxt = login.getText().toString();
        String passwordTxt = password.getText().toString();
        String text = (loginTxt.equals(realLogin) && passwordTxt.equals(realPassword) ) ? loginTxt + " you entred succsessful" : " Incorrected login or password";
        textView.setText(text);
    }
}
