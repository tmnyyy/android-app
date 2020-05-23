package com.itstep.thirdapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class Ex017FrameLayoutActivity extends Activity {

    private ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex017_frame_layout);

        image1 = (ImageView)findViewById(R.id.imageView1);


        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image1.setVisibility(View.INVISIBLE);
            }
        });

    }
}
