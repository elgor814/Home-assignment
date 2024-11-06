public class Park {
   // String workingTime;

    public static class Attractions {
        private final String name;
        private final String time;
        private final int cost;

        public Attractions(String name, String time, int coast) { // конструктор класса Attractions
            this.name = name;
            this.time = time;
            this.cost = coast;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public int getCost() {
            return cost;
        }
    }
}