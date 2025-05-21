/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Romaine
 */
public class LoanMethods {
    
    public double LoanAmount(double x){
        return x*2.5;
    }
    public double Interest(double x, double y){
        double z = 0;
        if (y >= 1 && y<=5)
            z = 0.0062;
        else if (y >= 6 && y <=10)
            z = 0.0065;
        else if (y >= 11 && y <=15)
            z = 0.0068;
        else if (y >= 16 && y <= 20)
            z = 0.0075;
        else if (y >= 21 && y <= 25)
            z = 0.0080;
        return x*y*z;
    }
    public double ServiceCharge (double x){
        return x*.20;
    }
    public double TakeHomeLoan (double x, double y, double z){
        return x-y-z;
    }
    public double MonthlyAmotization(double x, double y){
        return x/y;
    }
}
