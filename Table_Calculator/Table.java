import java.util.Scanner;

public class Table{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Table You Want :");
        int n = sc.nextInt();

        for(int i = 1 ; i <=10 ; i++){

            int m = n*i;
            System.out.println( n + " X "+ i +" = "+m);
        }
    }
}
