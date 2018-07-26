package com.timo.annotationProcessor;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author qinlinsen
 */
public class DateTest {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(Calendar.YEAR,1);
        System.out.println(gregorianCalendar.get(Calendar.YEAR));
        System.out.println(gregorianCalendar.get(Calendar.MONTH));
        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_MONTH));
    }
}
