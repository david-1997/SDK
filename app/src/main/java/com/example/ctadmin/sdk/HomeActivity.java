package com.example.ctadmin.sdk;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("SDK");
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        //addFragmentsToViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
    /*private void addFragmentsToViewPager(ViewPager viewPager) {
        TabAdapterActivity adapter = new TabAdapterActivity(getSupportFragmentManager());
        adapter.addFragment(new ChatFragment(), "Chat");
        adapter.addFragment(new PostsFragment(), "Posts");
        adapter.addFragment(new ShareFragment(), "Share");
        viewPager.setAdapter(adapter);
}*/
}
