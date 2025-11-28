import java.util.Scanner;
public class PrimeComposite {
    static void main() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nuber to check:");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println("Prime");
        else if (count > 2)
            System.out.println("compostie");
        else
            System.out.println("Neither prime nor composite");
    }
}
