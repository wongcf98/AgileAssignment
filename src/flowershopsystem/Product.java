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
    String Category;
    float price;

    public Product(String name, int amt, String Category, float price) {
        this.name = name;
        this.amt = amt;
        this.Category = Category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAmt() {
        return amt;
    }

    public String getCategory() {
        return Category;
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

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", amt=" + amt + ", Category=" + Category + ", price=" + price + '}';
    }
    
    
}
