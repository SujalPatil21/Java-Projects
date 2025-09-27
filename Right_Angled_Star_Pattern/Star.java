public class Star{

    public static void main(String[] args){

        System.out.println("\nRight Angled Star Pattern:\n");
        for (int i = 1 ; i <=10 ; i++){

            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}