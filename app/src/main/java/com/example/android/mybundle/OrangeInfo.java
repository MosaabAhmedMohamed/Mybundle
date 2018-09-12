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

public class OrangeInfo extends Fragment {
public OrangeInfo(){}

    String hash=Uri.encode("#");

    Button OrangeInfoMyNumberBu;
    Button OrangeInfoMyStockBu;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View orangeInfo =inflater.inflate(R.layout.orangeinfo,container,false);
         OrangeInfoMyNumberBu=(Button)orangeInfo.findViewById(R.id.OrangeNumber);
         OrangeInfoMyStockBu=(Button)orangeInfo.findViewById(R.id.OrangeStock);

        MyNumberOnClick();
        MyStockOnClick();

        return orangeInfo;
    }

    private void MyNumberOnClick()
    {
        OrangeInfoMyNumberBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+hash+"999"+hash));
                startActivity(intent);

                Toast.makeText(getActivity(),"#999#",Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void MyStockOnClick()
    {
        OrangeInfoMyStockBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+hash+"100"+hash+"1*1"+hash));
                startActivity(intent);

                Toast.makeText(getActivity(),"#100#1*1#",Toast.LENGTH_SHORT).show();
            }
        });

    }

}
