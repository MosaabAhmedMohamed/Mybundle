package com.example.android.mybundle;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import java.util.ArrayList;
import java.util.List;

public class OrangeMainActivity extends AppCompatActivity {
TabLayout OrangeTab;
ViewPager OrangePager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        OrangeTab=(TabLayout)findViewById(R.id.OrangeTab);
        OrangePager=(ViewPager) findViewById(R.id.OrangePager);


        OrangeTab.setupWithViewPager(OrangePager);
        setupOrangeViewPager(OrangePager);
    }

    public void setupOrangeViewPager(ViewPager viewPager)
    {
        OrangeViewPager Adapter =new OrangeViewPager(getSupportFragmentManager());

        Adapter.addFramnetPage(new OrangeInfo() ,"Info");
        Adapter.addFramnetPage(new OrangeInternet(),"Internet");
        Adapter.addFramnetPage(new OrangeCalling(),"Calling");

        viewPager.setAdapter(Adapter);
    }

}

class OrangeViewPager extends FragmentPagerAdapter {
  private List<Fragment> OrangeFragment =new ArrayList<>();
  private List<String>OrangeTabsName=new ArrayList<>();



    public OrangeViewPager(FragmentManager fm) {
        super(fm);
    }

    public void addFramnetPage(Fragment frag,String Name)
    {
        OrangeFragment.add(frag);
        OrangeTabsName.add(Name);
    }

    @Override
    public Fragment getItem(int position)
    {
        return OrangeFragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return OrangeTabsName.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
