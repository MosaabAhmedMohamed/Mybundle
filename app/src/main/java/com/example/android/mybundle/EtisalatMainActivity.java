package com.example.android.mybundle;

import android.os.Bundle;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class EtisalatMainActivity extends AppCompatActivity {
TabLayout EtisalatTab;
ViewPager EtisalatPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etisalat_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EtisalatPager=(ViewPager)findViewById(R.id.EtisalatPager);
        EtisalatTab=(TabLayout)findViewById(R.id.EtisalatTab);

        EtisalatTab.setupWithViewPager(EtisalatPager);
        setupEtisalatViewPager(EtisalatPager);
    }

    public void setupEtisalatViewPager(ViewPager viewPager)
    { EtisalatViewPager Adapter=new EtisalatViewPager(getSupportFragmentManager());

         Adapter.addFragmentPage(new EtisalatInfo(),"INFO");
         Adapter.addFragmentPage(new EtisalatInternet(),"Internet");
         Adapter.addFragmentPage(new EtisalatCalling(),"Calling");
         viewPager.setAdapter(Adapter);

    }

}
class EtisalatViewPager extends FragmentPagerAdapter
{
    private List<Fragment> EtisalatFragment=new ArrayList<>();
    private List<String> EtisalatTabsName=new ArrayList<>();

    public EtisalatViewPager(FragmentManager fm)
    {
        super(fm);
    }

    public void addFragmentPage(Fragment fragment,String fragmentName )
    {
        EtisalatFragment.add(fragment);
        EtisalatTabsName.add(fragmentName);
    }

    @Override
    public Fragment getItem(int position) {
        return EtisalatFragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return EtisalatTabsName.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
