package com.example.android.mybundle;

import android.content.Intent;
import android.net.Uri;
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

public class WeInfo extends Fragment {
    public WeInfo()
    {}
    private String hash= Uri.encode("#");
     Button WeNumberBu;
     Button WeStockBu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View weInfo=inflater.inflate(R.layout.weinfo,container,false);
        WeNumberBu=(Button)weInfo.findViewById(R.id.WeNumber);
        WeStockBu=(Button)weInfo.findViewById(R.id.WeStock);

        WeNumberOnclick();
        WeStockOnclick();

        return weInfo;
    }

    private void WeNumberOnclick()
    {
     WeNumberBu.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent=new Intent(Intent.ACTION_CALL);
             intent.setData(Uri.parse("tel:*688"+hash));
             startActivity(intent);
         }
     });

    }

    private void WeStockOnclick()
    {
        WeStockBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:*322"+hash));
                startActivity(intent);
            }
        });

    }
}
