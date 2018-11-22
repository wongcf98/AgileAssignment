/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LIANG
 */
public class OrderDetails {
    Date pickupdate;
    String time;
    String address;
    String payment;
 
    
    public OrderDetails(Date pickupdate, String time, String address, String payment){
    this.pickupdate = pickupdate;
    this.time = time;
    this.address = address;
    this.payment = payment;
       
    }

    public Date getPickupdate() {
        return pickupdate;
    }

    public void setPickupdate(Date pickupdate) {
        this.pickupdate = pickupdate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "pickupdate=" + pickupdate + ", time=" + time + ", address=" + address + ", payment=" + payment  + '}';
    }

    
    

}
