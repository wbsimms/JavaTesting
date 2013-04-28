/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wbsimms.corejava1;

import java.util.Calendar;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author Wm.Barrett
 */
public class DateFormatterTest extends TestCase {
    
    public DateFormatterTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetYear() {
        System.out.println("getYear");
        DateFormatter instance = new DateFormatter();
        instance.setYear(2013);
        int expResult = 2013;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }
    
    public void testGetCalendar() {
        DateFormatter instance = new DateFormatter();
        instance.setYear(2013);
        instance.setMonth(5);
        instance.setDay(1);
        Calendar expResult = Calendar.getInstance();
        expResult.set(2013, 5, 1);
        Calendar result = instance.getCalendar();
        assertEquals(expResult, result);
        assertNotSame(expResult, result);
    }

}
