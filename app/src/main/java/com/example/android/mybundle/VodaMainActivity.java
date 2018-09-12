package com.example.android.mybundle;

import android.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class VodaMainActivity extends AppCompatActivity {


    TabLayout MyTabs;
    ViewPager MyPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voda_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        MyTabs = (TabLayout)findViewById(R.id.MyTabs);
        MyPager = (ViewPager)findViewById(R.id.MyPage);

        MyTabs.setupWithViewPager(MyPager);
        SetUpViewPager(MyPager);

    }
    public void SetUpViewPager (ViewPager viewpage){
        MyViewPageAdapter Adapter = new MyViewPageAdapter(getSupportFragmentManager());

        Adapter.AddFragmentPage(new VodaInfo(), "Info");
        Adapter.AddFragmentPage(new VodaInternet(), "Internet");
        Adapter.AddFragmentPage(new VodaCalling(), "Calling");

        viewpage.setAdapter(Adapter);

    }

}
class MyViewPageAdapter extends FragmentPagerAdapter{
    private List<Fragment> MyFragment = new ArrayList<>();
    private List<String> MyPageTittle = new ArrayList<>();

    public MyViewPageAdapter(FragmentManager manager){
        super(manager);
    }

    public void AddFragmentPage(Fragment Frag, String Title){
        MyFragment.add(Frag);
        MyPageTittle.add(Title);
    }

    @Override
    public Fragment getItem(int position) {
        return MyFragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return MyPageTittle.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
