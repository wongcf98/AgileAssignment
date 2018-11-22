/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.util.*;

public class order {

    Product[] product;
    String date;
    String est_time;
    String collect_time;
    int id;

    public order(int id, Product[] product, String date, String time, String collect_time) {
        this.id = id;
        this.product = product;
        this.date = date;
        this.est_time = time;
        this.collect_time = collect_time;
    }

    public Product[] getProduct() {
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

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public void setCollect_time(String collect_time) {
        this.collect_time = collect_time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String setTime() {
        return est_time;
    }

    public void setTime(String time) {
        this.est_time = time;
    }
    public float getTotal(){
        float sum = 0;
        for(int i = 0 ; i < product.length ; i++){
            sum += product[i].price;
        }
        return sum;
    }
}
