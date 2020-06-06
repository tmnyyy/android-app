package com.itstep.fiveapplication.ex_004_fragments_lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.itstep.fiveapplication.R;


public class MainActivity extends Activity {

    private final String TAG = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_004_main_layout);
        initFragment();

        Toast.makeText(getApplicationContext(), "Activity: onCreate()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onCreate()");
    }

    private void initFragment() {
        getFragmentManager()
                .beginTransaction()
                .add(R.id.frame_layout, new LifecycleFragment())
                .commit();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getApplicationContext(), "Activity: onStart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(), "Activity: onResume()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), "Activity: onPause()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(), "Activity: onStop()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getApplicationContext(), "Activity: onRestart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getApplicationContext(), "Activity: onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onDestroy()");
    }

}
