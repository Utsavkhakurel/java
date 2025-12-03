public class method {
    public static void show() {
        System.out.println("Hell0");
    }
    public static int sum(int a, int b){
        int c=a+b;
        return c;
    }
    public static void SI(int p, int t, int r){
        int si=p*t*r/100;
        System.out.println("SI="+si);
    }
    public static int prod(){
        int a=10, b=20;
        return a+b;
    }

    public static void main(String[] args) {
        show();
        System.out.println(sum(20, 10));
        SI(1000, 20, 10);
        System.out.println(prod());
    }

}
