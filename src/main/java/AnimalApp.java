public class AnimalApp {
    public static void main(String[] args) {

        //Animal animal = new Animal("Кинг-конг", 136);

        Cat catMurzik = new Cat("Murzik", 5);
        Cat catWiskas = new Cat("Wiskas", 9);
        Cat catBasik = new Cat("Basik", 2);
        Dog dogBobik = new Dog("Bobik", 5);
        Dog dogBoss = new Dog("Boss", 5);

       // animal.animalInfo();
        catBasik.catInfo();
        catMurzik.catInfo();
        catWiskas.catInfo();

        dogBobik.dogInfo();

        catBasik.voice("Basik");
        dogBobik.voice("Bobik");

        catWiskas.run(-5);
        catBasik.run(500);
        catMurzik.run(18);

        dogBobik.run(160);
        dogBobik.run(-8);
        dogBobik.run(800);

        catWiskas.swim();

        dogBoss.swim(7);
        dogBoss.swim(16);
        dogBoss.swim(-3);


        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Количество псов: " + Dog.getDogCount());
        System.out.println("Количество всех созданных животных: " + Animal.getAnimalCount());

        
    }

}
