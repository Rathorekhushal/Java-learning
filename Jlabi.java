public class Jlabi {
  int price;
  String name;
     // methods
     public void showprice(){
        System.out.println("the price of jlabi is "+price);

     }  
     Jlabi(int p, String n){
        System.out.println(" this is the constructor ");
        price=p;
        name=n;
     }
     public static void main(String[] args) {
        Jlabi j1= new Jlabi( 500,"Green Jlabii" );
        Jlabi j2=new Jlabi(600, "Red jabli");
        
        // j1.price=500;
        // j1.name="Green jlabi";
        // Jlabi j2=new Jlabi();
        // j2.name="Red jlabi";
        // j2.price=600;
        // j1.showprice();
        // j2.showprice();


     }
}
