package com.example.android.mybundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.INotificationSideChannel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by mosabahmed55 on 11/02/2018.
 */

public class EtisalatCalling extends Fragment {
    public EtisalatCalling()
    {}
    private Button EtisalatCallingHekaya;
    private Button EtisalatCallingHekayaMix;
    private Button EtisalatCallingAhlan;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View etisalatCalling=inflater.inflate(R.layout.etisalatcalling,container,false);
        EtisalatCallingHekaya=(Button)etisalatCalling.findViewById(R.id.EtisalatCallingHekayaBu);
        EtisalatCallingHekayaMix=(Button)etisalatCalling.findViewById(R.id.EtisalatCallingHekayaMixBu);
        EtisalatCallingAhlan=(Button)etisalatCalling.findViewById(R.id.EtisalatCallingAhlanBu);

        HekayaOnClick();
        HekayaMixOnClick();
        AhlanOnClick();

        return etisalatCalling;
    }


    private void HekayaOnClick()
    {
        EtisalatCallingHekaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),EtisalatCallingHekaya.class);
                startActivity(intent);
            }
        });
    }
    private void HekayaMixOnClick()
    {
        EtisalatCallingHekayaMix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),EtisalatCallingHekayaMix.class);
                startActivity(intent);
            }
        });
    }
    private void AhlanOnClick()
    {
        EtisalatCallingAhlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), EtisalatCallingAhlan.class);
                startActivity(intent);
            }
        });
    }

}
