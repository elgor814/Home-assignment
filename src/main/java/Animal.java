public abstract class Animal {
    protected String name;
    protected int age;
    private static int count = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public void run(int l) {
        System.out.println("Животное бежит " + l + "метров");
    }

    public void swim(int l) {
        System.out.println("Животное плывет ");
    }

    public void voice(String name) {
        System.out.println("Издает звук");
    }

    public static int getAnimalCount() {
        return count;
    }
}