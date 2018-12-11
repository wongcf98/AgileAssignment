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
    
    public Delivery(Address add, OrderDetails order, Customer cust, Calendar DoD) {
        this.add = add;
        this.order = order;
        this.cust = cust;
        this.date_of_deliver = DoD;
        this.status = "pending";
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
