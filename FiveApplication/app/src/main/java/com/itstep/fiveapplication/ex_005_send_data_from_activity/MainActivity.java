package com.itstep.fiveapplication.ex_005_send_data_from_activity;

import android.app.Activity;
import android.os.Bundle;

import com.itstep.fiveapplication.R;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_005_main_layout);

        DataFragment dataFragment = DataFragment.getInstance("Hello World!");
        getFragmentManager().beginTransaction().add(R.id.frame_layout, dataFragment).commit();
    }

}
