/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author scollex
 */
public class DeliveryTest {

    Delivery deli;
    Delivery.Address add;

    public DeliveryTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        add = new Delivery.Address("10", "jalan 14/60", "Petaling Jata", "Selangar", "Malaysia", 46300);
        deli = new Delivery(add, Calendar.getInstance());
        deli.setDate_of_collect(Calendar.getInstance());
    }

    /**
     * Test of getDate_of_deliver method, of class Delivery.
     */
    @Test
    public void testGetDate_of_deliver() {
        System.out.println("getDate_of_deliver");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        assertEquals(format.format(Calendar.getInstance().getTime()),
                format.format(deli.getDate_of_deliver().getTime()));
    }

    /**
     * Test of setDate_of_deliver method, of class Delivery.
     */
    @Test
    public void testSetDate_of_deliver() {
        System.out.println("setDate_of_deliver");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, -3);
        deli.setDate_of_deliver(expected);

        assertEquals(format.format(expected.getTime()),
                format.format(deli.getDate_of_deliver().getTime()));

    }

    /**
     * Test of getDate_of_collect method, of class Delivery.
     */
    @Test
    public void testGetDate_of_collect() {
        System.out.println("getDate_of_collect");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        assertEquals(format.format(Calendar.getInstance().getTime()),
                format.format(deli.getDate_of_collect().getTime()));
    }

    /**
     * Test of setDate_of_collect method, of class Delivery.
     */
    @Test
    public void testSetDate_of_collect() {
        System.out.println("setDate_of_collect");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, -3);
        deli.setDate_of_collect(expected);

        assertEquals(format.format(expected.getTime()), format.format(deli.getDate_of_collect().getTime()));
    }

    /**
     * Test of getAdd method, of class Delivery.
     */
    @Test
    public void testGetAdd() {
        System.out.println("getAdd");
        
        assertEquals(add, deli.getAdd());
    }

    /**
     * Test of setAdd method, of class Delivery.
     */
    @Test
    public void testSetAdd() {
        System.out.println("setAdd");
        Delivery.Address expected = new Delivery.Address("10", "jalan 14/60", "Petaling Jata", "Selangar", "Malaysia", 46300);

        deli.setAdd(expected);

        assertEquals(expected, deli.getAdd());
    }

}
