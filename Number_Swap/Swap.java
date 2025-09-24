
import java.util.Scanner;

public  class Swap{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Numbers to Swap: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        int temp = a;
        a = b;
        a= temp;

        System.out.println("After Swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }

}