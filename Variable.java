public class Variable {
    
    int instanceVariable = 100;

    // Static variable
    static int staticVariable = 200;

    // Method demonstrating a local variable
    public void displayVariables() {
        // Local variable
        int localVariable = 300;
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        // Creating an object to access instance variables
        Variable variable = new Variable();

        // Accessing instance and static variables
        variable.displayVariables();

        // Accessing static variable without an object
        System.out.println("Accessing Static Variable Directly: " + staticVariable);
    }
}

        
   

