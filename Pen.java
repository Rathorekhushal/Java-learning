public class Pen {
    String color;
    String Model;
    Double price;
    // behavior or methods 

    void write(){
        System.out.println(Model+"is writing in "+color+"with the price of "
        +price);
    }
public static void main(String[] args) {
    Pen p1=new Pen();
    Pen p2=new Pen(); 
    p1.Model="5 rupia walla model ";
    p2.Model="3 rupia walla model";
    p1.color="black";
    p2.color="blue";
    System.out.println(p1.Model);
    System.out.println(p2.Model);
    p1.write();
    p2.write();
}
    

}
