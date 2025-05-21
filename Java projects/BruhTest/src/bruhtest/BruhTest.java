/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package bruhtest;



/**
*
* @author Sherry
*/
import java.util.Scanner;
public class BruhTest {




public static void main(String[] args) {
Scanner console = new Scanner(System.in);

int i;
int list[] = {2,18,6,-4,5,1};
for(i = 0; i<6; i++){
    list[i] = list[i]+(list[i]/list[0]);
    System.out.println(list[i]);
}
}
}