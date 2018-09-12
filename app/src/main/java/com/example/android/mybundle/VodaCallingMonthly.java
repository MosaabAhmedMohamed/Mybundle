package com.example.android.mybundle;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class VodaCallingMonthly extends AppCompatActivity {
String hash=Uri.encode("#");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voda_calling_monthly);
        final Button vodaCallingMonthlyBu1 = (Button) findViewById(R.id.VodaCallingMonthlyBu1);
        final Button vodaCallingMonthlyBu2 = (Button) findViewById(R.id.VodaCallingMonthlyBu2);
        final Button vodaCallingMonthlyBu3 = (Button) findViewById(R.id.VodaCallingMonthlyBu3);
        final Button vodaCallingMonthlyBu4 = (Button) findViewById(R.id.VodaCallingMonthlyBu4);
        final Button vodaCallingMonthlyBu5 = (Button) findViewById(R.id.VodaCallingMonthlyBu5);
        final Button vodaCallingMonthlyBu6 = (Button) findViewById(R.id.VodaCallingMonthlyBu6);

        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(VodaCallingMonthly.this);
        alertDialog.setTitle("warning");
        alertDialog.setMessage("do you want to continue?");

        vodaCallingMonthlyBu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*880*3" + hash));
                        Toast.makeText(VodaCallingMonthly.this,"*880*3#",Toast.LENGTH_SHORT).show();
                        if (ActivityCompat.checkSelfPermission(VodaCallingMonthly.this
                                , Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                    }
                });
               alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       dialogInterface.cancel();
                   }
               }) ;
               alertDialog.show();
            }

        });

        vodaCallingMonthlyBu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*880*4" + hash));
                        Toast.makeText(VodaCallingMonthly.this,"*880*4#",Toast.LENGTH_SHORT).show();
                        if (ActivityCompat.checkSelfPermission(VodaCallingMonthly.this
                                , Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }) ;
                alertDialog.show();
            }

        });

        vodaCallingMonthlyBu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*020" + hash));
                        Toast.makeText(VodaCallingMonthly.this,"*880*3#",Toast.LENGTH_SHORT).show();
                        if (ActivityCompat.checkSelfPermission(VodaCallingMonthly.this
                                , Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }) ;
                alertDialog.show();
            }

        });

        vodaCallingMonthlyBu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*030" + hash));
                        Toast.makeText(VodaCallingMonthly.this,"*030#",Toast.LENGTH_SHORT).show();
                        if (ActivityCompat.checkSelfPermission(VodaCallingMonthly.this
                                , Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }) ;
                alertDialog.show();
            }

        });

        vodaCallingMonthlyBu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*050" + hash));
                        Toast.makeText(VodaCallingMonthly.this,"*050#",Toast.LENGTH_SHORT).show();
                        if (ActivityCompat.checkSelfPermission(VodaCallingMonthly.this
                                , Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }) ;
                alertDialog.show();
            }

        });

        vodaCallingMonthlyBu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*070" + hash));
                        Toast.makeText(VodaCallingMonthly.this,"*070#",Toast.LENGTH_SHORT).show();
                        if (ActivityCompat.checkSelfPermission(VodaCallingMonthly.this
                                , Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }) ;
                alertDialog.show();
            }

        });



    }
}
