/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.util.Calendar;

/**
 *
 * @author LIANG
 */
public class CustomizeFlower {

    String id;
    static int count = 1000;
    String flowerArrangementName;
    String ArrangementSize;
    String flowertype;
    String accessories;
    String priority;
    float price;
    Calendar customizeDate;
    String status;
    Customer customer;
    
    public CustomizeFlower(String flowerArrangementName, String ArrangementSize, 
            String flowertype, String accessories, String priority, 
            float price, Customer cust) {
        this.flowerArrangementName = flowerArrangementName;
        this.ArrangementSize = ArrangementSize;
        this.flowertype = flowertype;
        this.accessories = accessories;
        this.priority = priority;
        this.price = price;
        this.customer = cust;
        
        this.id = "CF" + count;
        this.status = "Pending";
        this.customizeDate = Calendar.getInstance();

        count++;
    }

    public CustomizeFlower(String flowerArrangementName, String ArrangementSize, 
            String flowertype, String accessories, String priority, 
            float price) {
        this.flowerArrangementName = flowerArrangementName;
        this.ArrangementSize = ArrangementSize;
        this.flowertype = flowertype;
        this.accessories = accessories;
        this.priority = priority;
        this.price = price;
        this.customer = null;
        
        this.id = "CF" + count;
        this.status = "Pending";
        this.customizeDate = Calendar.getInstance();

        count++;
    }
    
    public CustomizeFlower(String flowerArrangementName, String ArrangementSize, String flowertype, String accessories, float price, String priority, Calendar customizeDate) {
        this.id = "CF" + count;
        this.flowerArrangementName = flowerArrangementName;
        this.ArrangementSize = ArrangementSize;
        this.flowertype = flowertype;
        this.accessories = accessories;
        this.priority = priority;
        this.price = price;
        this.customizeDate = customizeDate;
        count++;
        this.status = "Pending";
    }

    public Calendar getCustomizeDate() {
        return customizeDate;
    }

    public void setCustomizeDate(Calendar customizeDate) {
        this.customizeDate = customizeDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CustomizeFlower{" + "id=" + id + ", flowerArrangementName=" + flowerArrangementName + ", ArrangementSize=" + ArrangementSize + ", flowertype=" + flowertype + ", accessories=" + accessories + ", priority=" + priority + ", price=" + price + ", customizeDate=" + customizeDate + '}';
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getFlowerArrangementName() {
        return flowerArrangementName;
    }

    public void setFlowerArrangementName(String flowerArrangementName) {
        this.flowerArrangementName = flowerArrangementName;
    }

    public String getArrangementSize() {
        return ArrangementSize;
    }

    public void setArrangementSize(String ArrangementSize) {
        this.ArrangementSize = ArrangementSize;
    }

    public String getFlowertype() {
        return flowertype;
    }

    public void setFlowertype(String flowertype) {
        this.flowertype = flowertype;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

}
