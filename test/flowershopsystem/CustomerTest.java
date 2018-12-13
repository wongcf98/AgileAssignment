/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author scollex
 */
public class CustomerTest {
    
    private Customer c1;
    
    public CustomerTest() {
    }
    
    double delta = 0.01;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c1 = new Customer("Wong Hao Chung","0123456789","wong@email.com","consumer",20000,20000);
    }
    @Test
    public void testGetName() {
        System.out.println("getName");
        assertEquals("Wong Hao Chung", c1.getName());
    }
    @Test
    public void testSetName() {
        System.out.println("setName");
        c1.setName("Wong Hao Chung");
        assertEquals("Wong Hao Chung", c1.getName());
    }

    /**
     * Test of setCurrentLimit method, of class Customer.
     */
    @Test
    public void testSetCurrentLimit() {
        System.out.println("setCurrentLimit");
        c1.setCurrentLimit(20000);
       assertEquals(20000,c1.getCurrentLimit(),delta);
    }

    /**
     * Test of setMonthlyLimit method, of class Customer.
     */
    @Test
    public void testSetMonthlyLimit() {
        System.out.println("setMonthlyLimit");
        c1.setMonthlyLimit(20000);
        assertEquals(20000,c1.getMonthlyLimit(),delta);
    }

    /**
     * Test of setCustType method, of class Customer.
     */
    @Test
    public void testSetCustType() {
        System.out.println("setCustType");
        c1.setCustType("consumer");
        assertEquals("consumer", c1.getCustType());
    }

    /**
     * Test of getCurrentLimit method, of class Customer.
     */
    @Test
    public void testGetCurrentLimit() {
        System.out.println("getCurrentLimit");
        assertEquals(20000,c1.getCurrentLimit(),delta);
    }

    /**
     * Test of getMonthlyLimit method, of class Customer.
     */
    @Test
    public void testGetMonthlyLimit() {
        System.out.println("getMonthlyLimit");
        assertEquals(20000,c1.getMonthlyLimit(),delta);
    }

    /**
     * Test of getName method, of class Customer.
     */
   
    /**
     * Test of getCustType method, of class Customer.
     */
    @Test
    public void testGetCustType() {
        System.out.println("getCustType");
        assertEquals("consumer", c1.getCustType());
    }

    /**
     * Test of getEmail method, of class Customer.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        assertEquals("wong@email.com", c1.getEmail());
    }

    /**
     * Test of getContact method, of class Customer.
     */
    @Test
    public void testGetContact() {
        System.out.println("getContact");
        assertEquals("0123456789", c1.getContact());
    }

    /**
     * Test of setName method, of class Customer.
     */
   
    /**
     * Test of setEmail method, of class Customer.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
       c1.setEmail("wong@email.com");
       assertEquals("wong@email.com", c1.getEmail());
   
    }

    /**
     * Test of setContact method, of class Customer.
     */
    @Test
    public void testSetContact() {
        System.out.println("setContact");
        c1.setContact("0123456789");
        assertEquals("0123456789", c1.getContact());
    }

    /**
     * Test of toString method, of class Customer.
     */

    
}
