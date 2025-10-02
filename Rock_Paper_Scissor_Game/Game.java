import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tROCK PAPER SCISSORS");
        System.out.print("Enter Your Choice (Rock, Paper, Scissors): ");
        String player = sc.nextLine();


        int compNum = (int) (Math.random() * 3);
        String computer = "";

        if (compNum == 0) computer = "Rock";
        else if (compNum == 1) computer = "Paper";
        else computer = "Scissors";

        System.out.println("Computer chose: " + computer);


        if (player.equalsIgnoreCase(computer)) {
            System.out.println("It's a tie!");
        } else if ((player.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
                (player.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                (player.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
