public class Car {
    double price;
    String name;
    String model; // Changed 'Model' to 'model' for camelCase
    int year;

    public void showFullDetail() { // Corrected method name to follow camelCase
        System.out.println("Car Name: " + name + ", Car Price: " + price +
                ", Car Model: " + model + ", Made in: " + year);
    }
        public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "CIVIC";
        double price1= c1.price = 30000000;
        c1.model = "HONDA";
        c1.year = 2021;
        c1.showFullDetail(); // Call the corrected method
        Car c2 = new Car();
        c2.name = "TOYOTA";
       double price2= c2.price = 25000000;
        c2.model = "ALTIS";
        c2.year = 2022;
        c2.showFullDetail(); // Display details of c2
        System.out.println("Here is the total peice of cars "
        +price1+price2);
        
  
    }
}
