import java.util.Scanner;

class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int balance = 5000;
        System.out.println("\n-----SIMPLE ATM WITHDRAWAL-----");
        System.out.println("\nEnter Amount To Withdraw : ");
        int amount = sc.nextInt();
        try {

            if(amount<0){

                throw new IllegalArgumentException("Invalid Amount");


            }
            else if(amount > balance){

                throw new InsufficientBalanceException("Insufficent Balance");
            }

            else {

                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println(" Transaction Failed: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e);

        } finally {
            System.out.println("ATM System Exited. Thank you for banking with us!");
        }

        sc.close();
    }
}
