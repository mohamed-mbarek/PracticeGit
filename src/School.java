import java.util.ArrayList;
import java.util.List;

public class School {
    // Attributes
    private String schoolName;
    private String address;
    private List<Student> students;

    // Constructor
    public School(String schoolName, String address) {
        this.schoolName = schoolName;
        this.address = address;
        this.students = new ArrayList<>();
    }

    // Getters
    public String getSchoolName() {
        return schoolName;
    }

    public String getAddress() {
        return address;
    }

    public List<Student> getStudents() {
        return students;
    }

    // Methods to manage students
    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " has been enrolled in " + schoolName);
    }

    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getStudentId() == studentId);
        System.out.println("Student with ID " + studentId + " has been removed.");
    }

    // Display all students in the school
    public void displayAllStudents() {
        System.out.println("========================================");
        System.out.println("School: " + schoolName);
        System.out.println("Address: " + address);
        System.out.println("Total Students: " + students.size());
        System.out.println("========================================\n");

        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }
    }

    // Get statistics
    public void displayStatistics() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled yet.");
            return;
        }

        double totalGrade = 0;
        int passCount = 0;
        int failCount = 0;

        for (Student student : students) {
            totalGrade += student.getGrade();
            if (student.getStatus().equals("PASS")) {
                passCount++;
            } else {
                failCount++;
            }
        }

        double averageGrade = totalGrade / students.size();

        System.out.println("=== School Statistics ===");
        System.out.println("School Name: " + schoolName);
        System.out.println("Total Students: " + students.size());
        System.out.println("Average Grade: " + String.format("%.2f", averageGrade));
        System.out.println("Students Passed: " + passCount);
        System.out.println("Students Failed: " + failCount);
        System.out.println("Pass Rate: " + String.format("%.2f", (passCount * 100.0 / students.size())) + "%");
    }

    // Find student by ID
    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }
}
