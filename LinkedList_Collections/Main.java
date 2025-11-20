import java.util.Scanner;
import java.util.LinkedList;

public class Main{

    public static void main(String[] args){

        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t======LINKEDLIST======");

        boolean value = true;
        int num1 ;
        while(value){

            System.out.println("\n1.Add Element At First ");
            System.out.println("2.Add Element At Last");
            System.out.println("3.Remove Element");
            System.out.println("4.Display LinkedList");
            System.out.println("5.Exit");
            System.out.println("\nEnter Your Choice : ");
            int ch = sc.nextInt();

            switch(ch){

                case 1 : {

                    System.out.println("Enter Number To Add At First Index : ");
                    num1 = sc.nextInt();
                    list.addFirst(num1);
                    System.out.println("Element Added To First Index..");

                    break;
                }

                case 2 : {

                    System.out.println("Enter Number To Add At Last Index : ");
                    num1 = sc.nextInt();
                    list.addLast(num1);
                    System.out.println("Element Added To Last Index..");
                    break;
                }

                case 3 : {

                    System.out.println("Enter Number To Remove From The LinkedList : ");
                    Integer num2 = sc.nextInt();


                    if(list.remove(num2)) {
                        System.out.println("Element Removed..");
                    }

                    else {
                        System.out.println("Element Not Found..");
                    }
                    break;
                }

                case 4 : {


                    System.out.println("LinkedList : " + list);
                    break;

                }
                case 5 : {

                    System.out.println("Exiting Program..");
                    value = false;
                    break;
                }
            }
        }

    }
}