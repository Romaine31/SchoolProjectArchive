/*JOHN ROMAINE CAGUBCUB
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JOHN ROMAINE CAGUBCUB
 */
public class overloadingmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner zed = new Scanner (System.in);
        System.out.println("input integer value");
        int q = zed.nextInt();
        System.out.println("input double value");
        double w = zed.nextDouble();
        overloadingsub var = new overloadingsub(q, w);
        System.out.println("the square of integer: "+q+" is: "+var.getint());
        System.out.println("the square of double: "+w+" is: "+var.getdouble());
        // JOHN ROMAINE CAGUBCUB
    }
    
}
