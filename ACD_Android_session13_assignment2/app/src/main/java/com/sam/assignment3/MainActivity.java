package com.supriyalahade.session13assign2;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.supriyalahade.session13assign2.Adapter.TabsAdapter;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {

    ViewPager viewPager;
    ActionBar actionBar;
    TabsAdapter tabsAdapter;
    String tabs[] = {"Audio","Video"};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager= (ViewPager)findViewById(R.id.viewPager);
        tabsAdapter=new TabsAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabsAdapter);

        actionBar=getSupportActionBar();
       actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        for(String tab:tabs){
            actionBar.addTab(actionBar.newTab().setText(tab).setTabListener(this).setIcon(R.drawable.video));

        }

        viewPager.setOnPageChangeListener(this);

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        actionBar.setSelectedNavigationItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
