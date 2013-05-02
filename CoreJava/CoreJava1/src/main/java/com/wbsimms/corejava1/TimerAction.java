/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wbsimms.corejava1;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

/**
 *
 * @author wbsimms
 */
public class TimerAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("Timer fired at "+now);
        Toolkit.getDefaultToolkit().beep();
    }
}
