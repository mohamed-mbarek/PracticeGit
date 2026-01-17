public class Main {
    public static void main(String[] args) {
        // Create a school
        School school = new School("International Language Academy", "123 Education Street, Learning City");

        // Create language objects
        Language french = new Language("French", "Intermediate", 150);
        Language spanish = new Language("Spanish", "Advanced", 320);
        Language japanese = new Language("Japanese", "Beginner", 45);
        Language german = new Language("German", "Intermediate", 200);
        Language mandarin = new Language("Mandarin", "Beginner", 80);
        Language italian = new Language("Italian", "Advanced", 550);

        // Create student objects - every student learns a language
        Student student1 = new Student("Alice Johnson", 101, 20, 85.5, french);
        Student student2 = new Student("Amine Mbarek", 102, 21, 92.0, spanish);
        Student student3 = new Student("Charlie Brown", 103, 19, 78.5, japanese);
        Student student4 = new Student("Diana Prince", 104, 22, 95.0, german);
        Student student5 = new Student("Ethan Hunt", 105, 20, 88.5, mandarin);
        Student student6 = new Student("Fiona Green", 106, 23, 91.0, italian);

        // Enroll students in the school
        System.out.println("=== Enrolling Students ===");
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);
        school.addStudent(student6);

        // Display all students in the school
        System.out.println("\n=== Student Management System ===\n");
        school.displayAllStudents();

        // Update grades
        System.out.println("=== Updating Grades ===");
        student1.updateGrade(88.0);
        student3.updateGrade(82.0);
        student4.updateGrade(97.5);

        // Add study hours to languages
        System.out.println("\n=== Adding Language Study Hours ===");
        student1.getLanguage().addStudyHours(50);
        student3.getLanguage().addStudyHours(60);
        student5.getLanguage().addStudyHours(25);
        student6.getLanguage().addStudyHours(100);

        System.out.println("\n=== Updated Student Information ===\n");
        student1.displayInfo();
        System.out.println();
        student3.displayInfo();
        System.out.println();
        student4.displayInfo();
        System.out.println();
        student5.displayInfo();
        System.out.println();
        student6.displayInfo();

        // Display school statistics
        System.out.println("\n");
        school.displayStatistics();

        // Demonstrate finding a student
        System.out.println("\n=== Finding Student by ID ===");
        Student foundStudent = school.findStudentById(103);
        if (foundStudent != null) {
            System.out.println("Found: " + foundStudent.getName());
        }
    }
}
