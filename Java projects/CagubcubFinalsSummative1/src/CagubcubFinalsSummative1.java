
import java.util.*;
import java.lang.Math;
/**
 *
 * @author John Romaine Cagubcub
 */
public class CagubcubFinalsSummative1 {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size,x,y,z=0,input,count = 0,dis=0;
        System.out.print("input size of grid: ");
        size = console.nextInt();
        x=y=size;
        //makes array
        int grid[][] = new int[y][x];
        for (y = 0; y<size; y++){
            for (x = 0; x<size; x++){
                grid[y][x] = (int) (Math.random()*2);
            }
        }
        System.out.println("");
        //prints array
        for(y=0; y<size; y++){
            for (x=0; x<size; x++){
                System.out.print(" "+grid[y][x]);
            }
            System.out.println(" ");
        }
        System.out.println("");
        //scanning the rows
        for (y=0; y<size; y++){
            count = 0;
            for (x=0; x<size; x++){
                if (grid[y][x]==1){
                    count++;
                }
            }
            if (count == size)
                System.out.println("All 1s on row: "+z);
            else if (count == 0)
                System.out.println("All 0s on row: "+z);
            else dis++;
            z++;
        }
        if (dis == size)
            System.out.println("All rows do not have equal numbers");
        //reset variable
        dis = z = 0;
        //scanning the columns
        for (x=0 ; x<size; x++){
            count = 0;
            for(y=0; y<size; y++){
                if (grid[y][x]==1){
                    count++;
                }
            }
            if (count == size)
                System.out.println("All 1s on column: "+z);
            else if (count == 0)
                System.out.println("All 0s on column: "+z);
            else dis++;
            z++;
        }
        if (dis == size)
            System.out.println("All column do not have equal numbers");
        //reset variable,
        count=dis=0;
        //scan diagonals
        for (y=0; y<grid.length; y++){
            if (grid[y][y] == 1)
                count++;
            if (grid[y][grid.length-y-1] == 1)
                dis++;
        }
        if (count == size)
            System.out.println("All 1s on 1st diagonal");
        else if (count == 0)
            System.out.println("All 0s on 1st diagonal");
        else
            System.out.println("No equal numbers on first diagonal");
        if (dis == size)
            System.out.println("All 1s on 2nd diagonal");
        else if (dis == 0)
            System.out.println("All 0s on 2nd diagonal");
        else
            System.out.println("No equal numbers on second diagonal");
    }
    
}
