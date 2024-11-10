public class Cat extends Animal {
    public static int catCount = 0;
    private boolean satiety; // добавляем поле сытость

    public Cat(String name, int age) { //конструктор для котиков
        super(name, age);
        satiety = false;
        catCount++;
    }

    public void catInfo() {
        if (age <= 25) {
            System.out.println("Кот " + name + "\t" + "возраст: " + age + "\n");
        }
    }

    @Override
    public void voice(String name) {
        System.out.println("Кот " + name + " мяукнул");
    }

    public void run(int l) {
        if (l > 0 && l <= 200) {
            System.out.println("Кот " + name + " пробегает " + l + " метров.");
        } else if (l < 0) {
            System.out.println("Некорректное значение!, кот не может так бежать! Отрицательное значение пути недопустимо!");
        } else if (l > 200) {
            System.out.println("Кот столько не пробежит" + l + " м - слишком много для кота!");
        }
    }

    public void swim() {
        System.out.println("Коты не хотят плавать! ");
    }

    public static int getCatCount() {
        return catCount;
    }

    public void eatFromBowl(Bowl bowl, int food) { //метод коты кушают из миски
        if (bowl.eat(food)) {
            satiety = true;
            System.out.println(name + " покушал и сыт");
        } else System.out.println(" В миске мало еды " + name + " остался голодным");
    }
}

