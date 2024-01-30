package animals;

import clinic.Illness;
import clinic.Owner;

import java.time.LocalDate;

public class Parrot extends Animal implements Flyable{
    public Parrot(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    public Parrot() {
        super();
    }

    @Override
    public double fly() {
        System.out.println("Попугай летит");
        return 120;
    }
}
