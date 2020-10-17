package Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candidate> list = new ArrayList<>();
        list.add(new Candidate("Hellen", 19, true,
                true, true, true, "advanced"));
        list.add(new Candidate("Joe", 17, true,
                true, true, true, "advanced"));
        list.add(new Candidate("Tim", 25, false,
                true, true, true, "advanced"));
        list.add(new Candidate("Tom", 20, true,
                true, true, true, "beginner"));

        for (Candidate candidate: list) {
            System.out.println("--------------------------");
            try {
                candidate.checkAge();
                candidate.checkStudent();
            } catch (NotValidAgeException | NotAStudentException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    candidate.checkEnglishLevel();
                } catch (EnglishLevelException e) {
                    System.out.println(e.getMessage());
                } finally {
                    candidate.accept();
                }
            }
        }

    }
}
