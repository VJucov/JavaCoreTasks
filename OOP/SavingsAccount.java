public class SavingsAccount {

    static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
        return monthlyInterest;
    }

    static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        annualInterestRate = 0.04;
        System.out.println("Annual interest rate: " + annualInterestRate * 100 + "%");
        System.out.println("Saver1 monthly benefit: " + saver1.calculateMonthlyInterest() + "\nSaver1 balance: " + saver1.savingsBalance);
        System.out.println("Saver2 monthly benefit: " + saver2.calculateMonthlyInterest() + "\nSaver2 balance: " + saver2.savingsBalance);

        modifyInterestRate(0.05);
        System.out.println("\nAnnual interest rate: " + annualInterestRate * 100 + "%");
        System.out.println("Saver1 monthly benefit: " + saver1.calculateMonthlyInterest() + "\nSaver1 balance: " + saver1.savingsBalance);
        System.out.println("Saver2 monthly benefit: " + saver2.calculateMonthlyInterest() + "\nSaver2 balance: " + saver2.savingsBalance);
    }
}
