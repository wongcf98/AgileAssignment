/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author LIANG
 */

public class ProductOrder extends AddOrder {
    String pName;
    int pQuantity;
    double pTotal;
    int orderid =OrderDetails.count; 
           
    public ProductOrder(String pName, int pQuantity, double pTotal, int orderid) {
        this.pName = pName;
        this.pQuantity = pQuantity;
        this.pTotal = pTotal;
        this.orderid =orderid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    public double getpTotal() {
        return pTotal;
    }

    public void setpTotal(double pTotal) {
        this.pTotal = pTotal;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }


    @Override
    public String toString() {
        return "ProductOrder{" + "pName=" + pName + ", pQuantity=" + pQuantity + ", pTotal=" + pTotal + ", orderid=" + orderid + '}';
    }
    
    
}
