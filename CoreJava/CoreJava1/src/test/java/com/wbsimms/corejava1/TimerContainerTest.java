/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wbsimms.corejava1;

import junit.framework.TestCase;

/**
 *
 * @author wbsimms
 */
public class TimerContainerTest extends TestCase {
    
    public TimerContainerTest(String testName) {
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

    /**
     * Test of StartTimer method, of class TimerContainer.
     */
    public void testStartTimer() throws InterruptedException {
        System.out.println("StartTimer");
        TimerContainer instance = new TimerContainer();
        assertNotNull(instance);
//        instance.TimerSwitch();
//        Thread.sleep(50000);
//        instance.TimerSwitch();
    }
}
