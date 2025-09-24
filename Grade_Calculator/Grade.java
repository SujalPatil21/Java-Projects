
import java.util.Scanner;
public class Grade{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter The Marks For Maths:");
        double Maths = sc.nextDouble();
        System.out.println("Enter The Marks For Science:");
        double Science = sc.nextDouble();
        System.out.println("Enter The Marks For History");
        double History = sc.nextDouble();
        System.out.println("Enter the Marks For Geography");
        double Geography = sc.nextDouble();

        double Total = Maths+Science+History+Geography;
        double average = Total/4;
        double Percentage = (Total/400)*100;


        System.out.println("Total Marks:"+Total);
        System.out.println("Percentage:"+Percentage+"%");

        if (average>=90){

            System.out.println("Grade A");

        }
        else if(average>=80)  {

            System.out.println("Grade B");


        }
        else if(average>=70 ){

            System.out.println("Grade C");

        }

        else if (average >= 60 ){

            System.out.println("Grade D");
        }

        else if (average>=50 ) {

            System.out.println("Grade E");

        }

        else {

            System.out.println("Grade F");
        }

    }
}