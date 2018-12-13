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
    
    private Customer c1,c2;
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c1 = new Customer("Wong Hao Chung","0123456789","wongHC-wa16@email.com","consumer",20000,20000);
        c2 = new Customer("Wong Hao Choong","0123456789","wongHC-wa16@email.com","consumer",20000,20000);
    }
    @Test
    public void testGetId() {
        System.out.println("getId");
        assertEquals("Wong Hao Chung", c1.getName());
        assertEquals("Wong Hao Choong", c2.getName());
    }
    @Test
    public void testSetId() {
        System.out.println("setId");
        c1.setName("Wong HC");
        assertEquals("Wong HC", c1.getName());
    }

    /**
     * Test of setCurrentLimit method, of class Customer.
     */
    @Test
    public void testSetCurrentLimit() {
        System.out.println("setCurrentLimit");
        int currentLimit = 0;
        Customer instance = null;
        instance.setCurrentLimit(currentLimit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonthlyLimit method, of class Customer.
     */
    @Test
    public void testSetMonthlyLimit() {
        System.out.println("setMonthlyLimit");
        int monthlyLimit = 0;
        Customer instance = null;
        instance.setMonthlyLimit(monthlyLimit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustType method, of class Customer.
     */
    @Test
    public void testSetCustType() {
        System.out.println("setCustType");
        String custType = "";
        Customer instance = null;
        instance.setCustType(custType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentLimit method, of class Customer.
     */
    @Test
    public void testGetCurrentLimit() {
        System.out.println("getCurrentLimit");
        Customer instance = null;
        double expResult = 0.0;
        double result = instance.getCurrentLimit();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonthlyLimit method, of class Customer.
     */
    @Test
    public void testGetMonthlyLimit() {
        System.out.println("getMonthlyLimit");
        Customer instance = null;
        double expResult = 0.0;
        double result = instance.getMonthlyLimit();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Customer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Customer instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustType method, of class Customer.
     */
    @Test
    public void testGetCustType() {
        System.out.println("getCustType");
        Customer instance = null;
        String expResult = "";
        String result = instance.getCustType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Customer.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Customer instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContact method, of class Customer.
     */
    @Test
    public void testGetContact() {
        System.out.println("getContact");
        Customer instance = null;
        String expResult = "";
        String result = instance.getContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Customer.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Customer instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Customer.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Customer instance = null;
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContact method, of class Customer.
     */
    @Test
    public void testSetContact() {
        System.out.println("setContact");
        String contact = "";
        Customer instance = null;
        instance.setContact(contact);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
