package com.itstep.activityexample;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



public class ChangeImageActivity extends Activity {

    private TextView textView;
    private ImageView imageView;
    private ImageView virtualImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_image_layout);

        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.image);
        virtualImage = (ImageView) findViewById(R.id.virtual_image);
    }

    public void click(View view) {
        textView.setText(getResources().getString(R.string.empty_text));
        Drawable drawable = virtualImage.getDrawable();
        Drawable oldDrawable = imageView.getDrawable();
        String tag = (String) virtualImage.getTag();
        String oldTag = (String) imageView.getTag();
        virtualImage.setTag(oldTag);
        virtualImage.setImageDrawable(oldDrawable);
        imageView.setTag(tag);
        imageView.setImageDrawable(drawable);
    }

    public void imageClick(View view) {
        String text = (String) imageView.getTag();
        textView.setText(text);
    }

}
