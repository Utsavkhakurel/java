class buba {
    public void display(){
        System.out.println("1 crore");
    }
}
class babu extends buba{}
class xoro extends babu{}

public class Multilevel {
    static void main(String[] args) {
        xoro x1= new xoro();
        x1.display();;
    }
}
