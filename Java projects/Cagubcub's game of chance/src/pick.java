/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.   JOHN ROMAINE CAGUBCUB
 */

/**
 *
 * @author Raine
 */
public class pick {
    public static final int DIAMOND = 1, MAGIC = 2, SWORD = 3;

public static int judgement (int z, int x){
if(z==x) return 0;
switch (z) {
    case DIAMOND:
        return (x==SWORD?1:-1);
    case MAGIC:
        return (x==DIAMOND?1:-1);
    case SWORD:
        return(x==MAGIC?1:-1);//JOHN ROMAINE CAGUBCUB
}return 0;
}
public static void ydoihavetoprintit (String q, int r){
    switch (r){
        case pick.DIAMOND:
            System.out.println(q+" used DIAMOND ");
            break;
        case pick.MAGIC:
            System.out.println(q+" used MAGIC ");
            break;
        case pick.SWORD:
            System.out.println(q+" used SWORD ");
            break;
        default:
            break;
    }
}
}//JOHN ROMAINE CAGUBCUB