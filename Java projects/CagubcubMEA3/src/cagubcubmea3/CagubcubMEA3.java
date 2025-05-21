package cagubcubmea3;
import java.util.LinkedList;
// JOHN ROMAINE CAGUBCUB
public class CagubcubMEA3 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        // Adds names into the linked list
        list.add("AC");
        list.add("IO");
        list.add("RJ");
        list.add("Matt");
        list.add("Pat");
        list.add("Ben");
        list.add("Jer");
        list.add("Ivan");
        list.add("Sean");
        list.add("John");
        
        // Prints linked list
        System.out.println("Names in the list: "+list);
        
        // Will hold the first 3 names
        String temp1 = list.get(0);
        String temp2 = list.get(1);
        String temp3 = list.get(2);
        // removes the first 3 names
        for (int x=0; x<3; x++)
            list.remove(0);
        // prints the list starting from the 3rd name
        System.out.println("all names starting from the 3rd index: "+list);
        // returns the name to the list
        list.addFirst(temp3);
        list.addFirst(temp2);
        list.addFirst(temp1);
        
        // Inter my name at 5th position
        list.add(4, "Romaine");
        // Replacing my name with nickname
        list.set(4, "Roman");
        // Remove 6th element
        list.remove(5); 
        System.out.println("the updated list of names: "+list);
    }// JOHN ROMAINE CAGUBCUB
    
}
