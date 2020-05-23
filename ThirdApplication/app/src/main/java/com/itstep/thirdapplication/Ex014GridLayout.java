package com.itstep.thirdapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;


public class Ex014GridLayout extends Activity {

    private String realTranslate;
    private TextView textView;
    private GridLayout gridLayout;
    private int currentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex014_grid_layout);

        realTranslate = "EGGP";
        textView = (TextView) findViewById(R.id.result);
        gridLayout = (GridLayout) findViewById(R.id.grid_layout);
    }

    public void click(View view) {

        CharSequence letter = ((Button)view).getText();
        String currentText = textView.getText().toString();

        if (currentIndex < realTranslate.length() && realTranslate.charAt(currentIndex) == letter.charAt(0) ) {
            textView.setText(currentText + letter.toString());
            currentIndex++;
            gridLayout.removeView(view);
        } else if (currentIndex == realTranslate.length() && !currentText.contains("You translated succsessful!!!")) {
            textView.setText(currentText + "\nYou translated succsessful!!!");
        }

    }
}
