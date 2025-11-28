import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter size of both arrays: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int sum1 = 0, sum2 = 0;


        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            sum1 += arr1[i];
        }


        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
            sum2 += arr2[i];
        }

        int totalSum = sum1 + sum2;

        System.out.println("Sum of first array = " + sum1);
        System.out.println("Sum of second array = " + sum2);
        System.out.println("Total sum of both arrays = " + totalSum);


    }
}


