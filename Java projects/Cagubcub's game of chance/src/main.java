/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *JOHN ROMAINE CAGUBCUB
 * @author Raine
 */
public class main {
    static int yourscore=0,hiscore=0,games=0;
    public static void main (String[] args){
        player you = new player();
        computer him = new computer();
        System.out.println("input name");
        you.entername();
        main.starto();
    }
    public static void starto(){
        pick yee = new pick();
        player you = new player();
        computer him = new computer();
        int u = you.decision();
        pick.ydoihavetoprintit(you.getname(), u);
        int h = him.cpu();
        pick.ydoihavetoprintit("cpu", h);
        int diff = pick.judgement(u, h);
        switch (diff){
            case 0:
                System.out.println("DOUBLE KO!");
                break;
            case 1:
                System.out.println("YOU WIN!");
                yourscore++;
                break;
            case -1:
                System.out.println("YOU LOSE!");
                hiscore++;
                break;
        }//JOHN ROMAINE CAGUBCUB
        games++;
        if(yourscore==5){
            System.out.println(you.getname()+" HAS WON");
            yourscore=0;hiscore=0;games=0;
        }
        if (hiscore==5){
            System.out.println("CPU "+" HAS WON");
            yourscore=0;hiscore=0;games=0;
        }
        if (you.respawn()){
            starto();
        }else{
            System.out.println("GAME OVER");
            System.out.println(you.getname()+"'s score "+yourscore);
            System.out.println("Played "+games+" games");
        }   
    }//JOHN ROMAINE CAGUBCUB
}
