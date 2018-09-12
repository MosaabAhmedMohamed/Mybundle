package com.example.android.mybundle;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by mosabahmed55 on 10/02/2018.
 */

public class OrangeCalling extends Fragment {
    public OrangeCalling()
    {}
    private Button OrangeCallingMonthlyBu;
    private Button OrangeCallingWeeklyBu;
    private Button OrangeCallingDailyBu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View orangeCalling=inflater.inflate(R.layout.orangecalling,container,false);
        OrangeCallingMonthlyBu=(Button)orangeCalling.findViewById(R.id.OrangeCallingMonthlyBu);
        OrangeCallingWeeklyBu=(Button)orangeCalling.findViewById(R.id.OrangeCallingWeeklyBu);
        OrangeCallingDailyBu=(Button)orangeCalling.findViewById(R.id.OrangeCallingDailyBu);


        OrangeCallingMonthlyOnClick();
        OrangeCallingWeeklyOnClick();
        OrangeCallingDailyOnClick();

       return orangeCalling;
    }

    private void OrangeCallingMonthlyOnClick()
    {
        OrangeCallingMonthlyBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),OrangeCallingMonthly.class);
                startActivity(intent);
            }
        });
    }

    private void OrangeCallingWeeklyOnClick()
    {
        OrangeCallingWeeklyBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),OrangeCallingWeekly.class);
                startActivity(intent);
            }
        });
    }

    private void OrangeCallingDailyOnClick()
    {
        OrangeCallingDailyBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),OrangeCallingDaily.class);
                startActivity(intent);
            }
        });
    }

}
