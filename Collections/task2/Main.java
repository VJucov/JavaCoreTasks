package Collections.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(101, "Tim Chalamet", 24, "Fine Arts"));
        list.add(new Student(103, "Tom Bull", 21, "Mathematics"));
        list.add(new Student(102, "Lana Rey", 26, "Physics"));
        list.add(new Student(111, "Theo Hutchcraft", 23, "Chemistry"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sorting criteria: ");
        String criteria = sc.nextLine();

        if (criteria.equals("age")) {
            System.out.println("Sorted by age:");
            Collections.sort(list);
        } else if (criteria.equals("name")) {
            System.out.println("Sorted by name:");
            NameCompare nameCompare = new NameCompare();
            Collections.sort(list, nameCompare);
        } else if (criteria.equals("ID")) {
            System.out.println("Sorted by ID");
            IDCompare idCompare = new IDCompare();
            Collections.sort(list, idCompare);
        }

        for (Student student: list) {
            System.out.println(student.getStudentID() + ", " + student.getName() + ", "+ student.age + ", " + student.faculty);
        }

    }
}
