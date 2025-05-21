/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author john Romaine Cagubcub
 */
public class CagubcubDiagonalTwo {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int size, input, x, y, sum=0;
        System.out.print("please input size of grid: ");
        size = console.nextInt();
        x = y = size;
        int grid[][] = new int [x][y];
        System.out.println("enter values: ");
        //array input code
        for (x = 0; x<size; x++){
            for (y = 0; y<size; y++){
                grid[x][y] = console.nextInt();
            }
        }
        //array print code
        for(x=0; x<size; x++){
            for (y=0; y<size; y++){
                System.out.print(" "+grid[x][y]);
            }
            System.out.println(" ");
        }
        //add diagonal code
        for(x = 0;x<grid.length; x++){   
            sum += grid[x][grid.length - x-1];
        }
        System.out.println(sum);
        
        
        
        
        
    }
}
