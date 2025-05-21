/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs21classdemo;

/**
 *
 * @author Sherry
 */
import javax.swing.JOptionPane;
public class BCS21ClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //driver program /implement the user-defined class
      Clock myClock = new Clock(); 
      Clock yourClock = new Clock(8,10,20); //instantiantion
      
      System.out.print("My Clock is:   ");
      myClock.printTime();
      System.out.println("Your Clock is: " + yourClock.toString());
      
      System.out.println("===================================");
      //deep copying
      
      myClock.makeCopy(yourClock);
      
      System.out.print("My Clock is:   ");
      myClock.printTime();
      System.out.println("Your Clock is: " + yourClock.toString());
      
      System.out.println("===================================");
      
      myClock.setHours(17);
      System.out.print("My Clock is:   ");
      myClock.printTime();
      System.out.println("Your Clock is: " + yourClock.toString());
      
      System.out.println("===================================");
      myClock.setHours(23);
      myClock.setMinutes(59);
      myClock.incrementMinutes();
      System.out.println(myClock);
    }
    
}
