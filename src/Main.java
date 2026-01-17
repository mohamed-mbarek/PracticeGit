public class Main {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Alice Johnson", 101, 20, 85.5);
        Student student2 = new Student("Bob Smith", 102, 21, 92.0);
        Student student3 = new Student("Charlie Brown", 103, 19, 78.5);

        // Display student information
        System.out.println("=== Student Management System ===\n");

        student1.displayInfo();
        System.out.println();

        student2.displayInfo();
        System.out.println();

        student3.displayInfo();
        System.out.println();

        // Update grades
        System.out.println("=== Updating Grades ===");
        student1.updateGrade(88.0);
        student3.updateGrade(82.0);

        System.out.println("\n=== Updated Student Information ===\n");
        student1.displayInfo();
        System.out.println();
        student3.displayInfo();
    }
}
