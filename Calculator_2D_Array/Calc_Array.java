import java.util.Scanner;

public class Calc_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Of Rows In A : ");
        int rowA = sc.nextInt();
        System.out.println("Enter Number Of Columns In A : ");
        int coloumnA = sc.nextInt();
        int[][] A = new int[rowA][coloumnA];

        System.out.println("Enter The Elements For Matrix: ");
        for (int i = 0; i < rowA; i++) {

            for (int j = 0; j < coloumnA; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Number Of Rows In B :");
        int rowB = sc.nextInt();
        System.out.println("Enter Number Of Columns In B :");
        int columnB = sc.nextInt();

        int[][] B = new int[rowB][columnB];

        System.out.println("Enter The Elements For Matrix :");
        for (int i = 0; i < rowB; i++) {

            for (int j = 0; j < columnB; j++) {

                B[i][j] = sc.nextInt();
            }
        }

        while (true) {
            int i, j;
            System.out.println("1. Addition:");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice :");
            int ch = sc.nextInt();


            switch (ch) {

                case 1: {
                    if (rowA == rowB && coloumnA == columnB) {

                        int[][] sum = new int[rowA][coloumnA];
                        for (i = 0; i < rowA; i++) {

                            for (j = 0; j < columnB; j++) {

                                sum[i][j] = A[i][j] + B[i][j];
                            }

                        }
                        System.out.println("Result Of Addition:");
                        printMatrix(sum);

                    } else {
                        System.out.println("Addition is not possible");
                    }
                    break;

                }
                case 2: {
                    if (rowA == rowB && coloumnA == columnB) {

                        int[][] diff = new int[rowA][coloumnA];
                        for (i = 0; i < rowA; i++) {
                            for (j = 0; j < columnB; j++) {

                                diff[i][j] = A[i][j] - B[i][j];
                            }
                        }
                        System.out.println("Result Of Subtraction :");
                        printMatrix(diff);
                    } else {

                        System.out.println("Subtraction Is Not Possible");
                    }
                    break;
                }
                case 3: {
                    if (rowA == columnB) {
                        int[][] mul = new int[rowA][columnB];
                        for (i = 0; i < rowA; i++) {
                            for (j = 0; j < coloumnA; j++) {
                                for (int k = 0; k < columnB; k++) {
                                    mul[i][j] += A[i][k] * B[k][j];
                                }
                            }
                        }
                    } else {
                        System.out.println("Multiplication Is Not Possible");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Exiting The Program");
                    System.exit(0);
                    break;
                }
            }

        }


            }
    public static void printMatrix (int[][] matrix){
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}