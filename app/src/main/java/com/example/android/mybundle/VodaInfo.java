package com.example.android.mybundle;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by mosabahmed55 on 07/02/2018.
 */

public class VodaInfo extends Fragment {
    public VodaInfo() {
    }


String hash= Uri.encode("#");
    Button VodaNum;
    Button VodaStock;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vodaInfo = inflater.inflate(R.layout.vodainfo, container, false);

        VodaNum = (Button) vodaInfo.findViewById(R.id.VodaNumber);
        VodaStock = (Button) vodaInfo.findViewById(R.id.VodaStock);


        VodaNumberClick();
        VodaStockClick();
        return vodaInfo;
    }


    private void VodaNumberClick() {

        VodaNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*878"+hash));
                if (ActivityCompat.checkSelfPermission(getActivity(),
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(callIntent);

            }
        });
    }

    private void VodaStockClick()
    {VodaStock.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:*868*1"+hash));
            if (ActivityCompat.checkSelfPermission(getActivity(),Manifest.permission.CALL_PHONE)!=PackageManager.PERMISSION_GRANTED)
            {
                return;
            }
            startActivity(intent);
        }
    });

    }






}
