import java.util.Stack;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        boolean value = true;
        int num;
        while(value) {

            System.out.println("\n\t======STACK======");
            System.out.println("1.Insert Element");
            System.out.println("2.Remove Element");
            System.out.println("3.Search Element");
            System.out.println("4.Display Stack");
            System.out.println("5.Exit");
            System.out.println("\nEnter Your Choice : ");
            int ch = sc.nextInt();

            switch(ch){

                case 1 : {

                    System.out.println("Enter Number To Insert : ");
                    num = sc.nextInt();
                    st.push(num);
                    System.out.println("Element Inserted..");
                    break;
                }

                case 2 : {

                    st.pop();
                    System.out.println("Element Removed..");
                    break;
                }

                case 3 : {

                    System.out.println("Enter Number To Search : " );
                    Integer num1 = sc.nextInt();
                    if(st.search(num1) != -1) {
                        System.out.println("Element Found at " + st.search(num1));
                    }
                    else {

                        System.out.println("Element Not Found");
                    }
                    break;
                }

                case 4 : {

                    System.out.println("Stack : " + st);
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