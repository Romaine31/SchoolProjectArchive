/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*JOHN ROMAINE CAGUBCUB
 */
import java.util.Scanner;
/**
 * JOHN ROMAINE CAGUBCUB
 * @author student
 */
public class CagubcubA5 {
    public static void main (String[] args){
        Scanner t = new Scanner (System.in);
        int x=0,y=1,z,w,n=0;
        int q = t.nextInt();
        for (w=1;w<q;w++){
            z=x+y;
            y=w;
            x=y;
            n=n+z;
        if(z%2 == 0)
            n += z;
        

    }
        System.out.println(n);
}
    }//JOHN ROMAINE CAGUBCUB