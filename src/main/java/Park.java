public class Park {
    final private String namepark;
    final private String workingTime;

    public Park(String namepark, String workingTime) {
        this.namepark = namepark;
        this.workingTime = workingTime;
    }

    public void startWorking() {
        System.out.println("Welcome to the attractions Park!!! \n");
        System.out.println(this.namepark + " opening hours " + this.workingTime + "\n\n");
    }

    public class Attractions {
        private final String name;
        private final String time;
        private final int cost;

        public Attractions(String name, String time, int coast) { // конструктор класса Attractions
            this.name = name;
            this.time = time;
            this.cost = coast;
        }

        public void infoAttraction() { // метод вызова информации об аттракционах
            System.out.println(" Attraction: " + "\t" + " opening hours: " + "\t" + " Cost " + "\t" + "\n");
            System.out.println(this.name + "\t" + this.time + "\t" + this.cost + "\t" + "\n\n");
        }
    }
}