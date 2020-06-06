package com.itstep.sixapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void click(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.ex_001_simple_list:
                intent = new Intent(this, com.itstep.sixapplication.ex_001_simple_list.MainActivity.class);
                break;
            case R.id.ex_002_layout_inflater:
                intent = new Intent(this, com.itstep.sixapplication.ex_002_layout_inflater.MainActivity.class);
                break;
            case R.id.ex_003_custom_item:
                intent = new Intent(this, com.itstep.sixapplication.ex_003_custom_item.MainActivity.class);
                break;
            case R.id.ex_004_choise_mode_single:
                intent = new Intent(this, com.itstep.sixapplication.ex_004_single_choice.MainActivity.class);
                break;
            case R.id.ex_005_choise_mode_multiple:
                intent = new Intent(this, com.itstep.sixapplication.ex_005_multiple_choice.MainActivity.class);
                break;
            case R.id.ex_006_listeners:
                intent = new Intent(this, com.itstep.sixapplication.ex_006_listeners_in_list.MainActivity.class);
                break;
            case R.id.ex_007_add_data:
                intent = new Intent(this, com.itstep.sixapplication.ex_007_add_data.MainActivity.class);
                break;
            case R.id.ex_008_simple_adapter :
                intent = new Intent(this, com.itstep.sixapplication.ex_008_simple_list_adapter.MainActivity.class);
                break;
            case R.id.ex_009_methods_simple_adapter :
                intent = new Intent(this, com.itstep.sixapplication.ex_009_text_image.MainActivity.class);
                break;
            case R.id.ex_010_view_binder :
                intent = new Intent(this, com.itstep.sixapplication.ex_010_view_binder.MainActivity.class);
                break;
            case R.id.ex_011_header_and_footer :
                intent = new Intent(this, com.itstep.sixapplication.ex_011_header_and_footer.MainActivity.class);
                break;
            case R.id.ex_012_spinner :
                intent = new Intent(this, com.itstep.sixapplication.ex_012_spinner.MainActivity.class);
                break;
            case R.id.ex_013_grid_view :
                intent = new Intent(this, com.itstep.sixapplication.ex_013_grid_view.MainActivity.class);
                break;
            case R.id.ex_014_expandable :
                intent = new Intent(this, com.itstep.sixapplication.ex_014_expandable_list_view.MainActivity.class);
                break;
            case R.id.ex_015_list_fragment :
                intent = new Intent(this, com.itstep.sixapplication.ex_015_list_fragment.MainActivity.class);
                break;
            case R.id.ex_016_dialog_list :
                intent = new Intent(this, com.itstep.sixapplication.ex_016_list_dialog.MainActivity.class);
                break;
            case R.id.ex_017_action_mode_list :
                intent = new Intent(this, com.itstep.sixapplication.ex_017_action_mode_list.MainActivity.class);
        }

        startActivity(intent);
    }
}
