// Parent class
class Parent {
    int x;

    // Constructor with one parameter
    Parent(int x) {
        this.x = x;
    }

    // Display method
    void display() {
        System.out.println("Parent class: x = " + x);
    }
}

// Child class extending Parent class
class Child extends Parent {
    int y;

    // Constructor with one parameter
    Child(int x, int y) {
        super(x); // Calling parent class constructor using super keyword
        this.y = y;
    }

    // Constructor with two parameters, calling another constructor using this keyword
    Child(int x, int y, int z) {
        this(x, y); // Calling another constructor of the same class using this keyword
        System.out.println("Child class: z = " + z);
    }

    // Display method
    void display() {
        super.display(); // Calling parent class display method using super keyword
        System.out.println("Child class: y = " + y);
    }
}

// Main class
public class Calling_Constructor {
    public static void main(String[] args) {
        // Creating objects of Child class
        Child obj1 = new Child(10, 20);
        Child obj2 = new Child(30, 40, 50);

        // Calling display method of Child class
        System.out.println("Displaying obj1 details:");
        obj1.display();

        System.out.println("Displaying obj2 details:");
        obj2.display();
    }
}
