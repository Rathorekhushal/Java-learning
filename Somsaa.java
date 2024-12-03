public class Somsaa {
    String name;
    String color;
    String Shape;
    int price;
    public void showcolor(){
        System.out.println("The color of somsaa is "+color);

    }
    // public void showfulll_detail(){

    // }
    public int getprice(){
     System.out.println("somasaa price is "+price);
     return price;
    }
    public static void main(String[] args) {
        System.out.println("we are working here ");
        //  we want somsaa
        Somsaa s1= new Somsaa();
        s1.color="Black";
        s1.name="meetha";
        int price1 =s1.price=30;
        s1.Shape="triangular";
        Somsaa s2= new Somsaa();
        s2.color="yello ";
        s2.name="meetha + tasty";
        int price2 = s2.price=40;
        s2.Shape="crile ";
        s1.showcolor();
        s2.showcolor();
        s1.getprice();
        s2.getprice();
        System.out.println(" show the total price of the all somsaa is "
        +(price1+price2));
        



    }
    
}
