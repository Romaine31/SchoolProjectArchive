/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.   JOHN ROMAINE CAGUBCUB
 */
import java.util.Scanner;
/**
 *
 * @author Raine
 */
public class player {
    pick s = new pick();
    Scanner z = new Scanner (System.in);
    private String name;
    public void setname (){
        this.name = name;
    }
    public String getname () {
        return name;
    }
    public void entername (){
        name = z.nextLine();
    }
    //JOHN ROMAINE CAGUBCUB
    
    public int decision(){
        String r = z.next();
        char t = r.charAt(0);
        if (t=='D'||t=='d')
            return pick.DIAMOND;
        else if (t=='M'||t=='m')
            return pick.MAGIC;
        else if (t=='S'||t=='s')
            return pick.SWORD;
        else{
            return 0;
        }
    }
    public boolean respawn() {
        z = new Scanner (System.in);
                    System.out.println("would you like to play again");
        String eh = z.nextLine();
        eh = eh.toUpperCase();
        return eh.charAt(0) == 'Y';
    }
}
//JOHN ROMAINE CAGUBCUB