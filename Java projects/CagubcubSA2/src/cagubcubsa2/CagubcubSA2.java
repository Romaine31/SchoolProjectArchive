package cagubcubsa2;
import java.util.*;
/**
 *
 * @author John Romaine Cagubcub
 * BCS21
 */
public class CagubcubSA2 { //i'll just use this as the name
/**
 * i don't really need to do this since this is in the main class
 * but the idea behind it is that i'd probably use the methods on an different
 * class but i'll just use one file for demonstration
 */
private Scanner inConsole = new Scanner(System.in);// scanner and stack create
private Stack<String> inStack = new Stack<String>(); // made private for the reason stated above

    public void push(){ // push method
        System.out.print("Enter size of the stack: ");
        int c = inConsole.nextInt();
        System.out.println("push elements into stack: ");
        for(int x = 0; x<c; x++){
           inStack.push(inConsole.next());
        }
    }
    
    public void pop(){ // pop method
        System.out.println("The popped element is: "+inStack.pop());
    }
    
    public void peek(){ // peek method
        System.out.println("The top element is: "+inStack.peek());
    }
    
    public Stack print(){ //print method
        return inStack;
    }
                   
    public static void main(String[] args) {
        CagubcubSA2 stackie = new CagubcubSA2();
        stackie.push();
        System.out.println("The stack: "+stackie.print());
        stackie.pop();
        System.out.println("");
        System.out.println("The stack: "+stackie.print());
        stackie.peek();
    }
    
}