import java.util.*;
public class CagubcubFSA1Recursion {

    /**
     * JOHN ROMAINE CAGUBCUB
     */
    
    static int Converter(int x){
        if (x == 0){
            return 0;
        }else
            return (x % 2 + 10 * Converter(x / 2));
    }
    
    public static void main(String[] args) {
        int num = 20, num2 = 30, num3 = 25;
        System.out.println(Converter(num));
        System.out.println(Converter(num2));
        System.out.println(Converter(num3));
    }  
}
