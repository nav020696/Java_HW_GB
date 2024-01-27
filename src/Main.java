import clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Мурка", new Owner("Яровой И.В."),
                LocalDate.of(2022, 1, 12), new Illness("Лишай"), 10.0);
        cat.fly();
        cat.swim();
        cat.toGo();
        System.out.println("--------------------------------");

        Animal dog = new Dog("Бобик", new Owner("Иванов Е.С."),
                LocalDate.of(2021, 6, 15), new Illness("Больное ушко"));
        dog.fly();
        dog.swim();
        dog.toGo();
        System.out.println("--------------------------------");

        Animal fish = new Fish("Дори", new Owner("Кириллова А.С."),
                LocalDate.of(2023, 11, 30), new Illness("Не ест"));
        fish.fly();
        fish.swim();
        fish.toGo();
        System.out.println("--------------------------------");

        Animal hamster = new Hamster("Миша", new Owner("Мировая И.В."),
                LocalDate.of(2023, 12, 2), new Illness("Сломана лапка"));
        hamster.fly();
        hamster.swim();
        hamster.toGo();
    }
}
