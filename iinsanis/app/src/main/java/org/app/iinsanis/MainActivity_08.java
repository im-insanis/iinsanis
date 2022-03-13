package org.app.iinsanis;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity_08 extends AppCompatActivity {
    TextView productname;
    TextView price;
    TextView saleinfo;
    TextView number;
    Button ok;
    Button plus;
    Button minus;
    String intentname, intentprice, intentsale;

    private int count = 1;
    private int realprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main08);

        productname = (TextView) findViewById(R.id.productname);
        price = (TextView) findViewById(R.id.price);
        saleinfo = (TextView) findViewById(R.id.saleinfo);


        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        number = (TextView) findViewById(R.id.number);

        Intent intent=getIntent();
        intentname=intent.getStringExtra("intentname");
        intentprice=intent.getStringExtra("intentprice");
        intentsale=intent.getStringExtra("intentsale");

        productname.setText(intentname);
        price.setText(intentprice);
        saleinfo.setText(intentsale);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                number.setText(count + "");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count > 1) {
                    count--;
                    number.setText(count + "");
                } else {
                    count = 1;
                    number.setText(count + "");
                }


            }
        });

        ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_08.this, MainActivity_10.class);

                if (intentsale.equals("1+1")) {
                    intentprice = intentprice.replace("원", "");
                    realprice = Integer.parseInt(intentname);

                    if (count % 2 == 0) {
                        realprice = realprice * (count / 2);
                    } else {
                        realprice = (realprice * (count / 2) + realprice);
                    }
                } else if (intentsale.equals("2+1")) {
                    intentprice = intentprice.replace("원", "");
                    realprice = Integer.parseInt(intentprice);

                    if (count % 3 == 0) {
                        realprice = realprice * 2 * (count / 3);
                    } else if (count % 3 == 1) {
                        realprice = (realprice * 2 * (count / 3)) + (realprice);
                    } else if (count % 3 == 2) {
                        realprice = (realprice * 2 * (count / 3)) + (realprice * 2);
                    }
                } else if (intentsale.equals("4캔 10000원")) {
                    intentprice = intentprice.replace("원", "");
                    realprice = Integer.parseInt(intentprice);

                    if (count >= 4) {
                        realprice = count * 2500;
                    } else {
                        realprice = realprice * count;
                    }

                } else {
                    intentprice = intentprice.replace("원", "");
                    realprice = Integer.parseInt(intentprice);

                    realprice = realprice * count;
                }

                staticnumber staticnumber=(staticnumber)getApplicationContext();
                staticnumber.setFINALCARTPRICE(realprice);
                staticnumber.setCart(intentname+" "+count+"개");

                startActivity(intent);
                finish();
            }
        });

    }
}