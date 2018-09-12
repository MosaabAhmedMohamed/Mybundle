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

public class VodaCalling extends Fragment{



    public VodaCalling()
    {}


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vodaCalling=inflater.inflate(R.layout.vodacalling,container,false);


        //Vodafone Calling Monthly Bundle Button
       final Button VodaCallingMonthlyBu=(Button)vodaCalling.findViewById(R.id.VodaCallingMonthlyBu);
        VodaCallingMonthlyBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VodaCallingMonthlyClick();
            }
        });


        //Vodafone Calling Weekly Bundle Button
       final Button VodaCallingMWeeklyBu=(Button)vodaCalling.findViewById(R.id.VodaCallingWeeklyBu);
        VodaCallingMWeeklyBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VodaCallingWeeklyClick();
            }
        });
        //Vodafone Calling Daily Bundle Button
       final  Button VodaCallingDailyBu=(Button)vodaCalling.findViewById(R.id.VodaCallingDailyBu);
        VodaCallingDailyBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VodaCallingDailyClick();
            }
        });

        return vodaCalling;
    }

    private void VodaCallingMonthlyClick()
    {
        Intent intent=new Intent(getActivity(),VodaCallingMonthly.class);
        startActivity(intent);
    }

    private void VodaCallingWeeklyClick()
    {
     Intent intent=new Intent(getActivity(),VodaCallingWeekly.class);
     startActivity(intent);
    }

     private void VodaCallingDailyClick()
     {
      Intent intent=new Intent(getActivity(),VodaCallingDaily.class);
      startActivity(intent);
     }

}


