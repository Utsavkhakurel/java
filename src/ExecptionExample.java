import MyPack.Execption;

public class ExecptionExample {
    static void main(String[] args) {
        int x = 10;
        try {
            System.out.println(x / 0);
        }
        catch(Execption e) {
            System.out.println(e.getMessage());
        }
    }
}
