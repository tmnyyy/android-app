package com.itstep.fiveapplication.ex_001_fragment_example;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itstep.fiveapplication.R;


public class AnswerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.ex_001_answer_fragment, container, false);
    }

}
