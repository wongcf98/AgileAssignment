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
    int pAmount;
    double pTotal;
    Product p;
    int orderid = OrderDetails.count;
    
    public ProductOrder(Product p, int pQuantity) {
        this.p = p;
        this.pAmount = pQuantity;
        this.pTotal = calculateTotal();
    }
    
    public ProductOrder(String pName, int pQuantity, double pTotal, int orderid) {
        this.pName = pName;
        this.pAmount = pQuantity;
        this.pTotal = pTotal;
        this.orderid = orderid;
    }
    
    public double calculateTotal() {
        return p.price * pAmount;
    }
    
    public String getpName() {
        return pName;
    }
    
    public void setpName(String pName) {
        this.pName = pName;
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
        return "ProductOrder{" + "pAmount=" + pAmount + ", pTotal=" + pTotal + ", p=" + p + '}';
    }
    
    
}
