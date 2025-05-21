
package cagubcub_programmingassesment1;
import java.util.Scanner;
//JOHN ROMAINE CAGUBCUB
public class Cagubcub_ProgrammingAssesment1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final int SECRET = 11;
        final double RATE = 12.50;
        int num1, num2, newNum;
        double hoursWorked, wages;
        String name;
        System.out.println("Please input two integers: ");
        num1 = console.nextInt();
        num2 = console.nextInt();
        console.nextLine(); 
        System.out.println("number 1 = "+num1+"\nnumber 2 = "+num2);
        newNum = num1*2+num2;
        System.out.println("the current newNum is: "+newNum);
        newNum += SECRET;
        System.out.println("the new value of variable newNum is: "+newNum);
        System.out.print("What is your last name?: ");
        name = console.nextLine();
        System.out.print("how many hourse do you work?(0-70): ");
        hoursWorked = console.nextDouble();
        wages = RATE * hoursWorked;
        System.out.println("Name: "+name+"\nPay Rate: $"+RATE+"\nHours worked: "+hoursWorked+"Saary: $"+wages);
    }
    
}
