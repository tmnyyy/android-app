package com.itstep.fourapplication.ex_010_dialog_listeners;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;

public class DialogListenersActivity extends Activity {

    private final int DIALOG = 1;
    private final String LOG_TAG = "LoggingDialog";
    private Dialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_009_dialog_layout);
    }

    private void run1() {
       dismissDialog(DIALOG);
    }

    private void run2() {
      showDialog(DIALOG);
    }

    public void showDialog(View view) {
        showDialog(DIALOG);

        Handler h = new Handler();

        h.postDelayed(new Runnable() {
            public void run() {
                run1();
            }
        }, 2000);

        h.postDelayed(new Runnable() {
            public void run() {
                run2();
            }
        }, 4000);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            Log.d(LOG_TAG, "Create");
            builder.setTitle("Title")
                    .setMessage("Message")
                    .setPositiveButton("OK", null);
            dialog = builder.create();
            dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public void onShow(DialogInterface dialog) {
                    Log.d(LOG_TAG, "Show");
                }
            });
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialog) {
                    Log.d(LOG_TAG, "Cancel");
                }
            });
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialog) {
                    Log.d(LOG_TAG, "Dismiss");
                }
            });

            return dialog;
        }

        return super.onCreateDialog(id);
    }

}
