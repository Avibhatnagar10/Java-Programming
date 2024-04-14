// Step 1: Define a class (Student)
public class Student {
    // Class variables (attributes)
    private int rollNo;
    private String name;
    private double marks;

    // Constructor method
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println(); // Empty line for better readability
    }
}

// Step 2: Instantiate objects of the class
class Main {
    public static void main(String[] args) {
        // Creating objects of Student class for Avi, Aashi, and Vaidushi
        Student avi = new Student(1, "Avi", 85.5);
        Student aashi = new Student(2, "Aashi", 92.0);
        Student vaidushi = new Student(3, "Vaidushi", 88.7);

        // Display details of each student
        avi.displayDetails();
        aashi.displayDetails();
        vaidushi.displayDetails();
    }
}
