/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cagubcubrecursion;

/**
 *
 * @author JOHN ROMAINE CAGUBCUB
 */
public class CagubcubRecursion {

    static void odd(int first, int last){

        if (last < first){
            return;
        }
        
        if (last % 2 == 1){
            
           odd(first, last-2); 
        }else
            odd(first, last-1);
        
    if (last % 2 ==1){
    System.out.print(last + ", ");
}
    }
    
    static void even(int first, int last){

        if (last < first){
            return;
        }
        
        if (last % 2 == 0){
            even(first, last - 2);
        }else
            even(first,last - 1);
    if (last % 2 == 0){
        System.out.print(last + ", ");
    }
    }

    public static void main(String[] args) {
        int first=10, last=30;
        if (last < first)
            System.out.println("error, limit is higher than starting number");
        else {
        System.out.println("Even numbers: ");
        even(first,last);
        System.out.println("");
        System.out.println("odd numbers");
        odd(first,last);
        }
    }
    
}
