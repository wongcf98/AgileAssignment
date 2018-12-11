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
    String address;
    float balance;

    public OrderDetails(Customer cust, Calendar orderDate, ProductOrder id, String address) //consumer
    {
        this.cust = cust;
        this.orderDate = orderDate;
        this.id = id;
        this.address = address;
    }  
        public OrderDetails( Calendar orderDate,  String address) //consumer
    {
        this.orderDate = orderDate;
        this.address = address;
    }  
    
    public OrderDetails(Customer cust, Calendar orderDate, ProductOrder id, String address, float balance) //coorperate
    {   this.cust = cust;
        this.orderDate = orderDate;
        this.id = id;
        this.address = address;
    }

      @Override
    public String toString() {
        return "OrderDetails{" + "orderid=" + orderid + ", cust=" + cust + ", orderDate=" + orderDate + ", id=" + id + ", address=" + address + ", balance=" + balance + '}';
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

    public ProductOrder getId() {
        return id;
    }

    public void setId(ProductOrder id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
