class IT {
    public void messages(){
        System.out.println("This si IT course");
    }
}
class BCA1 extends IT{}
class BIT extends IT{}
class BSCSIT extends IT{}
 class HierararchialInheritance {
     static void main(String[] args) {
         BCA1 b1=new BCA1();
         BIT b2=new BIT();
         b1.messages();
         b2.messages();

     }

}

