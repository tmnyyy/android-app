package com.itstep.sixapplication.ex_002_layout_inflater;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.itstep.sixapplication.R;


public class MainActivity extends Activity {

    private final String TAG = "Log";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_002_main_layout);

        LayoutInflater ltInflater = getLayoutInflater();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linLayout);
        View view = ltInflater.inflate(R.layout.ex_002_text, linearLayout, true);
        ViewGroup.LayoutParams lp = view.getLayoutParams();

        Log.d(TAG, "Class of view: " + view.getClass().toString());
        Log.d(TAG, "LayoutParams of view is null: " + (lp == null));
       // Log.d(TAG, "Text of view: " + ((TextView) view).getText());

       // linearLayout.addView(view);
    }

}
