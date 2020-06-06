package com.itstep.sixapplication.ex_017_action_mode_list;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.itstep.sixapplication.R;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {


    private ListView list;
    private final String TAG = "ActMode";

    private List<String> data = new ArrayList<String>() {
        {
            add("one");
            add("two");
            add("three");
            add("four");
            add("five");
        }
    };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_017_main_layout);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_activated_1, data);
        list = (ListView) findViewById(R.id.list_action_mode);
        list.setAdapter(adapter);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        list.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {

            private List<String> currentData = new ArrayList<>();

            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                mode.getMenuInflater().inflate(R.menu.menu, menu);
                return true;
            }

            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                for (String value : currentData) {
                    data.remove(value);
                    adapter.notifyDataSetChanged();
                }
                currentData.clear();
                mode.finish();
                return false;
            }

            public void onDestroyActionMode(ActionMode mode) {
            }

            public void onItemCheckedStateChanged(ActionMode mode,
                                                  int position, long id, boolean checked) {
                String item = adapter.getItem(position);
                Log.d(TAG, "position = " + position + ", checked = "
                        + checked + " " + item);
                if (checked)
                     currentData.add(item);
                else
                    currentData.remove(item);
            }
        });



    }

}
