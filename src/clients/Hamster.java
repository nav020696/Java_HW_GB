package clients;

import java.time.LocalDate;

public class Hamster extends Animal {
    public Hamster(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    public Hamster() {
        super();
    }

    @Override
    public void swim() {
        System.out.println("Я не умею плавать, хрум");
    }

    @Override
    public void fly() {
        System.out.println("Я не умею летать, хрум");
    }
}
