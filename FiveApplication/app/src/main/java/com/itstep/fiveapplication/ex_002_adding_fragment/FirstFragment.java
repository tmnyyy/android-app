package com.itstep.fiveapplication.ex_002_adding_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itstep.fiveapplication.R;


public class FirstFragment extends Fragment {

    public static final String TAG = "FirstFragment";

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ex_002_first_fragment, null);
        return view;
    }

}
