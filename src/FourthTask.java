import java.util.Scanner;

public class FourthTask {
    public static void count(String str) {
        char[] c = str.toCharArray();
        int letters = 0, spaces = 0, numbers = 0, other = 0;
        for (int i = 0; i <= c.length - 1; i++) {
            if (Character.isLetter(c[i])) {
                letters++;
            } else if (Character.isSpaceChar(c[i])) {
                spaces++;
            } else if (Character.isDigit(c[i])) {
                numbers++;
            } else {
                other++;
            }
        }
        System.out.println("Letters: " + letters + "\nSpaces: " + spaces + "\nNumbers: " + numbers + "\nOther: " + other);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text line: ");
        String text = input.nextLine();
        count(text);
    }
}
