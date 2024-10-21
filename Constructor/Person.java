package Constructor;
public class Person {
    // Fields (attributes)
    private String name;
    private int age;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args){
        Person p1 = new Person();
        p1.displayInfo();

        Person p2 = new Person("Rahul", 15);
        p2.displayInfo();
    }
}
