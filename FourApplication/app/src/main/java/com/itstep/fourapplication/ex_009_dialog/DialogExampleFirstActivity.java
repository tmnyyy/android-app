package com.itstep.fourapplication.ex_009_dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;

public class DialogExampleFirstActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_009_dialog_layout);
    }

    public void showDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("itvdn.com")
                .setCancelable(false)
                .setIcon(R.drawable.ic_launcher_round)
                .setMessage("Exit from dialog application?")
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogExampleFirstActivity.this, "Application is working", Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

}
