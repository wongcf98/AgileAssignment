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
   String name;
   String email;
   String contact;
   String custType;

    public Customer(String name, String email,String contact,String custType) {
        this.name = name;
        this.custType=custType;
        this.contact= contact;
        this.email=email;
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

    public void setAmt(String custType) {
        this.custType = custType;
    }


    public void setEmail(String email) {
        this.email=email;
    }
    
        public void setContact(String contact) {
        this.contact=contact;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", email=" + email + ", contact=" + contact+ ", custType="+custType+'}';
    }
    
    
    
}
 

