package org.app.iinsanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity_11 extends AppCompatActivity {

    TextView finalprice;
    TextView cart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        staticnumber staticnumber=(staticnumber)getApplicationContext();

        cart=(TextView)findViewById(R.id.cart);
        finalprice=(TextView)findViewById(R.id.finalprice);
        finalprice.setText("결제금액: "+staticnumber.getFINALCARTPRICE()+"원");
        cart.setText(staticnumber.getCart());

        staticnumber.resetcart();
        staticnumber.resetFINALCARTPRICE();


        Button payment=(Button)findViewById(R.id.payment);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_11.this, MainActivity_15.class);
                startActivity(intent);
                finish();
            }
        });

        Button cancle=(Button) findViewById(R.id.cancle);
        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity_11.this, MainActivity_13.class);
                startActivity(intent);
                finish();
            }
        });
    }
}