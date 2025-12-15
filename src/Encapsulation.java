public class Encapsulation {
    private String name;
    private String address;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAddress(String address){
       return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress() {
        return address;
    }
}
class Ex{
    static void main(String[] args) {
        Encapsulation e1= new Encapsulation();
        e1.setName("raju");
        e1.getAddress("Kritpur");
        System.out.println(e1.getName()+" "+e1.getAddress( ));
    }
}
