//Write a Java program to demonstrate the use of static variables, static blocks, and static methods.
public class Static_exp_02 {
    static int count; 
    
    static {
        count = 0;
        System.out.println("Static block executed. Count initialized to " + count);
    }

    
    public static void incrementCount() {
        count++; 
        System.out.println("Count incremented. Current count: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

      
        incrementCount(); 
        incrementCount(); 

        System.out.println("Main method ended.");
    }
}