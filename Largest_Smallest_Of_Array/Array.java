import java.util.Scanner;

public class Array{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Element In Array:");
        int n = sc.nextInt();
        int i;
        int[] arr = new int[n];

        System.out.println("Enter The Element:");
        for (i = 0 ; i< n;i++){



            arr[i]= sc.nextInt();
        }

        System.out.println("Array Elements Are:");
        for(i = 0 ; i<n ; i++){

            System.out.println(arr[i]);
        }

        int largest = arr[0];
        int smallest = arr[0];

        for(i= 0 ; i <n ; i++){

        largest = Math.max(largest,arr[i]);
        smallest = Math.min(smallest,arr[i]);

        }
        System.out.println("Largest Element Is: "+ largest);
        System.out.println("Smallest Element Is: "+ smallest);

    }
}