import java.util.Scanner;

public class Vowels_Consonants{

    public static void main (String[] args){

        int i;
        int vowels = 0;
        int consonants = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        String str = sc.nextLine();

        str = str.toLowerCase();

        for(i = 0 ; i<str.length() ; i++){

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

               vowels ++;
            }
            else {

                consonants++;
            }
        }

        System.out.println("Vowels :"+ vowels);
        System.out.println("Consonants:"+consonants);
    }

}