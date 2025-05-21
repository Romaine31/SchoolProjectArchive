import java.util.*;
public class CagubcubFSA1 {

    /**
     * JOHN ROMAINE CAGUBCUB
     */
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList();
        //add element
        Q.add(241);
        Q.add(526);
        Q.add(2155);
        Q.add(122);
        Q.add(662);
        //print first element
        System.out.println("Number first on the Queue: "+Q.element());
        //remove first element
        System.out.println("Number Exited the Queue: "+Q.poll());
        System.out.println("New number first in the queue: "+Q.element());
        //check queue size
        System.out.println("Current Size of the Queue: "+Q.size());
        //remove ueue
        Q.removeAll(Q);
        System.out.println("Queue: "+Q);
    }
    

    
}
