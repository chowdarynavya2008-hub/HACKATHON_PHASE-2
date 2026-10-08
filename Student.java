import java.util.Scanner;

public class Student {
    String name, roll, course;
    double marks;
    int credits;

    // Constructor matching 5 parameters
    Student(String n, String c, double m, String r, int cr) {
        name = n; 
        course = c; 
        marks = m; 
        roll = r; 
        credits = cr;
    }

    double fee() { 
        return credits * 1500.0; 
    }
    
    boolean eligible() { 
        return marks >= 50; 
    }

    double scholarship() { 
        return marks >= 85 ? fee() * 0.2 : (marks >= 70 ? fee() * 0.1 : 0); 
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Fee: " + fee());
        System.out.println("Scholarship: " + scholarship());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Name, Course, Marks, Roll No, and Credits:");
        // Order: Name (String), Course (String), Marks (double), Roll (String), Credits (int)
        Student st = new Student(s.next(), s.next(), s.nextDouble(), s.next(), s.nextInt());

        if (st.eligible()) {
            st.display();
        } else {
            System.out.println("Not Eligible");
        }
    }
}