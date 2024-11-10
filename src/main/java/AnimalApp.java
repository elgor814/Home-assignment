public class AnimalApp {
    public static void main(String[] args) {

        Cat catMurzik = new Cat("Murzik", 5);
        Cat catWiskas = new Cat("Wiskas", 9);
        Cat catBasik = new Cat("Basik", 2);
        Dog dogBobik = new Dog("Bobik", 5);
        Dog dogBoss = new Dog("Boss", 5);

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


        // Расширяем "задачу". Создадим массив котов
        Cat[] cats = {
                new Cat("Basik", 3),
                new Cat("Murzik", 5),
                new Cat("Wiskas", 2),
                new Cat("Myava", 4),
        };

        // Вывод информации о каждом коте
        for (Cat cat : cats) {
            cat.catInfo();
        }

        Bowl bowl = new Bowl(20); // создадим миску с количеством еды 20 единиц

        //Коты кушают из миски по 5 единиц еды
        for (Cat cat : cats) {
            cat.eatFromBowl(bowl, 5);
        }

        bowl.addFood(15);
        bowl.getFoodAmount();

        System.out.println("\nКоличество котов: " + Cat.getCatCount());
        System.out.println("Количество псов: " + Dog.getDogCount());
        System.out.println("Количество всех созданных животных: " + Animal.getAnimalCount());
    }
}
