package com.example.android.mybundle;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by mosabahmed55 on 10/02/2018.
 */

public class OrangeInternet extends Fragment {
    public OrangeInternet(){}

    private Button OrangeInternetOnlineBu;
    private Button OrangeInternetGoBu;
    private Button OrangeInternetDailyBu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View orangeInternet=inflater.inflate(R.layout.orangeinternet,container,false);
        OrangeInternetOnlineBu=(Button)orangeInternet.findViewById(R.id.OrangeInternetOnlineBu);
        OrangeInternetGoBu=(Button)orangeInternet.findViewById(R.id.OrangeInternetGoBu);
        OrangeInternetDailyBu=(Button)orangeInternet.findViewById(R.id.OrangeInternetDailyBu);

        OrangeInternetOnlineOnClick();
        OrangeInternetGoOnClick();
        OrangeInternetDailyOnClick();

        return orangeInternet;
    }
    private void OrangeInternetOnlineOnClick()
    {
        OrangeInternetOnlineBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),OrangeInternetOnlinePackage.class);
                startActivity(intent);
            }
        });
    }

    private void OrangeInternetGoOnClick()
    {
        OrangeInternetGoBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),OrangeInternetGoPackage.class);
                startActivity(intent);
            }
        });
    }

    private void OrangeInternetDailyOnClick()
    {
        OrangeInternetDailyBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),OrangeInternetDaily.class);
                startActivity(intent);
            }
        });
    }




}
