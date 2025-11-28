import java.util.Scanner;
public class Array {
    static void main(String[] args) {
        int []c=new int[]{1,2,3,4,5,6,7,8};
        int []e={2,4,6,8,};
        Scanner sc=new Scanner(System.in);
        int []d=new int[5];
        System.out.println("Enter 5 array:");
        for(int i=0; i<5; i++){
            d[i]=sc.nextInt();
        }
    }
}
