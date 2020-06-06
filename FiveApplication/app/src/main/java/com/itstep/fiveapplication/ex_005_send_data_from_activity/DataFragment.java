package com.itstep.fiveapplication.ex_005_send_data_from_activity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.itstep.fiveapplication.R;


public class DataFragment extends Fragment {

    private String value;

    public static DataFragment getInstance(String value) {
        DataFragment dataFragment = new DataFragment();
        Bundle bundle = new Bundle();
        bundle.putString("value", value);
        dataFragment.setArguments(bundle);
        return dataFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        value = getArguments().getString("value");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ex_005_fragment, null);
        TextView textView = (TextView) view.findViewById(R.id.result);
        textView.setText(value);
        return view;
    }

}
