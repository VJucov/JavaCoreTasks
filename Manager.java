public class Manager extends Employee {

    @Override
    public double getSalary() {
        return super.getSalary() + 0.5 * super.getSalary();
    }

}