package com.example.android.mybundle;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class VodaInternetWeekly extends AppCompatActivity {
    private String hash = Uri.encode("#");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voda_internet_weekly);
        Button vodaInternetWeeklyBu1 = (Button) findViewById(R.id.vodaInternetWeeklyBu1);
        Button vodaInternetWeeklyBu2 = (Button) findViewById(R.id.vodaInternetWeeklyBu2);
        Button vodaInternetWeeklyBu3 = (Button) findViewById(R.id.vodaInternetWeeklyBu3);

        final AlertDialog.Builder alertrDialog = new AlertDialog.Builder(this);
        alertrDialog.setTitle("warning");
        alertrDialog.setMessage("Do you want to continue ?");

        vodaInternetWeeklyBu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertrDialog.setPositiveButton("continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*2000*72" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetWeekly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetWeekly.this,"*2000*72#",Toast.LENGTH_SHORT).show();
                    }
                });
                alertrDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                alertrDialog.show();
            }
        });

        vodaInternetWeeklyBu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertrDialog.setPositiveButton("continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*2000*73" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetWeekly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetWeekly.this,"*2000*73#",Toast.LENGTH_SHORT).show();
                    }
                });
                alertrDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                alertrDialog.show();
            }
        });


        vodaInternetWeeklyBu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertrDialog.setPositiveButton("continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*2000*77" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetWeekly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetWeekly.this,"*2000*77#",Toast.LENGTH_SHORT).show();
                    }
                });
                alertrDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                alertrDialog.show();
            }
        });
    }
}
