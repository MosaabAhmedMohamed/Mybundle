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
 * Created by mosabahmed55 on 11/02/2018.
 */

public class EtisalatInfo extends Fragment{
    public EtisalatInfo()
    {}
    private String hash=Uri.encode("#");
    Button EtisalatMyNumberBu;
    Button EtisalatMyStockBu;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View etisalatInfo=inflater.inflate(R.layout.etisalatinfo,container,false);
        EtisalatMyNumberBu=(Button)etisalatInfo.findViewById(R.id.EtisalatNumber);
        EtisalatMyStockBu=(Button)etisalatInfo.findViewById(R.id.EtisalatStock);

        MyNumberOnclick();
        MyStockOnclick();

        return etisalatInfo;
    }

    private void MyStockOnclick() {
        EtisalatMyStockBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:*888"+hash));
                startActivity(intent);
            }
        });
    }

    private void MyNumberOnclick() {
        EtisalatMyNumberBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:*947"+hash));
                startActivity(intent);
            }
        });

    }
}
