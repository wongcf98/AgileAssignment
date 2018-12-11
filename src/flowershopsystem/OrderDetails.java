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
    

    
    
    public OrderDetails(Customer cust, Calendar orderDate) {
        this.cust = cust;
        this.orderDate = orderDate;
        this.orderid = count;
        count++;
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
