package com.xiaomeiw.resume.myviewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new NumberPagerAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.view_pager_tab);
        tabLayout.setupWithViewPager(viewPager);


        tabLayout.setBackgroundResource(R.color.tab_bg);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_favorite_white_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_people_white_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_phone_white_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_settings_white_24dp);
        // remove the shadow of action bar
        getSupportActionBar().setElevation(0);
    }


    private class NumberPagerAdapter extends FragmentPagerAdapter {
        public NumberPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return PageFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }
    }
}
