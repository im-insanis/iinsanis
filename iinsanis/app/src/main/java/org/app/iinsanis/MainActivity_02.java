package org.app.iinsanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_02 extends AppCompatActivity {
    private static final int INSTANT=10001;
    private static final int SNACK=40002;
    private static final int RAMEN=10003;
    private static final int BEVERAGE=40004;
    private static final int ICECREAM=40005;
    private static final int MEDICINE=40006;
    private static final int FRIED=40007;
    private static final int GOODS=40008;
    private static final int BREAD=40009;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);

        Button exit2=(Button)findViewById(R.id.exit2);
        exit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_02.this, MainActivity_01.class);
            }
        });

        Button ramen_btn=(Button)findViewById(R.id.ramen_btn);
        ramen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_02.this, MainActivity_03.class);
                intent.putExtra("data_chosen", RAMEN);
                intent.putExtra("data_name", "라면");
                startActivity(intent);
                finish();
            }
        });

        Button snack_btn=(Button)findViewById(R.id.snack_btn);
        snack_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_02.this, MainActivity_03.class);
                intent.putExtra("data_chosen", SNACK);
                intent.putExtra("data_name", "과자");
                startActivity(intent);
                finish();
            }
        });

        Button beverage_btn=(Button)findViewById(R.id.beverage_btn);
        beverage_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_02.this, MainActivity_03.class);
                intent.putExtra("data_chosen", BEVERAGE);
                intent.putExtra("data_name", "음료");
                startActivity(intent);
                finish();
            }
        });

        Button bread_btn=(Button)findViewById(R.id.bread_btn);
        bread_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_02.this, MainActivity_03.class);
                intent.putExtra("data_chosen", BREAD);
                intent.putExtra("data_name", "빵");
                startActivity(intent);
                finish();
            }
        });

        Button instant_btn=(Button)findViewById(R.id.instant_btn);
        instant_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_02.this, MainActivity_03.class);
                intent.putExtra("data_chosen", INSTANT);
                intent.putExtra("data_name", "즉석식품");
                startActivity(intent);
                finish();
            }
        });


        Button icecream_btn=(Button)findViewById(R.id.icecream_btn);
        icecream_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_02.this, MainActivity_03.class);
                intent.putExtra("data_chosen", ICECREAM);
                intent.putExtra("data_name", "아이스크림");
                startActivity(intent);
                finish();
            }
        });

        Button medicine_btn=(Button)findViewById(R.id.medicine_btn);
        medicine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_02.this, MainActivity_03.class);
                intent.putExtra("data_chosen", MEDICINE);
                intent.putExtra("data_name", "의약외품");
                startActivity(intent);
                finish();
            }
        });


        Button fried_btn=(Button)findViewById(R.id.fried_btn);
        fried_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_02.this, MainActivity_03.class);
                intent.putExtra("data_chosen", FRIED);
                intent.putExtra("data_name", "튀김");
                startActivity(intent);
                finish();
            }
        });

        Button goods_btn=(Button)findViewById(R.id.goods_btn);
        goods_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_02.this, MainActivity_03.class);
                intent.putExtra("data_chosen", GOODS);
                intent.putExtra("data_name", "잡화");
                startActivity(intent);
                finish();
            }
        });


    }
}