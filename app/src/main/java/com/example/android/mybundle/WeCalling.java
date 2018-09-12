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
 * Created by mosabahmed55 on 13/02/2018.
 */

public class WeCalling extends Fragment {
    public WeCalling()
    {}

    Button WeCallingMonthly;
    Button WeCalingDaily;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View weCalling=inflater.inflate(R.layout.wecalling,container,false);
        WeCallingMonthly=(Button)weCalling.findViewById(R.id.WeCallingMonthlyBu);
        WeCalingDaily=(Button)weCalling.findViewById(R.id.WeCallingDailyBu);



        WeCallingMonthlyOnClick();
        WeCallingDailyOnClick();

        return weCalling;
    }

    private void WeCallingMonthlyOnClick()
    {
        WeCallingMonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WeCallingMonthly.class);
                startActivity(intent);
            }
        });
    }

    private void WeCallingDailyOnClick()
    {
        WeCalingDaily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WeCallingDaily.class);
                startActivity(intent);
            }
        });
    }
}

