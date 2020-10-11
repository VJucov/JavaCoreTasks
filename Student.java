public class Student {

    private String name;
    private int age;

    public void setData(String n, int a) {
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setData("Tom", 30);
        Student student2 = new Student();
        student2.setData("Tim", 25);

        int averageAge;
        averageAge = (student1.getAge() + student2.getAge()) / 2;
        System.out.println("The average age: " + averageAge);
    }
}
