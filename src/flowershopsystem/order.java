/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.util.*;

public class order {
    Product product;
    String collect_date;
    String est_time;
    String collect_time;
    int id;
    static int count = 1000;
    
    public order(Product product, String date, String time, String collect_time) {
        this.id = count;
        this.collect_date = date;
        this.est_time = time;
        this.collect_time = collect_time;
        
    }

    order() {
        
    }

    public Product getProduct() {
        return product;
    }

    public String getTime() {
        return est_time;
    }

    public String getCollect_time() {
        return collect_time;
    }

    public int getId() {
        return id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCollect_time(String collect_time) {
        this.collect_time = collect_time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return collect_date;
    }

    public void setDate(String date) {
        this.collect_date = date;
    }
    
    public void setTime(String time) {
        this.est_time = time;
    }
    public float getTotal(){
        float total = 0;
        total = product.price * product.amt;
        return total;
    }
}
