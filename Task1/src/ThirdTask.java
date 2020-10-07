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
        System.out.println(isPalindrome(23132));
    }
}

