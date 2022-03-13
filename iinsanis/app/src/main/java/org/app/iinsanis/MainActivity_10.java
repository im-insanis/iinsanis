package org.app.iinsanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_10 extends AppCompatActivity {
    int intentprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        Intent intent=getIntent();
        intentprice=intent.getIntExtra("realprice", 0);

        Button button10=(Button)findViewById(R.id.yes);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_10.this, MainActivity_01.class);
                startActivity(intent);
                finish();
            }
        });

        Button button11=(Button)findViewById(R.id.no);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_10.this, MainActivity_11.class);
                startActivity(intent);
                finish();
            }
        });
    }
}