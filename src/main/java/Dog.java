public class Dog extends Animal {
    public static int dogCount = 0;

    public Dog(String name, int age) { //конструктор для котиков
        super(name, age);
        dogCount++;
    }

    public void dogInfo() {
        if(age<=25) {
            System.out.println("Пёс " + name + "\t" + "возраст: " + age + "\n");
        }
    }

    @Override
    public void voice(String name) {
        System.out.println("Пёс " + name + " сказал ГАВ-ГАВ! ");
    }

    public void run(int l) {
        if (l > 0 && l <= 500) {
            System.out.println("Пёс " + name + " пробегает " + l + " метров."); //+ l + "метров");
        } else if (l < 0) {
            System.out.println("Некорректное значение! Пока значение такое - пёс не побежит!");
        } else if (l > 200) {
            System.out.println("Пес столько уже не пробежит " + l + "м - слишком много даже для собаки!");
        }
    }

    public void swim(int l) {
        if (l > 0 && l <= 10) {
            System.out.println("Пёс " + name + " проплывает " + l + " метров.");
        } else if (l < 0) {
            System.out.println("Некорректное значение! Пока значение отрицательное - пёс плавать отказывается!");
        } else if (l > 10) {
            System.out.println("Не надо мучать пса, " + l + "м пёс не проплывет!");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }

}


