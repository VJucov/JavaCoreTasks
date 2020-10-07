import java.util.ArrayList;
import java.lang.StringBuilder;
public class SixthTask {
    public static void concat(Object[] obj) {
        StringBuilder sumString = new StringBuilder();
        ArrayList<Object> personArray = new ArrayList<Object>();
        int sum = 0;
        int j=0;
        for (Object i : obj) {
            if (i instanceof String || i instanceof Character) {
                sumString.append(i);
            } else if (i instanceof Integer) {
                sum += (Integer) i;
            } else {
                personArray.add(j, i);
                j++;
            }
        }
        System.out.println("String concatenation: " + sumString.toString());
        System.out.println("The sum of numbers is: " + sum);
        System.out.println("Person array: " + personArray.toString());
    }

    public static void main(String[] args) {
        Person per1 = new Person("Joe", 25, 'M');
        Person per2 = new Person("Anna", 23, 'F');
        Object[] array = new Object[] {"hi,", 5, " how", 20, " are", per1 , " you?", per2 };
        concat(array);
    }
}
