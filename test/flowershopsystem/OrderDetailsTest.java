/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LIANG
 */
public class OrderDetailsTest {
    
    OrderDetails order;
    Customer cust;
    Delivery deli;
    Delivery.Address add;
    double delta = 0.01;
    
    public OrderDetailsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
            order = new OrderDetails(cust, Calendar.getInstance(), (float) 100.50, "Pick Up", deli);
            cust = new Customer("WONG HAO CHUNG", "010-2052345", "wong@gmail.com", "Consumer", 0, 0);
            add = new Delivery.Address("10", "jalan 14/60", "Petaling Jata", "Selangar", "Malaysia", 46300);
deli = new Delivery(add,Calendar.getInstance());
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDeliveryMethod method, of class OrderDetails.
     */
    @Test
    public void testGetDeliveryMethod() {
        System.out.println("getDeliveryMethod");
        assertEquals("Pick Up", order.getDeliveryMethod());
 
    }

    /**
     * Test of setDeliveryMethod method, of class OrderDetails.
     */
    @Test
    public void testSetDeliveryMethod() {
        System.out.println("setDeliveryMethod");
        order.setDeliveryMethod("DM");
        assertEquals("DM", order.getDeliveryMethod());
    }

    /**
     * Test of getAddress method, of class OrderDetails.
     */
    //
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        assertEquals(add, order.getAddress().getAdd() );
    }

    /**
     * Test of setAddress method, of class OrderDetails.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        Delivery.Address add1 = new Delivery.Address("11", "jalan 11/61", "Petaling Jata", "Selangar", "Malaysia", 46300);
        order.delivery.getAdd();
        assertEquals(add1, order.getAddress().getAdd());
        
        
        
    }

    /**
     * Test of getTotal method, of class OrderDetails.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        assertEquals((float)100.50, order.getTotal(), delta);
    }

    /**
     * Test of setTotal method, of class OrderDetails.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        order.setTotal((float)50.50);
        assertEquals((float)50.50, order.getTotal(), delta);
    }

    /**
     * Test of getCust method, of class OrderDetails.
     */
    @Test
    public void testGetCust() {
        System.out.println("getCust");
       assertEquals("WONG HAO CHUNG", cust.getName());
    }

    /**
     * Test of setCust method, of class OrderDetails.
     */
    @Test
    public void testSetCust() {
        System.out.println("setCust");
        cust.setName("YapSL");
        assertEquals("YapSL", cust.getName());
    }

    /**
     * Test of getOrderDate method, of class OrderDetails.
     */
    @Test
    public void testGetOrderDate() {
        System.out.println("getOrderDate");
        assertEquals(Calendar.getInstance(), deli.getDate_of_deliver());
    }

    /**
     * Test of setOrderDate method, of class OrderDetails.
     */
    @Test
    public void testSetOrderDate() {
        System.out.println("setOrderDate");
        deli.setDate_of_deliver(Calendar.getInstance());
        assertEquals(Calendar.getInstance(), deli.getDate_of_deliver());
        
    }
    
}
