public class Language {
    // Attributes
    private String languageName;
    private String level; // Beginner, Intermediate, Advanced
    private int hoursStudied;

    // Constructor
    public Language(String languageName, String level, int hoursStudied) {
        this.languageName = languageName;
        this.level = level;
        this.hoursStudied = hoursStudied;
    }

    // Getters
    public String getLanguageName() {
        return languageName;
    }

    public String getLevel() {
        return level;
    }

    public int getHoursStudied() {
        return hoursStudied;
    }

    // Setters
    public void setLevel(String level) {
        this.level = level;
    }

    public void addStudyHours(int hours) {
        this.hoursStudied += hours;
        System.out.println(hours + " hours added. Total hours: " + hoursStudied);
    }

    // Method to display language information
    public void displayLanguageInfo() {
        System.out.println("Language: " + languageName);
        System.out.println("Level: " + level);
        System.out.println("Hours Studied: " + hoursStudied);
    }

    // Method to determine proficiency
    public String getProficiency() {
        if (hoursStudied >= 500) {
            return "Expert";
        } else if (hoursStudied >= 300) {
            return "Advanced";
        } else if (hoursStudied >= 100) {
            return "Intermediate";
        } else {
            return "Beginner";
        }
    }
}
