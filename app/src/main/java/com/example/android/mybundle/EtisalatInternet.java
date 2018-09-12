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
 * Created by mosabahmed55 on 11/02/2018.
 */

public class EtisalatInternet extends Fragment {
    public EtisalatInternet()
    {}
private Button EtisalatInternetSuperBu;
private Button EtisalatInternetConnectBu;
private Button EtisalatInternetDailyBu;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View etisalatInternet=inflater.inflate(R.layout.etisalatinternet,container,false);
        EtisalatInternetSuperBu=(Button)etisalatInternet.findViewById(R.id.EtisalatInternetSuperBu);
        EtisalatInternetConnectBu=(Button)etisalatInternet.findViewById(R.id.EtisalatInternetConnectBu);
        EtisalatInternetDailyBu=(Button)etisalatInternet.findViewById(R.id.EtisalatInternetDailyBu);

        superBuOnClick();
        connectBuOnClick();
        dailyBuOnClick();
        return etisalatInternet;
    }
    private void superBuOnClick()
    {EtisalatInternetSuperBu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getActivity(),EtisalatInternetSuper.class);
            startActivity(intent);
        }
    });

    }

    private void connectBuOnClick()
    {EtisalatInternetConnectBu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getActivity(),EtisalatInternetConnect.class);
            startActivity(intent);
        }
    });

    }

    private void dailyBuOnClick()
    {EtisalatInternetDailyBu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getActivity(),EtisalatInternetDaily.class);
            startActivity(intent);
        }
    });

    }
}
