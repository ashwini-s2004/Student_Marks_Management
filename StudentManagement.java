import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

    private String name;
    private int[] marks;

    // Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Calculate average marks
    public double average() {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    // Assign grade based on average
    public String grade() {
        double avg = average();

        if (avg >= 90)
            return "A";
        else if (avg >= 80)
            return "B";
        else if (avg >= 70)
            return "C";
        else if (avg >= 60)
            return "D";
        else
            return "F";
    }

    // Display student details
    public void display() {

        System.out.println("-----------------------------------------");
        System.out.println("Student Name : " + name);

        System.out.print("Marks        : ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println();
        System.out.printf("Average      : %.2f%n", average());
        System.out.println("Grade        : " + grade());
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ashwini", new int[]{95, 92, 90, 96, 94}));
        students.add(new Student("Rahul", new int[]{80, 85, 78, 82, 81}));
        students.add(new Student("Sneha", new int[]{88, 91, 84, 89, 90}));
        students.add(new Student("Amit", new int[]{67, 72, 70, 69, 71}));
        students.add(new Student("Priya", new int[]{98, 97, 99, 96, 100}));

        // Sort students by average marks in descending order
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.average(), s1.average());
            }
        });

        System.out.println("=========================================");
        System.out.println("     STUDENT RESULT MANAGEMENT SYSTEM");
        System.out.println("=========================================");

        int rank = 1;

        for (Student student : students) {
            System.out.println("\nRank #" + rank++);
            student.display();
        }

        System.out.println("-----------------------------------------");
        System.out.println("Sorting Completed (Highest Average First)");
        System.out.println("-----------------------------------------");
    }
}