import java.util.Scanner;

class Calculator {

    Scanner sc = new Scanner(System.in);

    void add(){


        System.out.println("Enter Two Numbers:");

        int a = sc.nextInt();
         int b = sc.nextInt();
         int c = a+b;
        System.out.println("Addition:"+c);
    }

     void add(int x){

        System.out.println("Enter Three Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = num1+num2+num3;
         System.out.println("Addition:"+num4);
    }
}
public class Overloading{

    public static void main(String[] args){

        Calculator C = new Calculator();
        C.add();
        C.add(0);
    }
}