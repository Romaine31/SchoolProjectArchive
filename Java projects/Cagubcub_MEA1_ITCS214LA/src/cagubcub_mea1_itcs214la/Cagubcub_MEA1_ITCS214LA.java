// JOHN ROMAINE CAGUBCUB
package cagubcub_mea1_itcs214la;
import java.util.Scanner;

public class Cagubcub_MEA1_ITCS214LA {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("size: "); //  ARRAY SIZE
        int lim = console.nextInt();
        int list[] = new int[lim];
        int temp = 0, key, num;
        
        //ENTER ELEMENTS
        System.out.println("enter elements in the array");
        for (num = 0; num<lim;num++){
            list[num]=console.nextInt();
        }
        
        //BUBBLE SORT
        for (num = 0; num<lim; num++){
            for (int sort = 1; sort < (lim-num); sort++){
                if(list[sort-1] > list[sort]){
                    temp = list[sort-1];
                    list[sort-1] = list[sort];
                    list[sort] = temp;
                }
            }
        }
        
        // DISPLAY SORTED ARRAY
        System.out.println("Output: ");
        for (num=0;num<lim;num++){
            System.out.print(list[num]+", ");
        }
        System.out.println("");
        
        // SEARCH ARRAY
        System.out.print("Search for the index of: ");
        key = console.nextInt();
        for(num = 1; num<lim; num++){
            if (list[num] == key){
                System.out.println(key+" is at index: "+num);
                break;
            }
    }
                if (num == lim)
                System.out.println(key+" is not present");
}
}
// JOHN ROMAINE CAGUBCUB