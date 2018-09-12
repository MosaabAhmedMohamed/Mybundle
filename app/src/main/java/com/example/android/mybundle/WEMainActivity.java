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

public class WEMainActivity extends AppCompatActivity {
    TabLayout weTab;
    ViewPager WePager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wemain);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        weTab=(TabLayout)findViewById(R.id.WeTab);
        WePager=(ViewPager)findViewById(R.id.WEPager);

        weTab.setupWithViewPager(WePager);
                 setupWeViewPager(WePager);
    }

    public void setupWeViewPager(ViewPager viewPager)
    {
        WeViewPager Adapter=new WeViewPager(getSupportFragmentManager());


        Adapter.addFragment(new WeInfo(),"Info");
        Adapter.addFragment(new WeInternet(),"internet");
        Adapter.addFragment(new WeCalling(),"Calling");

        viewPager.setAdapter(Adapter);


    }

}
class WeViewPager extends FragmentPagerAdapter
{
    private List<Fragment> WeFragment=new ArrayList<>();
    private List<String>FragmentName=new ArrayList<>();

   public WeViewPager(FragmentManager fm)
   {super(fm);}

   public void addFragment(Fragment fragment,String fragmentName)
   {
       WeFragment.add(fragment);
       FragmentName.add(fragmentName);
   }


    @Override
    public Fragment getItem(int position) {
        return WeFragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentName.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}