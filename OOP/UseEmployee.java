public class UseEmployee {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.hours = 160;
        System.out.println("Tariff per hour: " + emp.getTariffPerHour());
        System.out.println("Employee's salary: " + emp.getSalary());

        Employee manager = new Manager();
        manager.hours = 160;
        System.out.println("\nTariff per hour: " + manager.getTariffPerHour());
        System.out.println("Manager's salary: " + manager.getSalary());
    }
}
