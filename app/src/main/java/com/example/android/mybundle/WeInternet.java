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

public class WeInternet extends Fragment {
    public WeInternet()
    {}
 Button WeInternetMonthly;
 Button WeInternetDaily;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View weInternet=inflater.inflate(R.layout.weinternet,container,false);
        WeInternetMonthly=(Button)weInternet.findViewById(R.id.WeInternetMonthly);
        WeInternetDaily=(Button)weInternet.findViewById(R.id.WeInternetDaily);

        WeItnernetMonthlyBuOnClcik();
        WeItnernetDailyBuOnClcik();

        return weInternet;
    }

    private void WeItnernetMonthlyBuOnClcik()
    {WeInternetMonthly.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getActivity(), WeInternetMonthly.class);
            startActivity(intent);
        }
    });

    }

    private void WeItnernetDailyBuOnClcik()
    {WeInternetDaily.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getActivity(), WeInternetDaily.class);
            startActivity(intent);
        }
    });

    }

}

