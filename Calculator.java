public class Calculator {
    int x;
    int y;

    public Calculator(){
        System.out.println("this is non-peramertrized constructor");
        x=10;
        y=20;
    }
    public Calculator(int a , int b ){
   x=a;
   y=b;
    }
    public void Add(){
        System.out.println("Addition is "+(x+y));
    }
    public void Add(int a ){
    System.out.println("Addition is "+(x+y+a));
    }
    public void  Add(int  a , int b ){
    System.out.println("Addition is "+(x+y+a+b));
    }
    public static void main(String[] args) {
        Calculator c1 =new Calculator(20,40);
    c1.Add();
    }
    
}
