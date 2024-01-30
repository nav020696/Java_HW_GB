package animals;

import clinic.Illness;
import clinic.Owner;

import java.time.LocalDate;

public class Eagle extends Animal implements Flyable{
    public Eagle(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    public Eagle() {
        super();
    }

    @Override
    public double fly() {
        System.out.println("Орел летит");
        return 190;
    }

}
