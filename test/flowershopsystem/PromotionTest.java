/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yaw Zhi Jun
 */
public class PromotionTest {

    Promotion pt;
    private double delta = 0.01;

    public PromotionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Product p = new Product("Rose", 20, (float) 20.5);
        pt = new Promotion(p,10,(float)18.45,Calendar.getInstance(),Calendar.getInstance());
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getStartDate method, of class Promotion.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        assertEquals(Calendar.getInstance(), pt.getStartDate());
    }

    /**
     * Test of setStartDate method, of class Promotion.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.DAY_OF_MONTH, 2);
        pt.setStartDate(expected);
        
        assertEquals(format.format(expected.getTime()), format.format(pt.getStartDate().getTime()));
    }

    /**
     * Test of getEndDate method, of class Promotion.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        assertEquals(Calendar.getInstance(), pt.getEndDate());
    }

    /**
     * Test of setEndDate method, of class Promotion.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.DAY_OF_MONTH, 2);
        pt.setEndDate(expected);
        
        assertEquals(format.format(expected.getTime()), format.format(pt.getEndDate().getTime()));
    }

    /**
     * Test of getProd method, of class Promotion.
     */
    @Test
    public void testGetProd() {
        System.out.println("getProd");
        Product pr = new Product("Rose", 20, (float) 20.5);
        assertEquals(pr.amt, pt.getProd().amt);
        assertEquals(pr.name, pt.getProd().name);
        assertEquals(pr.price, pt.getProd().price,delta);
    }

    /**
     * Test of setProd method, of class Promotion.
     */
    @Test
    public void testSetProd() {
        System.out.println("setProd");
        Product pr = new Product("aaa", 10, (float) 10.5);
        pt.setProd(pr);
        assertEquals(pr, pt.getProd());
    }

    /**
     * Test of getDiscount method, of class Promotion.
     */
    @Test
    public void testGetDiscount() {
        System.out.println("getDiscount");
        assertEquals(10, pt.getDiscount());

    }

    /**
     * Test of setDiscount method, of class Promotion.
     */
    @Test
    public void testSetDiscount() {
        System.out.println("setDiscount");
        pt.setDiscount(20);
        assertEquals(20, pt.getDiscount());

    }

    /**
     * Test of getDiscountedPrice method, of class Promotion.
     */
    @Test
    public void testGetDiscountedPrice() {
        System.out.println("getDiscountedPrice");
        assertEquals(18.45, pt.getDiscountedPrice(), delta);
    }

    /**
     * Test of setDiscountedPrice method, of class Promotion.
     */
    @Test
    public void testSetDiscountedPrice() {
        System.out.println("setDiscountedPrice");
        pt.setDiscountedPrice((float) 20.25);
        assertEquals(20.25, pt.getDiscountedPrice(), delta);

    }

}
