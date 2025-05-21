package test;
//john romaine cagubcub

import java.util.Scanner;

public class root {
    public static void main (String args[]){
        System.out.println("select class number");
        System.out.println("1 = Rogue");
        System.out.println("2 = archer");
        System.out.println("3 = Assassin");
        Scanner q = new Scanner (System.in);
        int z = q.nextInt();
        //john romaine cagubcub
        if (z == 1){
            int v = 6;
            int b = 4;
            int n = 200;
            classes rogu = new classes (v,b,n);
                System.out.println("HP: "+rogu.gethp());
                System.out.println("Armor: "+rogu.getA());
                System.out.println("MP: "+rogu.getmp());
            }else if (z == 2){
                int f = 5;
                int g = 5;
                int o = 250;
             classes archeru = new classes(f,g,o);
             System.out.println("HP: "+archeru.gethp());
             System.out.println("Armor: "+archeru.getA());
             System.out.println("MP: "+archeru.getmp());
            }else if (z == 3){
                int j=6;
                int k=3;
                int l=180;
                classes assassinu = new classes (j,k,l);
                System.out.println("HP: "+assassinu.gethp());
                System.out.println("Armor: "+assassinu.getA());
                System.out.println("MP: "+assassinu.getmp());
                //john romaine cagubcub
            }
        }
}