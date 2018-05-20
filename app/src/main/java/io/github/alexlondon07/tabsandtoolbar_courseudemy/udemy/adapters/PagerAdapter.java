package io.github.alexlondon07.tabsandtoolbar_courseudemy.udemy.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import io.github.alexlondon07.tabsandtoolbar_courseudemy.udemy.fragments.FirstFragment;
import io.github.alexlondon07.tabsandtoolbar_courseudemy.udemy.fragments.SecondFragment;
import io.github.alexlondon07.tabsandtoolbar_courseudemy.udemy.fragments.ThirdFragment;

/**
 * Created by alexlondon07 on 5/20/18.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public PagerAdapter(FragmentManager fm, int tabs) {
        super(fm);
        this.numberOfTabs = tabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
