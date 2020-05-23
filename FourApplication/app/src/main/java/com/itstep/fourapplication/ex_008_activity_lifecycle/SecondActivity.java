package com.itstep.fourapplication.ex_008_activity_lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;

public class SecondActivity extends Activity {

    private final String TAG = "Lifecycle";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_008_second_layout);

        Toast.makeText(getApplicationContext(), "Second: onCreate()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Second: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getApplicationContext(), "Second: onStart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Second: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(), "Second: onResume()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Second: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), "Second: onPause()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Second: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(), "Second: onStop()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Second: onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getApplicationContext(), "Second: onRestart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Second: onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getApplicationContext(), "Second: onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Second: onDestroy()");
    }

    public void exit(View view) {
        finish();
    }

}
