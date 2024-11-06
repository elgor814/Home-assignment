public class Employee {

    private String name;
    private String title;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

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


    public static void main(String[] args) {

        Employee employee1 = new Employee("Alex", "engineer", "alex@gmail.com", "123456", 2500, 35);
        employee1.infoEmploy();

        Employee[] emplArray = new Employee[5]; // объявляем массив объектов

        // для каждой ячейки массива задаем объект
        emplArray[0] = new Employee("Alex", "engineer", "alex@gmail.com", "123456", 2500, 35);
        emplArray[1] = new Employee("Mark", "engineer", "mark@gmail.com", "223456", 2300, 30);
        emplArray[2] = new Employee("Boris", "Boss", "Borya@gmail.com", "323456", 5000, 42);
        emplArray[3] = new Employee("Sam", "developer", "sam@gmail.com", "423456", 3500, 37);
        emplArray[4] = new Employee("Margo", "tester", "tester@gmail.com", "523456", 2300, 30);

        // Вывод информации о сотрудниках
        for (Employee employee : emplArray) {
            employee.infoEmploy();
        }

        // Для класса Park
        //Park park = new Park(); // создаем объект Park
        Park.Attractions attraction1 = new Park.Attractions("Горки", "9.00-18.00", 500);
        Park.Attractions attraction2 = new Park.Attractions("Авто", "9.00-15.00", 700);
        Park.Attractions attraction3 = new Park.Attractions("Комната смеха", "9.00-18.00", 300);

        // использование геттеров для получения информации об аттракционах
        System.out.println(attraction1.getName()
                + "\t" + attraction1.getTime()
                + "\t" + attraction1.getCost());
        System.out.println(attraction2.getName()
                + "\t" + attraction2.getTime()
                + "\t" + attraction2.getCost());
        System.out.println(attraction3.getName()
                + "\t" + attraction3.getTime()
                + "\t" + attraction3.getCost());
    }
}
