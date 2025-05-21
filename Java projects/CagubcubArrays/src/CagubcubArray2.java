import java.util.*;             //JOHN ROMAINE CAGUBCUB
public class CagubcubArray2 {
    public static void main (String[] args){
        Scanner z = new Scanner(System.in);
        Random x = new Random();
        String names[]={"Isaac","Ardel","Aldous","Gabrielle","Courtney","Karen","Marianne","Robin","Mark","Jude"};
        boolean p;
        do{                         //JOHN ROMAINE CAGUBCUB
        int q = x.nextInt(10);
        System.out.println(names[q]);
        System.out.println("do you want to continue? Y/N");
        String y = z.nextLine();
        p = y.equalsIgnoreCase("y");
        }while (p);
        System.out.println("thank you for using the program");
    }
}
//JOHN ROMAINE CAGUBCUB