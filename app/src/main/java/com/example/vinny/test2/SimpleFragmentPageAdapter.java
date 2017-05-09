package com.example.vinny.test2;

import android.content.Context;
//import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by vinny on 25/04/2017.
 */

public class SimpleFragmentPageAdapter extends FragmentStatePagerAdapter{
    private String[] tabtitle=new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    Context context;
    private int pagecount=7;
    public SimpleFragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        Tab_sunday_frag fragmentDemo = new Tab_sunday_frag();
        Tab_monday_frag fragment1 = new Tab_monday_frag();
        switch (position) {
            case 0:
                return fragmentDemo;
            case 1:
                return fragmentDemo;
            default:
                return fragmentDemo;
//        return fragmentDemo;
        }
    }
    @Override
    public int getCount() {
        return pagecount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitle[position];
    }
}
