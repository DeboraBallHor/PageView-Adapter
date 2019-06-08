package br.com.digitalhousehouse.tablayouteviewpager;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    ViewPager = findViewById(R.id.viewPager);
    tabLayout = findViewById(R.id.tabs);

    ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), getFragmentsList());
    viewPager.setAdapter(adapter);
    tabLayout.setupWithViewPager(viewPager);
    }

    private List<Fragment> getFragmentsList() {
        List<Fragment> fragments =new ArrayList<>();
        fragments.add(new TabLayoutActivity.PlaceholderFragment());
    }
}
