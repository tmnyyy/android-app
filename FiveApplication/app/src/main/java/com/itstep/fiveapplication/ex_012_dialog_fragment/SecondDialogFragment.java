package com.itstep.fiveapplication.ex_012_dialog_fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import com.itstep.fiveapplication.R;


public class SecondDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    final String TAG = "Dialog";

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder adb = new AlertDialog.Builder(getActivity())
                .setTitle("Title!")
                .setPositiveButton(R.string.yes, this)
                .setNegativeButton(R.string.no, this)
                .setNeutralButton(R.string.maybe, this)
                .setMessage(R.string.message_text);

        return adb.create();
    }

    public void onClick(DialogInterface dialog, int which) {

        switch (which) {
            case Dialog.BUTTON_POSITIVE:
                Log.d(TAG, "Second Dialog: " + getResources().getString(R.string.yes));
                break;
            case Dialog.BUTTON_NEGATIVE:
                Log.d(TAG, "Second Dialog: " + getResources().getString(R.string.no));
                break;
            case Dialog.BUTTON_NEUTRAL:
                Log.d(TAG, "Second Dialog: " + getResources().getString(R.string.maybe));
                break;
        }

    }

    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        Log.d(TAG, "Dialog 2: onDismiss");
    }

    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        Log.d(TAG, "Dialog 2: onCancel");
    }

}
