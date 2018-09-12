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

public class OrangeInternetGoPackage extends AppCompatActivity {
private String hash= Uri.encode("#");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange_internet_go_package);

        final Button OrangeInternetGoBu1=(Button)findViewById(R.id.OrangeInternetGoBu1);
        final Button OrangeInternetGoBu2=(Button)findViewById(R.id.OrangeInternetGoBu2);
        final Button OrangeInternetGoBu3=(Button)findViewById(R.id.OrangeInternetGoBu3);
        final Button OrangeInternetGoBu4=(Button)findViewById(R.id.OrangeInternetGoBu4);
        final Button OrangeInternetGoBu5=(Button)findViewById(R.id.OrangeInternetGoBu5);

        final AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
        alertDialog.setTitle("warning");
        alertDialog.setMessage("Do you want to continue ?");

        OrangeInternetGoBu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*1*1*1*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetGoPackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetGoPackage.this,"#100#4*4*1*1*1*1*1*1#",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                alertDialog.show();
            }
        });


        OrangeInternetGoBu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*1*2*1*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetGoPackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetGoPackage.this,"#100#4*4*1*1*2*1*1*1#",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                alertDialog.show();
            }
        });



        OrangeInternetGoBu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*1*3*1*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetGoPackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetGoPackage.this,"#100#4*4*1*1*3*1*1*1#",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                alertDialog.show();
            }
        });



        OrangeInternetGoBu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*1*4*1*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetGoPackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetGoPackage.this,"#100#4*4*1*1*4*1*1*1#",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                alertDialog.show();
            }
        });



        OrangeInternetGoBu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*1*5*1*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetGoPackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetGoPackage.this,"#100#4*4*1*1*5*1*1*1#",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                alertDialog.show();
            }
        });


    }
}
