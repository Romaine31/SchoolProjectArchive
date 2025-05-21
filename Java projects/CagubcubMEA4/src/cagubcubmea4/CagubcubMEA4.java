package cagubcubmea4;
import java.util.*;
// JOHN ROMAINE CAGUBCUB
public class CagubcubMEA4 {

    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        // insert stack elements
        nums.push(12);
        nums.push(18);
        nums.push(14);
        nums.push(6);
        nums.push(7);
        nums.push(9);
        nums.push(21);
        nums.push(2);
        // risplay stack
        System.out.println("Integers in stack: "+nums);
        // remove element
        System.out.print("Integers popped: "+nums.pop()+", ");
        System.out.println(nums.pop());
        // add element into stack
        nums.add(2,100);
        nums.add(6,200);
        // Remove element at index 3
        nums.remove(3);
        System.out.println("Integers in stack: "+nums);
        // get stack size
        System.out.println("size of stack: "+nums.size());
        // display the first element of the stack
        System.out.println("The first Integer in the stack: "+nums.firstElement());
        // remove all the elements of the stack
        nums.clear();
        // determine if the stack is empty
        boolean empty = (nums.size() == 0);
        System.out.println("Is the stack empty?: "+empty);
        // display the final list of elements
        System.out.println("Final list of Integers: "+nums);
    }  
}
