import java.util.Scanner;

public class ATM {

    public static void main(String[] args){

        int balance = 0;
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\n\t SIMPLE ATM MACHINE");
            System.out.println("\n1. Check Balance");
            System.out.println("2. Enter Amount To Deposit ");
            System.out.println("3. Enter Amount To Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter You Choice : ");
            int choice = sc.nextInt();

            switch(choice){

                case 1 :
                {

                    System.out.println("Total Balance : " + balance);
                    break;
                }

                case 2 :
                {
                    System.out.println("Enter Amount You Want To Deposit:");
                    int Deposit = sc.nextInt();
                    balance +=Deposit ;
                    System.out.println("Total Balance :" + balance);
                    break;
                }

                case 3 :
                {
                    System.out.println("Enter Amount You Want To Withdraw:");
                    int withdraw = sc.nextInt();
                    balance -= withdraw;
                    System.out.println("Total Balance :" + balance);
                    break;
                }

                case 4 :
                {
                    System.out.println("Exiting The ATM.....");
                    System.exit(0);
                    break;
                }

                default :
                {
                    System.out.println("Invalid Choice !! ");
                }
            }
        }
    }
}