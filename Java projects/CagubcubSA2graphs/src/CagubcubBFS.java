import java.util.*;
/**
 * John Romaine Cagubcub
 * BCS21
 */
class BFS{
    
    private int x;
    private LinkedList<Integer> list[]; // the list
 
    //constructor
    BFS(int y){
        x = y;
        list = new LinkedList[y];
        for (int i=0; i<y; ++i)
            list[i] = new LinkedList();
    }
    
    //function that adds edges into the graph
    void addEdge(int y,int z){
        list[y].add(z);
    }
    
    //The BFS printing function
    void print(int c){
        boolean passed[] = new boolean[x]; //marks visited vertices
        LinkedList<Integer> queue = new LinkedList<Integer>();
        passed[c]=true; //marks the current node as visited and enqueue
        queue.add(c);
        while (queue.size() != 0){
            c = queue.poll();
            System.out.print(c+" "); //dequeue and print vertex
            /**checks all adjacent vertices, if not marked as visited
               then mark it as visited and enqueue it */
            Iterator<Integer> i = list[c].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!passed[n]){
                    passed[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    
    // driver
    public static void main (String args[]){
        BFS Graph = new BFS(7);
        
        Graph.addEdge(0,1);
        Graph.addEdge(0,3);
        Graph.addEdge(1,2);
        Graph.addEdge(1,3);
        Graph.addEdge(1,5);
        Graph.addEdge(1,6);
        Graph.addEdge(2,3);
        Graph.addEdge(2,4);
        Graph.addEdge(2,5);
        Graph.addEdge(3,4);
        Graph.addEdge(4,6);
        
        System.out.println("Breadth first Traversal (index 0): ");
        Graph.print(0);
    }
}
