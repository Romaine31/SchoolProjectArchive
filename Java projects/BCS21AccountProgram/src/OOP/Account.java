/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package OOP;

/**
 *
 * @author Faculty
 */
public class Account {
    int acctNum;
    String name;
    double balance;
    public static double minBal = 5000;
    static int num = 1000;

   

  
    public Account(String name, double balance){
        num++;
        this.acctNum = num;
        this.name = name;
        this.balance = balance;
        
      
    }

    public int getAccNum()
    {return this.acctNum;}

    public String getAccName(){
        return this.name;
    }
    
    @Override
    public String toString(){

        return "\nAccount #:" + this.acctNum +
                "\nAccount Name: " + this.name +
                "\nBalance:" + this.balance +
                "\n";
    }

   

    public double getBalance()
    {return balance;
       
    }
    
    public double deposit(double x){
        this.balance = this.balance+x;
        return this.balance;
    }
    
    public double withdraw(double x){
        this.balance = this.balance-x;
        return this.balance;
    }
    
    //John Romaine Cagubcub
    
}