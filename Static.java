class Static {
    static int count = 0; // Static variable

    static {
        System.out.println("Static block executed: Class is loaded.");
        count = 10; 
    }

    static void displayCount() { // Static method
        System.out.println("Static Method - Current Count: " + count);
    }

    public static void main(String[] args) {
        Static.displayCount();
        Static.count++;
        Static.displayCount();
    }
}
