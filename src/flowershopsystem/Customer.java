/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

/**
 *
 * @author Acer
 */
public class Customer {
   String id;
   String name;
   String email;
   String contact;
   String custType;
   int currentLimit;
   int monthlyLimit;

    public Customer(String id, String name, String contact,String email,String custType,int currentLimit,int monthlyLimit) {
        this.id= id;
        this.name = name;
        this.custType=custType;
        this.contact= contact;
        this.email=email;
        this.currentLimit=currentLimit;
        this.monthlyLimit=monthlyLimit;
    }

    public String getId()  {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCurrentLimit(int currentLimit) {
        this.currentLimit = currentLimit;
    }

    public void setMonthlyLimit(int monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public double getCurrentLimit() {
        return currentLimit;
    }

    public double getMonthlyLimit() {
        return monthlyLimit;
    }

    public String getName() {
        return name;
    }

    public String getCustType() {
        return custType;
    }


    public String getEmail() {
        return email;
    }
    
    public String getContact(){
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email=email;
    }
    
        public void setContact(String contact) {
        this.contact=contact;
    }

    @Override
    public String toString() {
        return "Customer{" +"id="+id+ "name=" + name + ", email=" + email + ", contact=" + contact+ ", custType="+custType+"Current Limit="+currentLimit+"Monthly Limit:"+monthlyLimit+'}';
    }
    
    
    
}
 

