package com.itstep.fourapplication.ex_008_activity_lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.itstep.fourapplication.R;


public class FirstActivity extends Activity {

    private final String TAG = "Lifecycle";
    private TextView touchTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_008_lifecycle_layout);

        touchTxt = (TextView) findViewById(R.id.touch_text);

        Toast.makeText(getApplicationContext(), "First: onCreate()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getApplicationContext(), "First: onStart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(), "First: onResume()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), "First: onPause()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(), "First: onStop()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getApplicationContext(), "First: onRestart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getApplicationContext(), "First: onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onDestroy()");
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.second_activity :
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.touch_me :
                touchTxt.setText("Application is working");
                break;
            default: finish();
        }
    }

}
