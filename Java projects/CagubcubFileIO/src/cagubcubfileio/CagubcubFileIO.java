
package cagubcubfileio;
import java.util.*;
import java.io.*;
//JOHN ROMAINE CAGUBCUB
public class CagubcubFileIO {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner infile = new Scanner(new FileReader("grade.dat"));
        PrintWriter outfile = new PrintWriter("average.txt");
        double g1, g2, g3, g4, g5, Sum, Average;
        String firstname = infile.next();
        String lastname = infile.next();
        g1 = infile.nextDouble();
        g2 = infile.nextDouble();
        g3 = infile.nextDouble();
        g4 = infile.nextDouble();
        g5 = infile.nextDouble();
        Sum = g1+g2+g3+g4+g5;
        Average = Sum/5;
        outfile.println(firstname + " " + lastname + "'s grades are: " +g1+", "+g2+", "+g3+", "+g4+", "+g5+ " and their average is: "+Average);
        infile.close();
        outfile.close();
    }
    
}
