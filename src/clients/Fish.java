package clients;

import java.time.LocalDate;

public class Fish extends Animal {
    public Fish(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    public Fish() {
        super();
    }

    @Override
    public void fly() {
        System.out.println("Я не умею летать, буль");
    }

    @Override
    public void toGo() {
        System.out.println("Я не умею ходить или бегать, буль");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
