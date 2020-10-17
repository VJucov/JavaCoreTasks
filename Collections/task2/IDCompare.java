package Collections.task2;

import java.util.Comparator;

public class IDCompare implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getStudentID() < s2.getStudentID()) return -1;
        if (s1.getStudentID() > s2.getStudentID()) return 1;
        else return 0;
    }
}
