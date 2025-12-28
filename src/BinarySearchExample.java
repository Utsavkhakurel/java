import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int search, low, high, mid;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        search = sc.nextInt();

        low = 0;
        high = arr.length - 1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == search) {
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if (arr[mid] < search) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}

