/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.util.*;

/**
 *
 * @author scollex
 */
public class order {
    
    Product product;
    String collect_method;
    Calendar chk_in;
    Calendar chk_out;
    
    public order(Product p, String c_m){
        this.product = p;
        this.collect_method = c_m;
        this.chk_in = new GregorianCalendar();
    }
}
