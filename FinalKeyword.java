public class FinalKeyword {
    // Constant variable declared with 'final' keyword
    final int CONSTANT_VALUE = 100;

    // Final method that cannot be overridden by subclasses
    final void display() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();

        // Accessing final variable
        System.out.println("Constant value: " + obj.CONSTANT_VALUE);

        // Attempting to change the value of final variable (will result in compilation error)
        // obj.CONSTANT_VALUE = 200;

        // Calling final method
        obj.display();
    }
}
