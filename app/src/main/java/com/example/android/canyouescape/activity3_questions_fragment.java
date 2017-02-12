package com.example.android.canyouescape;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 10/02/2017.
 */
public class activity3_questions_fragment  extends FragmentActivity {

    ViewPager mViewPager;
    int position=0;

    /**
     * Called when the activity is first created.
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_questions_fragment);


        Button next = (Button) findViewById(R.id.NextButton3);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), activity4_results.class);
                startActivityForResult(myIntent, 0);
            }


        });

        mViewPager = (ViewPager) findViewById(R.id.pager);
        /** Setting the adapter for ViewPager */
        mViewPager.setAdapter(new SamplePagerAdapter(getSupportFragmentManager()));
    }


    /** Defining a FragmentPagerAdapter class to control the fragments to be shown when user swipes on the screen. */
    public class SamplePagerAdapter extends FragmentPagerAdapter {

        public SamplePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            /** Show a Fragment based on the position of the current screen */
            if (position == 0) {
                return new com.example.android.canyouescape.SampleFragment1();
            } else if (position == 1) {
                return new com.example.android.canyouescape.SampleFragment2();
            } else if (position == 2) {
                return new com.example.android.canyouescape.SampleFragment3();
            }
            else return new com.example.android.canyouescape.SampleFragment4();
        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }
    }

    public void onClickSwipe(View view){
        mViewPager.setCurrentItem(position);
        position=position+1;
        if (position>3){
            position=0;
        }
    }


}