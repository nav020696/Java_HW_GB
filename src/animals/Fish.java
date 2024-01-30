package animals;

import clinic.Illness;
import clinic.Owner;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable{
    public Fish(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    public Fish() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double swim() {
        System.out.println("Рыбка плавает");
        return 2;
    }
}
