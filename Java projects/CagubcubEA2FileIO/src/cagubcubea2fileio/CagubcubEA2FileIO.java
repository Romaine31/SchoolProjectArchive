
package cagubcubea2fileio;
import java.util.*;
import java.io.*;
//JOHN ROMAINE CAGUBCUB
public class CagubcubEA2FileIO {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner infile = new Scanner (new FileReader("grade.dat"));
        PrintWriter outfile = new PrintWriter ("averages.txt");
        double g1, g2, g3, g4, g5, sum, ave;
        String firstname, lastname;
        
        while(infile.hasNext()){
            firstname = infile.next();
            lastname = infile.next();
            g1 = infile.nextDouble();
            g2 = infile.nextDouble();
            g3 = infile.nextDouble();
            g4 = infile.nextDouble();
            g5 = infile.nextDouble();
            sum = g1+g2+g3+g4+g5;
            ave = sum/5;
            outfile.println(firstname + " " + lastname + " " + "'s grades are: " + g1 + ", " + g2 + ", " + g3 + ", " + g4 + ", " + g5 + " and their average is: " + ave);
            
        }
            
        infile.close();
        outfile.close();
        
    }
    
}
