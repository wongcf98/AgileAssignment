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
    ProductOrder[] product;
    CustomizeLinkedList<CustomizeFlower> customize;

    public OrderDetails(Customer cust, Calendar orderDate, ProductOrder[] order) {
        this.cust = cust;
        this.orderDate = orderDate;
        this.orderid = count;
        this.product = order;
        this.total = calculateTotal();
        count++;
    }

    public OrderDetails(Customer cust, Calendar orderDate, CustomizeLinkedList<CustomizeFlower> customize) {
        this.orderid = count;
        this.cust = cust;
        this.orderDate = orderDate;
        this.total = calculateTotal();
        this.customize = customize;
        count++;
    }

    private float calculateTotal() {
        float total = (float) 0.00;
        for (ProductOrder order : product) {
            if (order != null) {
                total += order.pTotal;
            }
        }
        return total;
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

    @Override
    public String toString() {
        return "OrderDetails{" + "orderid=" + orderid + ", cust=" + cust + ", orderDate=" + orderDate + ", total=" + total + ", product=" + product + '}';
    }

}
