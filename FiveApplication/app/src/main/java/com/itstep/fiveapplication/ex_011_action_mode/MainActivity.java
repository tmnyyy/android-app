package com.itstep.fiveapplication.ex_011_action_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.itstep.fiveapplication.R;


public class MainActivity extends Activity {

    private ActionMode actionMode;
    private final String TAG = "ActionMode";
    private ActionMode.Callback callback = new CallBack();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_011_main_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    public void click(View v) {
        if (actionMode == null) {
            actionMode = startActionMode(callback);
        } else {
            actionMode.finish();
        }
    }

    private class CallBack implements ActionMode.Callback {

        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate(R.menu.ex_011_context, menu);
            return true;
        }

        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            Log.d(TAG, "Prepare");
            return false;
        }

        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            Log.d(TAG, "item " + item.getTitle());
            return false;
        }

        public void onDestroyActionMode(ActionMode mode) {
            Log.d(TAG, "destroy");
            actionMode = null;
        }

    }

}


