// JOHN ROMAINE CAGUBCUB
import java.util.*;

public class ArmstrongNumberIsDifficult {
    public static void main (String[] args){
    Scanner z = new Scanner(System.in);
    System.out.println("input any value of any length");
    int x = z.nextInt();
    int y=x, q, w, e=0, lenght1;
    lenght1 = String.valueOf(y).length();
    do {
        w = y%10;
        e = e + (int) Math.pow(w, lenght1);//JOHN ROMAINE CAGUBCUB
        y = y/10;
    }while(y!=0);
            if (e == x)
                System.out.println(x+" is an armstrong number");
            else
                System.out.println(x+" is not an armstrong number");
    }
}
// JOHN ROMAINE CAGUBCUB
/*note this code will not display the seperate explanations for each and every
* computation to show why it is an armstrong number.
* BUT
* It will accept any amount of value (atleast within java's int limit)
* and Identify whether it is an armstrong number or not
*/