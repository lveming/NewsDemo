package com.example.lm.newsdemo.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.lm.newsdemo.frament.NewsChildFragment;

/**
 * Created by Administrator on 2016/12/28.
 */
public class NewsFPAadapter extends FragmentPagerAdapter {
    private String[] titles;
    public NewsFPAadapter(FragmentManager fm) {
        super(fm);
    }

    public NewsFPAadapter(FragmentManager fm,String[] titles) {
        super(fm);
        this.titles=titles;
    }

    @Override
    public NewsChildFragment getItem(int position) {
        NewsChildFragment fragment=NewsChildFragment.newInstance(titles[position]);
        return fragment;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return titles[position%titles.length];
    }
}
