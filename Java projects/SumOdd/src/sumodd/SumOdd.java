/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumodd;

/**
 *
 * @author John Romaine Cagubcub
 */
public class SumOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0,y;
        for (y=1;y<=50;y++){
        if (y % 2 != 0){
            x=x+y;
        }
    }   System.out.println(x);
    }
}
