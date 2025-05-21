
package midsum1_cagubucub;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
//JOHN ROMAINE CAGUBCUB
public class MidSum1_Cagubucub {
    public static void main(String[] args) throws FileNotFoundException { 
        Scanner inFile = new Scanner (new FileReader("C:/studentRecord.txt"));
        String search = JOptionPane.showInputDialog("Input program code:").toUpperCase();
        PrintWriter outFile = new PrintWriter("studentList.txt");
        int x=0; //variable intiation
        
        //file listing
        while (inFile.hasNext()){
            String Snum = inFile.next();
            String Fname = inFile.next();
            String Mname = inFile.next();
            String Lname = inFile.next();
            String code = inFile.next();
            if (code.contains(search)){
                System.out.println(Fname +"\t"+ Mname +"\t"+ Lname);
                x++; //console output
            }
        }
        
        //file output. Project Directory
        if (x > 0){
            outFile.println(search+"\t"+x);
        }else outFile.println();
        inFile.close(); //close file
        outFile.close();
    }
    
}
