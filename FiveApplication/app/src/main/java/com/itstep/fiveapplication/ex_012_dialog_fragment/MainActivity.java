package com.itstep.fiveapplication.ex_012_dialog_fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;

import com.itstep.fiveapplication.R;


public class MainActivity extends Activity {

    private DialogFragment dlg1;
    private DialogFragment dlg2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_012_main_layout);
        dlg1 = new FirstDialogFragment();
        dlg2 = new SecondDialogFragment();
    }

    public void click(View v) {
        switch (v.getId()) {
            case R.id.btnDlg1:
                dlg1.show(getFragmentManager(), "dlg1");
                break;
            case R.id.btnDlg2:
                dlg2.show(getFragmentManager(), "dlg2");
                break;
            default:
                break;
        }

    }

}
