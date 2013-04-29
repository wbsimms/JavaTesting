package com.wbsimms.corejava1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        System.out.format("%s %s","You said : ",line);
    }
}
