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
public class Delivery extends Retrieval {

    public Delivery(Calendar Date_Of_Agree, Address add, OrderDetails order) {
        super(Date_Of_Agree, add, order);
    }
    
}
