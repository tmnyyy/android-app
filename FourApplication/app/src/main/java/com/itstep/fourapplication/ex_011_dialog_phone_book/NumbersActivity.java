package com.itstep.fourapplication.ex_011_dialog_phone_book;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;

import java.util.ArrayList;
import java.util.List;


public class NumbersActivity extends Activity implements Dialog.OnClickListener {

    private final int DIALOG = 1;
    private List<String> phones;
    private ListView phoneList;
    private EditText dialogPhoneTxt;
    private EditText nameTxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_011_phone_book_layout);

        phones = new ArrayList<>();
        phoneList = (ListView) findViewById(R.id.list_phone);
    }

    public void addContact(View view) {
        showDialog(DIALOG);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view = getLayoutInflater().inflate(R.layout.ex_011_dialog_view_layout, null);
        builder.setTitle("Add Number")
               .setView(view)
                .setPositiveButton("Add", this)
                .setNegativeButton("Cancel", null);
        return builder.create();
    }

    @Override
    protected void onPrepareDialog(int id, Dialog dialog) {
        super.onPrepareDialog(id, dialog);
        if (id == DIALOG) {
            TextView dialogText = (TextView) dialog.getWindow().findViewById(R.id.text_add);
            dialogPhoneTxt = (EditText) dialog.getWindow().findViewById(R.id.number);
            nameTxt = (EditText) dialog.getWindow().findViewById(R.id.name);
            dialogText.setText("Added " + phones.size() + " numbers");
        }
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        String name = nameTxt.getText().toString();
        String phone = dialogPhoneTxt.getText().toString();
        phones.add(name + "\n" + phone);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, phones);
        phoneList.setAdapter(adapter);
    }
}
