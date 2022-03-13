package org.app.iinsanis;

import android.app.Application;

public class staticnumber extends Application {
    private int FINALCARTPRICE=0;
    private String cart="";

    public int getFINALCARTPRICE()
    {
        return FINALCARTPRICE;
    }

    public void setFINALCARTPRICE(int FINALCARTPRICE)
    {
        this.FINALCARTPRICE+=FINALCARTPRICE;
    }

    public void resetFINALCARTPRICE()
    {
        this.FINALCARTPRICE=0;
    }

    public String getCart() {
        return cart;
    }

    public void setCart(String cart)
    {
        this.cart+=cart;
    }

    public void resetcart(){
        this.cart="";
    }
}
