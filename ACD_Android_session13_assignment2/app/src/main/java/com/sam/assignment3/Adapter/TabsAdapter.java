package com.sam.assignment3.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.supriyalahade.session13assign2.Fragments.AudioFragment;
import com.supriyalahade.session13assign2.Fragments.VideoFragment;

/**
 * Created by BIDWAI on 23-08-2016.
 */
public class TabsAdapter extends FragmentPagerAdapter {
    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position){

            case 0:
                return new AudioFragment();


            case 1:
                return new VideoFragment();

        }

        return null;

    }

    @Override
    public int getCount() {
        return 2;
    }
}
