package com.itstep.fiveapplication.ex_003_fragments_and_activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.itstep.fiveapplication.R;


public class MainActivity extends Activity implements View.OnClickListener {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_003_main_layout);

        textView = (TextView) findViewById(R.id.result);

        initSecondFragment();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Fragment fragment = getFragmentManager().findFragmentById(R.id.first_fragment);
        Button button = (Button) fragment.getView().findViewById(R.id.btn_first_fragment);
        button.setOnClickListener(this);
    }

    private void initSecondFragment() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frame_second_fragment, new SecondFragment());
        ft.commit();
        //getFragmentManager().beginTransaction().add(R.id.frame_second_fragment, new SecondFragment()).commit();
    }

    @Override
    public void onClick(View v) {
        textView.setText("Hello from First fragment");
    }

}
