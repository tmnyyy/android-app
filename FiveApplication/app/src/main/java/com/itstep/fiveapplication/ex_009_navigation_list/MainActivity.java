package com.itstep.fiveapplication.ex_009_navigation_list;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.itstep.fiveapplication.R;


public class MainActivity extends AppCompatActivity implements ActionBar.OnNavigationListener {

    private final String TAG = "List";

    private String[] data = new String[] { "one", "two", "three" };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_009_main_layout);

        ActionBar bar = getSupportActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, data);
        bar.setListNavigationCallbacks(adapter, this);
    }

    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        Log.d(TAG, "selected: position = " + itemPosition + ", id = "
                + itemId + ", " + data[itemPosition]);
        return true;
    }

}
