package com.itstep.fourapplication.ex_003_implicit_call_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;


public class FirstActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_003_first_layout);
    }



    public void goToNewActivity(View v) {
        Intent intent;

        if (v.getId() == R.id.second_activity) {
            intent = new Intent("SecondActivity");
        } else {
            intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        }

        startActivity(intent);
    }

}
