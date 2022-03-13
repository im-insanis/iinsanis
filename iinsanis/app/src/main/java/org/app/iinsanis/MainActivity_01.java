package org.app.iinsanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main01);

        Button findpan=(Button)findViewById(R.id.findpan);
        findpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_01.this, MainActivity_02.class);
                startActivity(intent);
                finish();
            }
        });

        Button findpro=(Button)findViewById(R.id.findpro);
        findpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_01.this, MainActivity_07.class);
                startActivity(intent);
                finish();
            }
        });

        Button help=(Button)findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_01.this, MainActivity_14.class);
                startActivity(intent);
                finish();
            }
        });
    }
}