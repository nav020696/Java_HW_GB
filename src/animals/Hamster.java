package animals;

import clinic.Illness;
import clinic.Owner;

import java.time.LocalDate;

public class Hamster extends Animal implements Goable{
    public Hamster(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    public Hamster() {
        super();
    }

    @Override
    public double run() {
        System.out.println("Хомяк бегает");
        return 5;
    }
}
