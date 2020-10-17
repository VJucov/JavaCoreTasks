package Exceptions;

public class Candidate {
    private String name;
    int age;
    boolean isAdult;
    boolean isAUniStudent;
    boolean hasProgrammingSkills;
    boolean hasDBSkills;
    boolean hasTestingKnowledge;
    String englishLevel;

    public Candidate(String name, int age, boolean isAUniStudent, boolean hasProgrammingSkills, boolean hasDBSkills, boolean hasTestingKnowledge, String englishLevel) {
        this.name = name;
        this.age = age;
        this.isAUniStudent = isAUniStudent;
        this.hasProgrammingSkills = hasProgrammingSkills;
        this.hasDBSkills = hasDBSkills;
        this.hasTestingKnowledge = hasTestingKnowledge;
        this.englishLevel = englishLevel;

        if (this.age < 0 || this.age > 150) {
            throw new IllegalArgumentException("Invalid age");
        }
        if (this.name == null) {
            throw new IllegalArgumentException("Name is null");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkAge() throws NotValidAgeException {
        if (age < 18) {
            throw new NotValidAgeException("The candidate must be at least 18 years old. " + name +" can't be accepted to the course.");
//            isAdult = false;
        } else {
            isAdult = true;
        }
    }

    public void checkStudent() throws NotAStudentException {
        if (!isAUniStudent) {
            throw new NotAStudentException(name + " is not a student. The candidate can't be accepted to the course.");
        }
    }

    public void checkEnglishLevel() throws EnglishLevelException {
        if (englishLevel.equals("beginner") && hasDBSkills && hasTestingKnowledge) {
            throw new EnglishLevelException(name + " is 50% eligible.");
        } else if (englishLevel.equals("intermediate") && hasDBSkills && hasTestingKnowledge) {
            throw new EnglishLevelException(name + " is 75% eligible.");
        }
    }

    public void accept() {
        if (englishLevel.equals("advanced") && isAdult && isAUniStudent && hasProgrammingSkills && hasDBSkills && hasTestingKnowledge) {
            System.out.println(name + " is accepted to the course!");
        } else if (!englishLevel.equals("advanced") && !isAdult && !isAUniStudent && !hasProgrammingSkills && !hasDBSkills && !hasTestingKnowledge){
            System.out.println(name + " is not accepted to the course.");
        }
    }
}
