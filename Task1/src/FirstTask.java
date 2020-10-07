public class FirstTask {

    public static void addDigits(int num) {
        if (num > 0 && num <= 1000) {
            int sum = 0;
            while (num != 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }
            System.out.println("The sum of all digits is " + sum);
        } else {
            System.out.println("The number must be between 0 and 1000.");
        }
    }
    public static void main(String[] args) {
      addDigits(565);
    }
}
