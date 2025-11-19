import java.sql.SQLOutput;
import java.util.*;

public class Main{

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean value = true;

        while (value) {
            System.out.println("\n-----ARRAYLIST-----");
            System.out.println("\n1.Add Element");
            System.out.println("2.Remove Element");
            System.out.println("3.Replace Element");
            System.out.println("4.Insert Element In Between");
            System.out.println("5.Remove Element From Specified Index");
            System.out.println("6.Display The Array List");
            System.out.println("7.Exit");
            System.out.println("\nEnter Your Choice : ");
            int ch = sc.nextInt();

            switch(ch) {


                case 1 : {

                    System.out.println("Enter Number To Add : ");
                    int num = sc.nextInt();
                    list.add(num);
                    System.out.println("Element Added..");
                    break;
                }


                case 2 : {

                    System.out.println("Enter The Position Of Value You Want To Remove : ");
                    int num = sc.nextInt();
                    list.remove(num);
                    System.out.println("Element Removed..");
                    break;

                }

                case 3 : {

                    System.out.println("Enter The Index And Number You Want To Replace Respectively : ");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    list.set(num1,num2);
                    System.out.println("Element Replaced..");
                    break;
                }

                case 4 : {

                    System.out.println("Enter The Index And Number You Want To Insert Respectively : ");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    list.add(num1,num2);
                    System.out.println("Element Added At The Specified Position..");
                    break;

                }

                case 5 : {

                    System.out.println("Enter The Index Of Element You Want To Remove : ");
                    int num1 = sc.nextInt();
                    list.remove(num1);
                    System.out.println("Element Removed From Specific Position..");
                }

                case 6 : {


                    System.out.println("The Array List : ");
                    System.out.println(list);
                    break;

                }

                case 7 : {

                    System.out.println("Exiting The Program....");
                    value = false;
                    break;

                }
            }
        }
    }
}