public class Main {
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

        Park park = new Park("Park", "9.00-18.00");
        Park.Attractions attraction = park.new Attractions("Горки", "9.00-18.00", 500);
        Park.Attractions attraction2 = park.new Attractions("Авто", "9.00-15.00", 700);
        Park.Attractions attraction3 = park.new Attractions("Комната смеха", "9.00-18.00", 300);

        park.startWorking();
        attraction.infoAttraction();
        attraction2.infoAttraction();
        attraction3.infoAttraction();

    }
}
