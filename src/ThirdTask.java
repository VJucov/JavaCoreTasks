import java.util.Scanner;

public class ThirdTask {
    public static Boolean isPalindrome(int nr) {
        int reversed = 0;
        int num = nr;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;}
        return nr == reversed;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Is this number a palindrome? The answer is: " + isPalindrome(number));
    }
}

