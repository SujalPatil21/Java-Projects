import java.util.Scanner;

public class Palindrome_String{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The String:");
        String word = sc.nextLine();

        String reversed = "";
        for(int i = word.length()-1 ; i>=0 ; i--){

            reversed += word.charAt(i);

        }

        if(word.equals(reversed)){

            System.out.println("It Is Palindrome");

        }
        else {

            System.out.println("It Is Not Palindrome");
        }
    }
}
