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

public class VodaInternetMonthly extends AppCompatActivity {
    private String hash = Uri.encode("#");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voda_internet_monthly);
        Button vodaInternetMonthlyBu1 = (Button) findViewById(R.id.vodaInternetMonthlyBu1);
        Button vodaInternetMonthlyBu2 = (Button) findViewById(R.id.vodaInternetMonthlyBu2);
        Button vodaInternetMonthlyBu3 = (Button) findViewById(R.id.vodaInternetMonthlyBu3);
        Button vodaInternetMonthlyBu4 = (Button) findViewById(R.id.vodaInternetMonthlyBu4);
        Button vodaInternetMonthlyBu5 = (Button) findViewById(R.id.vodaInternetMonthlyBu5);
        Button vodaInternetMonthlyBu6 = (Button) findViewById(R.id.vodaInternetMonthlyBu6);
        Button vodaInternetMonthlyBu7 = (Button) findViewById(R.id.vodaInternetMonthlyBu7);
        Button vodaInternetMonthlyBu8 = (Button) findViewById(R.id.vodaInternetMonthlyBu8);
        Button vodaInternetMonthlyBu9 = (Button) findViewById(R.id.vodaInternetMonthlyBu9);
        Button vodaInternetMonthlyBu10 = (Button) findViewById(R.id.vodaInternetMonthlyBu10);

        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("warning");
        alertDialog.setMessage("Do you want to continue ?");

        vodaInternetMonthlyBu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*2007" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetMonthly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetMonthly.this,"*2007#",Toast.LENGTH_SHORT).show();
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


        vodaInternetMonthlyBu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*2015" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetMonthly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetMonthly.this,"*2015#",Toast.LENGTH_SHORT).show();
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


        vodaInternetMonthlyBu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*2030" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetMonthly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetMonthly.this,"*2030#",Toast.LENGTH_SHORT).show();
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


        vodaInternetMonthlyBu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*2045" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetMonthly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetMonthly.this,"*2045#",Toast.LENGTH_SHORT).show();
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


        vodaInternetMonthlyBu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:2060" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetMonthly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetMonthly.this,"*2060#",Toast.LENGTH_SHORT).show();
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


        vodaInternetMonthlyBu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*2075" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetMonthly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetMonthly.this,"*2075#",Toast.LENGTH_SHORT).show();
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


        vodaInternetMonthlyBu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*2100" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetMonthly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetMonthly.this,"*2100#",Toast.LENGTH_SHORT).show();
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


        vodaInternetMonthlyBu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*2150" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetMonthly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetMonthly.this,"*2150#",Toast.LENGTH_SHORT).show();
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


        vodaInternetMonthlyBu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*2250" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetMonthly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetMonthly.this,"*2250#",Toast.LENGTH_SHORT).show();
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


        vodaInternetMonthlyBu10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setPositiveButton("continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:*2400" + hash));
                        if (ActivityCompat.checkSelfPermission(VodaInternetMonthly.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        startActivity(intent);
                        Toast.makeText(VodaInternetMonthly.this,"*2400#",Toast.LENGTH_SHORT).show();
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
