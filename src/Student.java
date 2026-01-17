public class Student {
    // Attributes
    private String name;
    private final int studentId;
    private int age;
    private double grade;
    private Language language; // Every student learns a language

    // Constructor
    public Student(String name, int studentId, int age, double grade, Language language) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.grade = grade;
        this.language = language;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public Language getLanguage() {
        return language;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void updateGrade(double newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated for " + name + ": " + newGrade);
    }


    // Method to display student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + getStatus());
        System.out.println("--- Learning Language ---");
        language.displayLanguageInfo();
        System.out.println("Proficiency: " + language.getProficiency());
    }

    // Method to determine pass/fail status
    public String getStatus() {
        if (grade >= 60) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}
