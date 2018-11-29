/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author scollex
 */
public class Promotion {

    Product prod;
    int discount;
    float discountedPrice;
    Calendar startDate;
    Calendar endDate;

    public Promotion(Product prod, int discount, float discountedPrice, Calendar start, Calendar end) {
        this.prod = prod;
        this.discount = discount;
        this.discountedPrice = discountedPrice;
        this.startDate = start;
        this.endDate = end;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public float getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(float discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

}
