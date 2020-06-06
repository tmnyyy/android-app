package com.itstep.fiveapplication.ex_003_fragments_and_activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.itstep.fiveapplication.R;


public class SecondFragment extends Fragment implements View.OnClickListener {

    private TextView textView;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ex_003_second_fragment, null);

        textView = (TextView) view.findViewById(R.id.result);
        button = (Button) view.findViewById(R.id.btn_second_fragment);
        button.setOnClickListener(this);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Button activityBtn = (Button) getActivity().findViewById(R.id.btn_activity);
        activityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hello from Activity");
            }
        });
    }

    @Override
    public void onClick(View v) {
        Activity activity = getActivity();
        FragmentManager fragmentManager = activity.getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.first_fragment);
        TextView textView = (TextView) fragment.getView().findViewById(R.id.result);
        textView.setText("Hello from second Fragment");
    }

}
