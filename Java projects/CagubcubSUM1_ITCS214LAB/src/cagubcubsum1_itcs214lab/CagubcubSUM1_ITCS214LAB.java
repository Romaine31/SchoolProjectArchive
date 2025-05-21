
package cagubcubsum1_itcs214lab;
import java.util.*;

public class CagubcubSUM1_ITCS214LAB {
// john romaine cagubcub

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);// initialization stuff
        int sum=0, maxnum=0, maxind, temp;
        double average;
        ArrayList<Integer> list = new ArrayList<Integer>();
                //array size
        System.out.print("List Size: ");
        int lim = console.nextInt();
                //array value input
        System.out.println("Please input values: ");
        for(int z=0; z<lim; z++)
            list.add(console.nextInt());
                //array print
        System.out.println("Inputted Values: "+list);
                //array get average
        for(int z=0; z<lim; z++)
            sum += list.get(z);
        average = sum/lim;
        System.out.println("The average of the list: "+average);
                //array get highest number
        for(int z=0; z<lim; z++)
            if (list.get(z)>maxnum)
                maxnum = list.get(z);
        maxind = list.indexOf(maxnum);
        System.out.println("Index of the highest value: "+maxnum+" is "+maxind);
                //array remove highest number
        list.remove(maxind);
                //sort array
        Collections.sort(list); //i tried to use bubble sort algorithm first but it wouldn't work
        System.out.println(list); //print
    }
    
}
