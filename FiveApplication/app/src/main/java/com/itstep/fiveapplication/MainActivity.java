package com.itstep.fiveapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.itstep.fiveapplication.ex_006_fragment_example.RegisterOrLoginActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void click(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.ex001_first :
                intent = new Intent(this, com.itstep.fiveapplication.ex_001_fragment_example.MainActivity.class);
                break;
            case R.id.ex002_second :
                intent = new Intent(this, com.itstep.fiveapplication.ex_002_adding_fragment.MainActivity.class);
                break;
            case R.id.ex003_third :
                intent = new Intent(this, com.itstep.fiveapplication.ex_003_fragments_and_activity.MainActivity.class);
                break;
            case R.id.ex004_fourth :
                intent = new Intent(this, com.itstep.fiveapplication.ex_004_fragments_lifecycle.MainActivity.class);
                break;
            case R.id.ex005_five :
                intent = new Intent(this, com.itstep.fiveapplication.ex_005_send_data_from_activity.MainActivity.class);
                break;
            case R.id.ex006_six :
                intent = new Intent(this, RegisterOrLoginActivity.class);
                break;
            case R.id.ex007_seven :
                intent = new Intent(this, com.itstep.fiveapplication.ex_007_menu_example.MainActivity.class);
                break;
            case R.id.ex008_eight :
                intent = new Intent(this, com.itstep.fiveapplication.ex_008_navigation_tabs.MainActivity.class);
                break;
            case R.id.ex009_night :
                intent = new Intent(this, com.itstep.fiveapplication.ex_009_navigation_list.MainActivity.class);
                break;
            case R.id.ex010_ten :
                intent = new Intent(this, com.itstep.fiveapplication.ex_010_dinamic_action_bar.MainActivity.class);
                break;
            case R.id.ex011_eleven :
                intent = new Intent(this, com.itstep.fiveapplication.ex_011_action_mode.MainActivity.class);
                break;
            case R.id.ex012_twelve :
                intent = new Intent(this, com.itstep.fiveapplication.ex_012_dialog_fragment.MainActivity.class);
        }

        startActivity(intent);
    }
}
