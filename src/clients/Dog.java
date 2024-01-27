package clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    @Override
    public void fly() {
        System.out.println("Я не умаю летать, гав");
    }
}
