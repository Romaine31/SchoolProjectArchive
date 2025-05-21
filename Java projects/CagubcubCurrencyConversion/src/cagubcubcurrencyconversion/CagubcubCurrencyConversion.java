package cagubcubcurrencyconversion;
import java.util.Scanner;
/**
 *
 * @author John Romaine Cagubcub
 */
public class CagubcubCurrencyConversion {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("please input cash in USD");
        double USD = console.nextDouble();
        double PHP = USD * 49.909;
        double round = PHP * 100.0;
        double add = round + .5;
        int convert = (int) add;
        double result = convert / 100.0;
        System.out.println("you have: "+result+" pesos");
    }
    
}
