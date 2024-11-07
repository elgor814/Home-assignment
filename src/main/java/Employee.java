public class Employee {

    private final String name;
    private final String title;
    private final String email;
    private final String phoneNumber;
    private final int salary;
    private final int age;

    public Employee(String name, String title, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.title = title;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void infoEmploy() {
        System.out.println(" Сотрудник:      " + this.name + "\n" + " Должность:      " + this.title + "\n" + " Email:          " + this.email + "\n" + " Номер телефона: " + this.phoneNumber + "\n" + " Зарплата:       " + this.salary + "\n" + " Возраст:        " + this.age + "\n");
    }
}
