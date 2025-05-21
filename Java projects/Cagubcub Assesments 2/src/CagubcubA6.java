/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* JOHN ROMAINE CAGUBCUB
 */
import java.util.Scanner;
/**
 *
 * @author Raine
 */
public class CagubcubA6 {
     public static void main(String[] args) {
         Scanner z = new Scanner (System.in);
        int r = 0, w = 0;
        int x = z.nextInt();
        if (x <= 1) {
        System.out.println("");
  } 
        else {
   for (int y = 2; y <= x; y++) {      
    if (x % y == 0) {
        
     for (int p = 2; p <= y; p++) {    
      if (y % p == 0) {
       r++;
      }
    // JOHN ROMAINE CAGUBCUB
     }   
     if (r == 1) {
         
      if (w < y) {
       w = y;
      }
      
     }
     
     r = 0;
    }
    
   }
   System.out.println(w);
  }     
 }
}

//JOHN ROMAINE CAGUBCUB