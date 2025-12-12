abstract class Abstraction {
    public void show(){
        System.out.println("this is abstraction by abstract");
    }
}
class example extends Abstraction{}
class AbstractExample {
    static void main(String[] args) {
        example e1= new example();
        e1.show();
    }
}
