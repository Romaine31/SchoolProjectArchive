package cagubcubbasicio;
import java.util.*;
import java.text.DecimalFormat;
//John Romaine Cagubcub
public class CagubcubBasicIO {

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        DecimalFormat pleasework = new DecimalFormat("###,###.##"); //formatter
        
        System.out.println("please input the corresponding values"); //insane amount of clutter for formality sake
        System.out.print("x1: ");
        double xOne = console.nextDouble();
        System.out.print("x2: ");
        double xTwo = console.nextDouble();
        System.out.print("y1: ");
        double yOne = console.nextDouble();
        System.out.print("y2: ");
        double yTwo = console.nextDouble();
        
        double X = theMath(xTwo,xOne); //some other math
        double Y = theMath(yTwo,yOne);
        
        double Z = (Math.sqrt(X+Y)); //square root using math function
        System.out.println(pleasework.format(Z)); //output
        
    }
    public static Double theMath (double x, double y){  //some math
        double z = x - y;
        double w = z * z;
        return w;
    }
}
