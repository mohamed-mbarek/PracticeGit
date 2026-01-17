public class Main {
    public static void main(String[] args) {
        // Create language objects
        Language french = new Language("French", "Intermediate", 150);
        Language spanish = new Language("Spanish", "Advanced", 320);
        Language japanese = new Language("Japanese", "Beginner", 45);

        // Create student objects - every student learns a language
        Student student1 = new Student("Alice Johnson", 101, 20, 85.5, french);
        Student student2 = new Student("Bob Smith", 102, 21, 92.0, spanish);
        Student student3 = new Student("Charlie Brown", 103, 19, 78.5, japanese);

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

        // Add study hours to languages
        System.out.println("\n=== Adding Language Study Hours ===");
        student1.getLanguage().addStudyHours(50);
        student3.getLanguage().addStudyHours(60);

        System.out.println("\n=== Updated Student Information ===\n");
        student1.displayInfo();
        System.out.println();
        student3.displayInfo();
    }
}
