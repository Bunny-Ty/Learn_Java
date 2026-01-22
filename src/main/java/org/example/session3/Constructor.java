package org.example.session3;

public class Constructor {

    public static void main (String[] args){
        System.out.println("Chương trình bắt đầu chạy\n");

        // Goi no-arg constructor
        Student s1 = new Student();
        System.out.println();

        // Goi parameterized constructor
        Student s2 = new Student(101, "Minh");
        System.out.println("\n--- Thông tin Student ---");

        System.out.println("Student 1:");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);

        System.out.println("\nStudent 2:");
        System.out.println("ID: " + s2.id);
        System.out.println("Name: " + s2.name);
    }
}



// Class student dung de minh hoa cac loai contructor
class Student {
    int id;
    String name;

    // 1. No-arg constructor
    Student(){
        System.out.println("No-arg constructor được gọi");
        id = 0;
        name = "Unknown";
    }

    // 2. Parameterized constructor
    Student (int i, String n){
        System.out.println("Parameterized constructor được gọi");
        id = i;
        name = n;
    }
}
