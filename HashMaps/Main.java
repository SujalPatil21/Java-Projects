import java.util.HashMap;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        boolean exit = true;
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<>();

        while(exit) {

            System.out.println("\n\t======HASHMAP=====");
            System.out.println("\n1.Insert Element");
            System.out.println("2.Remove Element");
            System.out.println("3.Checks If The Key Exists");
            System.out.println("4.Checks If The Value Exists");
            System.out.println("5.Display The HashMap");
            System.out.println("6.Exit");
            System.out.println("\nEnter Your Choice : ");
            int ch = sc.nextInt();

            switch(ch){

                case 1 : {

                    System.out.println("Enter The Key : ");
                    int key = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter The String : ");
                    String value = sc.nextLine();

                    map.put(key,value);
                    System.out.println("Element Inserted..");
                    break;
                }

                case 2 : {

                    System.out.println("Enter Key You Want To Remove : ");
                    int key = sc.nextInt();
                    map.remove(key);
                    System.out.println("Element Removed..");
                    break;
                }

                case 3 : {

                    System.out.println("Enter The Key You Want To Check : ");
                    int key = sc.nextInt();

                    if(map.containsKey(key)){

                        System.out.println("Key Found");
                    }
                    else{

                        System.out.println("Key Not Found");
                    }
                    break;

                }

                case 4 : {


                    System.out.println("Enter The Value You Want To Check : ");
                    sc.nextLine();
                    String value = sc.nextLine();

                    if(map.containsValue(value)){

                        System.out.println("Value Found");
                    }
                    else{

                        System.out.println("Value Not Found");
                    }
                    break;
                }

                case 5 : {

                    System.out.println("HashMap : " + map);
                    break;
                }
                case 6:
                {

                    System.out.println("Exiting Program..");
                    exit = false ;
                    break;

                }


            }
        }
    }
}