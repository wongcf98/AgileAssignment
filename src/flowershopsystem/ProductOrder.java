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
public class ProductOrder {

    int pAmount;
    float pTotal;
    Product p;
    int orderid = OrderDetails.count;

    public ProductOrder(Product p, int pQuantity) {
        this.p = p;
        this.pAmount = pQuantity;
        this.pTotal = calculateTotal();
    }

    public float calculateTotal() {
        return p.price * pAmount;
    }

    public int getpQuantity() {
        return pAmount;
    }

    public void setpQuantity(int pQuantity) {
        this.pAmount = pQuantity;
    }

    public double getpTotal() {
        return pTotal;
    }

    public void setpTotal(float pTotal) {
        this.pTotal = pTotal;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

}
