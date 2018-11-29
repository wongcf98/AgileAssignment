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
    Customer cust;
    Calendar orderDate;
    ProductOrder id;

    public OrderDetails(Customer cust, Calendar orderDate, ProductOrder id) {
        this.cust = cust;
        this.orderDate = orderDate;
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "cust=" + cust + ", orderDate=" + orderDate + '}';
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
