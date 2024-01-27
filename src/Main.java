package Course2.Seminar1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Кеша", new Owner("Иванов И.В"),
                LocalDate.of(2023, 10, 1), new Illness("Блохи"));
        Animal cat2 = new Animal();
        System.out.println(cat2.getName());
        System.out.println(cat.getName());
        System.out.println(cat.getOwner());
        cat.setIllness(new Illness("Здоров"));
        cat.lifeCircle();
        System.out.println(cat);

        Cat cat3 = new Cat();
        Dog dog = new Dog();

        System.out.println(cat3);
    }
}
