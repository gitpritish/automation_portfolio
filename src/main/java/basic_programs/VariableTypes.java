package basic_programs;

public class VariableTypes {
    // 1️⃣ Instance Variable (belongs to an object)
    String name = "Alice";

    // 2️⃣ Static Variable (shared by all objects)
    static String country = "USA";

    public void showDetails() {
        // 3️⃣ Local Variable (exists only inside this method)
        int age = 30;

        // Printing all variables
        System.out.println("Name: " + name);       // Instance variable
        System.out.println("Age: " + age);         // Local variable
        System.out.println("Country: " + country); // Static variable
    }

    public static void main(String[] args) {
        // Creating an object
        VariableTypes person1 = new VariableTypes();

        // Calling the method to display details
        person1.showDetails();
    }
}
