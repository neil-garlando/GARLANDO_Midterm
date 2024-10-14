// Base class representing a person
class Person {
    String name; // Name of the person
    int age;     // Age of the person

    // Constructor to initialize name and age
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Class representing a student, inheriting from Person
class Student extends Person {
    String studentID;  // Student ID
    String course;     // Course of study
    int units;         // Number of units enrolled
    final int feePerUnit = 1000; // Fee per unit

    // Constructor to initialize student-specific attributes
    Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Call the superclass constructor
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Method to calculate total fees based on units
    double calculateFees() {
        return units * feePerUnit;
    }

    // Overriding displayInfo to include student-specific details
    void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age + ", Student ID: " + studentID + ", Course: " + course + ", Units: " + units + ", Total Fee: " + calculateFees());
    }
}

// Class representing an instructor, inheriting from Person
class Instructor extends Person {
    String employeeID; // Employee ID
    String department;  // Department of the instructor
    double salary;      // Salary of the instructor

    // Constructor to initialize instructor-specific attributes
    Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Call the superclass constructor
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Overriding displayInfo to include instructor-specific details
    void displayInfo() {
        System.out.println("Instructor Name: " + name + ", Age: " + age + ", Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}

// Main class for the enrollment system
public class EnrollmentSystem {
    // Method to print details of a Person (Student or Instructor)
    static void printDetails(Person p) {
        p.displayInfo(); // Call the displayInfo method of the Person
    }

    // Main method to run the enrollment system
    public static void main(String[] args) {
        // Create Student instances
        Student student1 = new Student("Mark Paul B. Llagas", 24, "231000117", "BSA", 3);
        Student student2 = new Student("Allen S. Sandrino", 19, "231000112", "BSME", 4);

        // Create Instructor instances
        Instructor instructor1 = new Instructor("Eric Nodo", 60, "EE74", "CEA", 30000);
        Instructor instructor2 = new Instructor("John Benedict B. Badilla", 50, "765432","CEA", 55000);

        // Print details for each person
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}
