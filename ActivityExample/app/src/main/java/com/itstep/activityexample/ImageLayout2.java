package com.itstep.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;



public class ImageLayout2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_layout2);

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageDrawable(getResources().getDrawable(R.drawable.man));
    }

}
