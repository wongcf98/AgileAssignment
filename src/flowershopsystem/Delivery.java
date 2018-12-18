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
    private Calendar date_of_deliver;
    private Calendar date_of_collect;
    String status;
    
    public Delivery(Address add, Calendar DoD) {
        this.add = add;
        this.date_of_deliver = DoD;
        this.status = "Pending";
        this.date_of_collect = null;
    }

    public Delivery(Calendar date_of_deliver) {
        this.date_of_deliver = date_of_deliver;
        this.status = "Pending";
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
    
    public static class Address {

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
