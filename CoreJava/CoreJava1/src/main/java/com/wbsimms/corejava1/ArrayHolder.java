/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wbsimms.corejava1;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import lombok.Getter;
import lombok.Setter;

/*
 *
 * @author Wm.Barrett
 */
public class ArrayHolder {
    @Getter @Setter public ArrayList<GregorianCalendar> calendarList;
    
    public ArrayHolder()
    {
        calendarList = new ArrayList<>();
    }
    
    public void addCalendar(GregorianCalendar calendar)
    {
        calendarList.add(calendar);
    }
}
