import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        int rev=0, rem, c;
        c=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(c==rev)
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");

    }
}
