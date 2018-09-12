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

public class OrangeInternetOnlinePackage extends AppCompatActivity {
private String hash= Uri.encode("#");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange_internet_online_package);


        final Button OrangeInternetOnlinebu1=(Button)findViewById(R.id.OrangeInternetOnlineBu1);
        final Button OrangeInternetOnlinebu2=(Button)findViewById(R.id.OrangeInternetOnlineBu2);
        final Button OrangeInternetOnlinebu3=(Button)findViewById(R.id.OrangeInternetOnlineBu3);
        final Button OrangeInternetOnlinebu4=(Button)findViewById(R.id.OrangeInternetOnlineBu4);
        final Button OrangeInternetOnlinebu5=(Button)findViewById(R.id.OrangeInternetOnlineBu5);
        final Button OrangeInternetOnlinebu6=(Button)findViewById(R.id.OrangeInternetOnlineBu6);
        final Button OrangeInternetOnlinebu7=(Button)findViewById(R.id.OrangeInternetOnlineBu7);
        final Button OrangeInternetOnlinebu8=(Button)findViewById(R.id.OrangeInternetOnlineBu8);
        final Button OrangeInternetOnlinebu9=(Button)findViewById(R.id.OrangeInternetOnlineBu9);
        final Button OrangeInternetOnlinebu10=(Button)findViewById(R.id.OrangeInternetOnlineBu10);


        final AlertDialog.Builder alertDialog=new  AlertDialog.Builder(this);
        alertDialog.setTitle("Warning");
        alertDialog.setMessage("Do you want to continue ?");


        OrangeInternetOnlinebu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*2*1*3*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetOnlinePackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetOnlinePackage.this,"#100#4*4*1*2*1*3*1*1#",Toast.LENGTH_SHORT).show();
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


        OrangeInternetOnlinebu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*2*1*4*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetOnlinePackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetOnlinePackage.this,"#100#4*4*1*2*1*4*1*1#",Toast.LENGTH_SHORT).show();
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


        OrangeInternetOnlinebu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*2*2*1*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetOnlinePackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetOnlinePackage.this,"#100#4*4*1*2*2*1*1*1#",Toast.LENGTH_SHORT).show();
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


        OrangeInternetOnlinebu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*2*2*2*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetOnlinePackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetOnlinePackage.this,"#100#4*4*1*2*2*2*1*1#",Toast.LENGTH_SHORT).show();
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


        OrangeInternetOnlinebu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*2*2*3*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetOnlinePackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetOnlinePackage.this,"#100#4*4*1*2*2*3*1*1#",Toast.LENGTH_SHORT).show();
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


        OrangeInternetOnlinebu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*2*2*4*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetOnlinePackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetOnlinePackage.this,"#100#4*4*1*2*2*4*1*1#",Toast.LENGTH_SHORT).show();
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


        OrangeInternetOnlinebu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*2*3*1*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetOnlinePackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetOnlinePackage.this,"#100#4*4*1*2*3*1*1*1#",Toast.LENGTH_SHORT).show();
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


        OrangeInternetOnlinebu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*2*3*2*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetOnlinePackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetOnlinePackage.this,"#100#4*4*1*2*3*2*1*1#",Toast.LENGTH_SHORT).show();
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


        OrangeInternetOnlinebu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*2*3*3*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetOnlinePackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetOnlinePackage.this,"#100#4*4*1*2*3*3*1*1#",Toast.LENGTH_SHORT).show();
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


        OrangeInternetOnlinebu10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + hash+"100"+hash+"4*4*1*2*3*4*1*1"+hash));
                        if (ActivityCompat.checkSelfPermission(OrangeInternetOnlinePackage.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(intent);

                        Toast.makeText(OrangeInternetOnlinePackage.this,"#100#4*4*1*2*3*4*1*1#",Toast.LENGTH_SHORT).show();
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
