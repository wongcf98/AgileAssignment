/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.util.Calendar;

/**
 *
 * @author scollex
 */
public class Delivery {

    private Address add;
    private OrderDetails order;
    private Customer cust;
    private Calendar date_of_deliver;
    private Calendar date_of_collect;
    String status;
    String method;
    
    public Delivery(OrderDetails order, Address add, Customer cust, Calendar DoD) {
        this.add = add;
        this.order = order;
        this.cust = cust;
        this.date_of_deliver = DoD;
        this.status = "Pending";
        this.method = "Delivery";
    }

    public Delivery(OrderDetails order, Customer cust, Calendar date_of_deliver) {
        this.order = order;
        this.cust = cust;
        this.date_of_deliver = date_of_deliver;
        this.status = "Pending";
        this.method = "Pick Up";
    }

    public Calendar getDate_of_deliver() {
        return date_of_deliver;
    }

    public void setDate_of_deliver(Calendar date_of_deliver) {
        this.date_of_deliver = date_of_deliver;
    }

    public Calendar getDate_of_collect() {
        return date_of_collect;
    }

    public void setDate_of_collect(Calendar date_of_collect) {
        this.date_of_collect = date_of_collect;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public OrderDetails getOrder() {
        return order;
    }

    public void setOrder(OrderDetails order) {
        this.order = order;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    @Override
    public String toString() {
        return "Delivery{" + "add=" + add + ", order=" + order + ", cust=" + cust + '}';
    }
    
    private static class Address {

        String unit, street, city, state, country;
        int postcode;

        public Address() {

        }

        public Address(String unit, String street, String city, String state, String country, int postcode) {
            this.unit = unit;
            this.street = street;
            this.city = city;
            this.state = state;
            this.country = country;
            this.postcode = postcode;
        }
    }
}
