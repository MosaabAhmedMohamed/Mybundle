package com.example.android.mybundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by mosabahmed55 on 07/02/2018.
 */

public class VodaInternet extends Fragment {


    public VodaInternet()
    {}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vodaInternet=inflater.inflate(R.layout.vodainternet,container,false);


        final Button VodaInterntMonthlyBu=(Button)vodaInternet.findViewById(R.id.VodaInternetMonthlyBu);
        VodaInterntMonthlyBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VodaInternetMonthlyClick();
            }
        });


        final Button VodaInterntWeeklyBu=(Button)vodaInternet.findViewById(R.id.VodaInternetWeeklyBu);
        VodaInterntWeeklyBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VodaInternetWeeklyClick();
            }
        });


        final Button VodaInterntDailyBu=(Button)vodaInternet.findViewById(R.id.VodaInternetDailyBu);
        VodaInterntDailyBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VodaInternetDailyClick();
            }
        });

       return vodaInternet;
    }


    private void VodaInternetMonthlyClick()
    {
        Intent intent=new Intent(getActivity(),VodaInternetMonthly.class);
        startActivity(intent);
    }

    private void VodaInternetWeeklyClick()
    {
        Intent intent=new Intent(getActivity(),VodaInternetWeekly.class);
        startActivity(intent);
    }
    private void VodaInternetDailyClick()
    {
        Intent intent=new Intent(getActivity(),VodaInternetDaily.class);
        startActivity(intent);
    }
}
