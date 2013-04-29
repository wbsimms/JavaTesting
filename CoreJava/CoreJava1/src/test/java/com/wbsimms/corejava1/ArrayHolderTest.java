/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wbsimms.corejava1;

import java.util.Date;
import java.util.GregorianCalendar;
import junit.framework.TestCase;

/**
 *
 * @author Wm.Barrett
 */
public class ArrayHolderTest extends TestCase {
    
    public ArrayHolderTest(String testName) {
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

    public void testSomeMethod() {
        ArrayHolder h = new ArrayHolder();
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        h.addCalendar(cal);
        assertTrue(h.calendarList.size() == 1);
    }
}
