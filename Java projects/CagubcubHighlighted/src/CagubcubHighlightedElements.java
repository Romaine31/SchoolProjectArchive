/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author John romaine Cagubcub
 */
public class CagubcubHighlightedElements {
    public static void main (String args[]){
        Scanner console = new Scanner(System.in);
        int size, x, y, input, sum=0;
        System.out.print("Input size of grid: ");
        size = console.nextInt();
        x = y = size;
        int grid[][] = new int[x][y];
        System.out.println("Please input values: ");
        //array input code
        for (x = 0; x<size; x++){
            for (y = 0; y<size; y++){
                grid[x][y] = console.nextInt();
            }
        }
        System.out.println("");
        //array print code
        for(x=0; x<size; x++){
            for (y=0; y<size; y++){
                System.out.print(" "+grid[x][y]);
            }
            System.out.println(" ");
        }
        //uhhhhh
        for(x=0; x<grid.length;x++){
            grid[x][x] = 0;
            grid[x][grid.length - x-1] = 0;
        }
        // add all the highlighted
        for(x = 0; x<size; x++){
            for (y=0; y<size; y++){
                sum += grid[x][y];
            }
        }
        System.out.println("");
        System.out.println(sum);
    }
}
