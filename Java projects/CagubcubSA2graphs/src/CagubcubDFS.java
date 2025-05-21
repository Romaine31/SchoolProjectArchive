import java.util.*;
/**
 * John Romaine Cagubcub
 * BCS21
 */
class DFS{
    private int X;
    private LinkedList<Integer> list[]; // the list itself
    
    // constructor
    DFS(int x){
		X = x;
		list = new LinkedList[x];
		for (int y = 0; y < x; ++y)
			list[y] = new LinkedList();
	}
    
    // function that adds edges into the graph
    void addEdge(int x, int y){
		list[x].add(y);
	}

    // function used by DFS
    void DFSUtil(int x, boolean passed[]){
		passed[x] = true; //mark the current node as visited and print
		System.out.print(x + " ");
                // repeats for all adjacent vertices
		Iterator<Integer> y = list[x].listIterator();
		while (y.hasNext()) {
			int z = y.next();
			if (!passed[z])
				DFSUtil(z, passed);
		}
	}
    // function to do DFS traversal
    void print(int v){
        // mark all vertices as not visited
	boolean passed[] = new boolean[X];
        // recursive method
	DFSUtil(v, passed);
	}
    // Driver
    public static void main(String args[]){
        
	DFS Graph = new DFS(7);

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

	System.out.println("Depth First Traversal (vertex 0): ");

	Graph.print(0);
	}
}