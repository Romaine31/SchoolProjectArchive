
package cagubcub_mea2_arraylist;
import java.util.*;
/**
 * JOHN ROMAINE CAGUBCUB
 * THIS ARRAY LIST USES STRING
 */
public class Cagubcub_MEA2_ArrayList {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> Users = new ArrayList<String>();
        
        System.out.print("List size: "); // input array list size
        int amount = console.nextInt();
        
        System.out.println("Please input usernames: "); // input array list elements
        for (int count=0; count < amount; count++){
            Users.add(console.next());
        }
        
        System.out.print("Change an element at index: "); // change element
        int indx = console.nextInt();
        System.out.print("Change Element to: ");
        String newElement = console.next();
        Users.set(indx, newElement);
        System.out.println(Users);
        
        System.out.print("Remove Element at index: "); // renmove element
        Users.remove(console.nextInt());
        
        System.out.println(Users); // print arraylist
        
    }
    
}
