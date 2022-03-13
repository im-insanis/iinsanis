package org.app.iinsanis;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconConsumer;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.RangeNotifier;
import org.altbeacon.beacon.Region;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainActivity_03 extends AppCompatActivity{
    TextView textView;
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main03);

        Button arrive=(Button)findViewById(R.id.arrive);
        textView = (TextView) findViewById(R.id.distance);

        arrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_03.this, MainActivity_01.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void OnButtonClicked(View view) {
        c++;
        if(c==1)
        {
            textView.setText("과자 약 1.98m");
        }
        if(c==2)
        {
            textView.setText("과자 약 1.45m");
        }
        if(c==3)
        {
            textView.setText("과자 약 1.74m");
        }
        if(c==4)
        {
            textView.setText("과자 약 2.27m");
        }
        if(c==5)
        {
            textView.setText("과자 약 1.70m");
        }
        if(c==6)
        {
            textView.setText("과자 약 1.35m");
        }
        if(c==7)
        {
            textView.setText("과자 약 0.2m");
        }
    }
}