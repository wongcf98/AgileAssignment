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
public class Retrieval implements Comparable<Retrieval> {

    public Calendar Date_Of_Agree;
    public Calendar Date_Of_Complete;
    public Address add;
    public OrderDetails order;
    public String status;

    public Retrieval(Calendar Date_Of_Agree, Address add, OrderDetails order) {
        this.Date_Of_Agree = Date_Of_Agree;
        this.add = add;
        this.order = order;
        this.status = "PENDING";
    }

    public Retrieval(Calendar Date_Of_Agree, OrderDetails order) {
        this.Date_Of_Agree = Date_Of_Agree;
        this.order = order;
        this.status = "PENDING";
    }

    @Override
    public int compareTo(Retrieval o) {
        return this.Date_Of_Agree.compareTo(o.Date_Of_Agree);
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

        @Override
        public String toString() {
            return unit + ' ' + street + "\n " + postcode + ' ' + city + "\n " + state + ' ' + country;
        }

    }
}
