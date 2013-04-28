/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wbsimms.corejava1;

import java.util.Calendar;
import java.util.Date;
import lombok.*;


/**
 *
 * @author Wm.Barrett
 */
public class DateFormatter {
    @Getter @Setter private int year;
    @Getter @Setter private int day;
    @Getter @Setter private int month;
    private Date date;
    
    public DateFormatter()
    {}
    
    public Calendar getCalendar()
    {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        return cal;
    }
}
