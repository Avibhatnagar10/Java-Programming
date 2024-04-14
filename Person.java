public class Person {
    public String name;
    public int age;


    //Default Constructor (Without Parameters)
    public Person(){
        this.name="Unknown";
        this.age=0;
    }
    //Constructor with parameters
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    //Method to display person details
    public  void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        Person person1= new Person();
        Person person2= new Person("Avi",20);

        System.out.println("Person 1 Details: ");
        person1.displayDetails();

        System.out.println("Person 2 Details: ");
        person2.displayDetails();
    }
}
