public class MethodOverloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum (int a, int b ,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c ,int d){
        return a+b+c+d;

    }
    public static double sum(double a, double b){
        return a+b;
    }
    public static String sum(String fname, String lname){
        return fname+" "+lname;


    }

    static void main(String[] args) {
        System.out.println(sum(10,120));
        System.out.println(sum(10,15, 10));
        System.out.println(sum(10,15, 10,8));
        System.out.println(sum(20.55, 30.88));
        System.out.println(sum("Utsav","khakurel"));

    }


}
