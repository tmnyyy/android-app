package com.itstep.fiveapplication.ex_007_menu_example;



import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.itstep.fiveapplication.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_007_main_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about_author :

                Fragment fragment = getFragmentManager().findFragmentByTag(AuthorFragment.TAG);

                if (fragment == null) {
                    getFragmentManager().beginTransaction().add(R.id.frame_layout, new AuthorFragment(), AuthorFragment.TAG).commit();
                } else {
                    getFragmentManager().beginTransaction().remove(fragment).commit();
                }

                return true;

            case R.id.settings :
                Toast.makeText(this, "You pick settings", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.official_site :
                Intent intent = new Intent(this, OfficialSiteActivity.class);
                startActivity(intent);
                return true;
        }

        return false;
    }
}
