/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.  JOHN ROMAINE CAgUBCUB 
 */
package cagubcubgrade;
import java.util.Scanner;
/**
 *
 * @author Raine
 */
public class CagubcubGrade {

    /**
     * @param args the command line arguments    JOHN ROMAINE CAGUBCUB
     */
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        double mwt, mpt, mme;
        double ftw, fpt, fme;
        double MG,FG,SG;
        boolean check;
        System.out.println("inpute student name");
        String x = z.nextLine();
        do{
            System.out.println("input midterms written task grade: ");
            mwt = z.nextDouble();
            System.out.println("input midterms performance task grade: ");
            mpt = z.nextDouble();
            System.out.println("input midterms major exam grade: ");
            mme = z.nextDouble();
            if (mwt >100 || mpt >100 || mme>100){
                System.out.println("VALUES ENTERED ARE OVER EXPECTED LIMIT PLEASE TRY AGAIN");
            }
            check = mwt >100 || mpt >100 || mme>100;
        }while (check);
        System.out.println(x+"'s midterm grade: "+MFG(mwt,mpt,mme));
        double o = MFG(mwt,mpt,mme);
        do{
            System.out.println("input finals written task grade: ");
            ftw = z.nextDouble();
            System.out.println("input finals performance task grade: ");
            fpt = z.nextDouble();
            System.out.println("input finals major exam grade: ");
            fme = z.nextDouble();
            if (ftw>100||fpt>100||fme>100){
                System.out.println("VALUES ENTERED ARE OVER EXPECTED LIMIT PLEASE TRY AGAIN");
            }
            check = ftw>100||fpt>100||fme>100;
        }while (check);
        System.out.println(x+"'s finals grade: "+MFG(ftw,fpt,fme));
        double p = MFG(ftw,fpt,fme);
        
        SG = o+p;
        System.out.println("Semestral Grade: "+SG/2);
    }
    //JOHN ROMAINE CAGUBCUB
    public static double MFG (double x, double y, double z){
        x=x*0.20;
        y=y*0.60;
        z=z*0.20;
        double q = x+y+z;
        return q;
    }
}
