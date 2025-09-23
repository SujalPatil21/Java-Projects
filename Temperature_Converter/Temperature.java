import java.util.Scanner;

public class Temperature{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsius:");
        Double C = sc.nextDouble();
        Double Fahrenheit  = (C*9/5) +32;
        System.out.println("Temperature in Fahrenheit :"+Fahrenheit);

        System.out.println("Enter the Temperature in Fahrenheit :");
        Double F = sc.nextDouble();
        Double Celsius = (F-32) *5/9;
        System.out.println("Temperature in Celsius:"+ Celsius);
    }
}