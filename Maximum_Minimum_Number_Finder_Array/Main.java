import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];



        System.out.println("\n Enter 5 Numbers :" );
        for (int i = 0; i < 5; i++) {

            num[i] = sc.nextInt();
        }
        int min = num[0], max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Minimum Number : " + min);
        System.out.println("Maximum Number : " + max);
    }

}