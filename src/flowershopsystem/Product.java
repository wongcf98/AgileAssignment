/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

/**
 *
 * @author scollex
 */
public class Product {
    String name;
    int amt;
    float price;
    int id;

    public Product(String name, int amt,float price) {
        this.name = name;
        this.amt = amt;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAmt() {
        return amt;
    }


    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }


    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", amt=" + amt + ", price=" + price + '}';
    }
    
    
}
