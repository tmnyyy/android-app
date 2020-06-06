package com.itstep.fiveapplication.ex_012_dialog_fragment;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.itstep.fiveapplication.R;


public class FirstDialogFragment extends DialogFragment implements View.OnClickListener {

    final String TAG = "Dialog";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getDialog().setTitle("Title!");
        View view = inflater.inflate(R.layout.ex_012_first_dialog_layout, null);

        view.findViewById(R.id.btnYes).setOnClickListener(this);
        view.findViewById(R.id.btnNo).setOnClickListener(this);
        view.findViewById(R.id.btnMaybe).setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {
        Log.d(TAG, "First Dialog: " + ((Button) v).getText());
        dismiss();
    }

    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        Log.d(TAG, "First Dialog: onDismiss");
    }

    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        Log.d(TAG, "First Dialog: onCancel");
    }

}
