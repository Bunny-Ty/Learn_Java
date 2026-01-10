package org.example.session3;

public class HowToDefineClass {

    // Fields
    String name; // instance variable
    int age; // instance variable
    static String schoolName; // static variable

    // Static initializer
    static {
        schoolName = "ABC University"; // static variable initialization
        System.out.println("Static initializer is executed"); // static block
    }

    // Intance initializer
    {
        System.out.println("Instance initializer is executed"); // instance block
    }

    // Constructor
    public HowToDefineClass(){
        name = "Unknown"; // default value
        age = 0; // default value
        System.out.println("Constructor is executed"); // constructor block
    }

    // Method
    public void showInfor(){
        System.out.println("Name: " + name); // instance variable
        System.out.println("Age: " + age); // instance variable
        System.out.println("School Name: " + schoolName); // static variable
    }

    // Inner class (Class as a member)
    class Address {
        String city;
    }

    // Inner interface (Interface as a member)
    interface Study{
        void lear();
    }

    public static void main(String[] args) {
        HowToDefineClass obj = new HowToDefineClass(); // create an instance of HowToDefineClass
        obj.showInfor(); // call method to show information
    }

}


