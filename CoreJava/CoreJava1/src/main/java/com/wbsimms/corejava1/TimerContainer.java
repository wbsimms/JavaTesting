/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wbsimms.corejava1;

import java.awt.event.ActionListener;
import javax.swing.Timer;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author wbsimms
 */
public class TimerContainer {
    @Getter @Setter boolean runTimer = false;
    private static Timer t;
    
    public TimerContainer()
    {
    }
    
    public void TimerSwitch()
    {
        if (!runTimer)
        {
            runTimer = true;
            ActionListener listener = new TimerAction();
            t = new Timer(10000,listener);
            t.start();
        }
        else
        {
            t.stop();
            runTimer = false;
        }
    }
}

