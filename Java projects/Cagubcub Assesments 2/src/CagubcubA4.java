/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*JOHN ROMAINE CAGUBCUB
 */
import java.util.*;
/**
 *JOHN ROMAINE CAGUBCUB
 * @author student
 */
public class CagubcubA4 {
    public static void main (String[] args){
        Scanner p = new Scanner(System.in);
        String z = p.nextLine();
        String r = "";
        int w = z.length();
        for (int t = w-1;t>=0;t--){
            r = r + z.charAt(t);
        }
        System.out.println(r);
    }
}
//JOHN ROMAINE CAGUBCUB