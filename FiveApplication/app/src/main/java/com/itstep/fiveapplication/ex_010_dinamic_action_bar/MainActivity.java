package com.itstep.fiveapplication.ex_010_dinamic_action_bar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.itstep.fiveapplication.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int MENU_ID = 1;

    private CheckBox chbAddDel;
    private CheckBox chbVisible;

    private Fragment currentFragment;
    private Fragment firstFragment;
    private Fragment secondFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_010_main_layout);

        chbAddDel = (CheckBox) findViewById(R.id.chbAddDel);
        chbVisible = (CheckBox) findViewById(R.id.chbVisible);

        chbAddDel.setOnClickListener(this);
        chbVisible.setOnClickListener(this);

        currentFragment = new FirstFragment();
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ex_010_menu_group, menu);
        menu.setGroupVisible(R.id.groupVsbl, chbVisible.isChecked());
        if (chbAddDel.isChecked()) {
            menu.add(0, MENU_ID, 0, "New pounct")
                    .setIcon(android.R.drawable.ic_delete)
                    .setShowAsAction(
                            MenuItem.SHOW_AS_ACTION_ALWAYS
                                    | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        } else {
            menu.removeItem(MENU_ID);
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.chbAddDel :
            case R.id.chbVisible :
                invalidateOptionsMenu();
                break;
            case R.id.btnFrag:
               currentFragment = (currentFragment == firstFragment) ? secondFragment : firstFragment;
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, currentFragment)
                        .commit();
                break;
            default:
                break;
        }

    }

}
