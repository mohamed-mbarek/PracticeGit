public class Teacher {
    // Attributes
    private String name;
    private final int teacherId;
    private String subject;
    private int yearsOfExperience;
    private Language language; // Language the teacher teaches or speaks

    // Constructor
    public Teacher(String name, int teacherId, String subject, int yearsOfExperience, Language language) {
        this.name = name;
        this.teacherId = teacherId;
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.language = language;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public Language getLanguage() {
        return language;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    // Method to display teacher information
    public void displayInfo() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Experience Level: " + getExperienceLevel());
        System.out.println("--- Teaching Language ---");
        language.displayLanguageInfo();
    }

    // Method to determine experience level
    public String getExperienceLevel() {
        if (yearsOfExperience >= 10) {
            return "Senior Teacher";
        } else if (yearsOfExperience >= 5) {
            return "Experienced Teacher";
        } else {
            return "Junior Teacher";
        }
    }

    // Method to teach a student
    public void teachStudent(Student student) {
        System.out.println(name + " is teaching " + student.getName() + " (" + subject + ")");
    }

    // Method to update experience
    public void addExperience(int years) {
        this.yearsOfExperience += years;
        System.out.println(years + " years added. Total experience: " + yearsOfExperience + " years");
    }
}
