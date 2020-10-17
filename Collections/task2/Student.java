package Collections.task2;

public class Student implements Comparable<Student> {

    private int studentID;
    private String name;
    int age;
    String faculty;

    public Student(int studentID, String name, int age, String faculty) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.faculty = faculty;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //sort by age
    public int compareTo(Student s) {
        return this.age - s.age;
    }
}
