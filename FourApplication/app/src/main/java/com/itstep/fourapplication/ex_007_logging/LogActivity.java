package com.itstep.fourapplication.ex_007_logging;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;


public class LogActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String TAG = "TAG";

        Log.i(TAG, "onCreate: Info");
        Log.w(TAG, "onCreate: Warining");
        Log.d(TAG, "onCreate: Debug");
        Log.v(TAG, "onCreate: Verbose");
        Log.e(TAG, "onCreate: Exception", new Exception("My Exception"));
    }

}
