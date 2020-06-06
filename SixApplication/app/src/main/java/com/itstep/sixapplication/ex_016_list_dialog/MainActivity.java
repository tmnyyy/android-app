package com.itstep.sixapplication.ex_016_list_dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.itstep.sixapplication.R;


public class MainActivity extends Activity {
    private final String TAG = "Log";

    private final int DIALOG_ITEMS = 1;
    private final int DIALOG_ADAPTER = 2;

    private String[] data = { "one", "two", "three", "four" };


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_016_main_layout);
    }

    public void onclick(View v) {

        switch (v.getId()) {
            case R.id.btnItems:
                showDialog(DIALOG_ITEMS);
                break;
            case R.id.btnAdapter:
                showDialog(DIALOG_ADAPTER);
                break;
            default:
                break;
        }
    }

    protected Dialog onCreateDialog(int id) {
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        switch (id) {
            // массив
            case DIALOG_ITEMS:
                adb.setTitle(R.string.items);
                adb.setItems(data, myClickListener);
                break;
            // адаптер
            case DIALOG_ADAPTER:
                adb.setTitle(R.string.adapter);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                        android.R.layout.select_dialog_item, data);
                adb.setAdapter(adapter, myClickListener);
                break;

        }
        return adb.create();
    }

    protected void onPrepareDialog(int id, Dialog dialog) {

        AlertDialog alertDialog = (AlertDialog) dialog;
        ListAdapter listAdapter = alertDialog.getListView().getAdapter();

        switch (id) {
            case DIALOG_ITEMS:
            case DIALOG_ADAPTER:
                // проверка возможности преобразования
                if (listAdapter instanceof BaseAdapter) {
                    // преобразование и вызов метода-уведомления о новых данных
                    BaseAdapter bAdapter = (BaseAdapter) listAdapter;
                    bAdapter.notifyDataSetChanged();
                }
                break;

            default:
                break;
        }
    };


    private DialogInterface.OnClickListener myClickListener = new DialogInterface.OnClickListener() {

        @Override
        public void onClick(DialogInterface dialog, int which) {
            Log.d(TAG, "which = " + which);
            Toast.makeText(MainActivity.this, "position: " + which, Toast.LENGTH_SHORT).show();
        }


    };

}
