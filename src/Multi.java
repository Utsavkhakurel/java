import java.util.Scanner;
public class Multi {
    static void main(String[] args) {
        int [][] arr=new int [3][4];
        Scanner sc= new Scanner(System.in);
                System.out.println("Enter 3*4 array:");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                arr[i][j]= sc.nextInt();

            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
