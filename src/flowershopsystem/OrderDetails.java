/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author LIANG
 */
public class OrderDetails {

    int orderid;
    static int count = 1000;
    Customer cust;
    Calendar orderDate;
    float total;
    String deliveryMethod = null;
    Delivery delivery = null;
    ProductOrder[] product;

    public OrderDetails(Customer cust, Calendar orderDate, float total,
            String deliveryMethod, Delivery delivery, ProductOrder[] order) {
        this.cust = cust;
        this.orderDate = orderDate;
        this.orderid = count;
        
        this.deliveryMethod = deliveryMethod;
        this.delivery = delivery;
        this.product = order;
        this.total = calculateTotal();
        count++;
    }

    public OrderDetails(Customer cust, Calendar orderDate, float total,
            String deliveryMethod, Delivery delivery) {
        this.cust = cust;
        this.orderDate = orderDate;
        this.orderid = count;
        this.total = total;
        this.deliveryMethod = deliveryMethod;
        this.delivery = delivery;
        count++;
    }

    private float calculateTotal() {
        float total = (float) 0.00;
        for (ProductOrder order : product) {
            total += order.pTotal;
        }
        return total;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public Delivery getAddress() {
        return delivery;
    }

    public void setAddress(Delivery address) {
        this.delivery = address;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public OrderDetails() {
        this.orderid = count;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "cust=" + cust + ", orderDate=" + orderDate + ", total=" + total + ", deliveryMethod=" + deliveryMethod + ", delivery=" + delivery + ", product=" + product + '}';
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public Calendar getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
    }
}
