package com.itstep.fiveapplication.ex_007_menu_example;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.itstep.fiveapplication.R;


public class AuthorFragment extends Fragment {

    public static final String TAG = "AuthorFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.ex_007_author_fragment, null);
    }

}
