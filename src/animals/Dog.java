package animals;

import clinic.Illness;
import clinic.Owner;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable{
    public Dog(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    @Override
    public double run() {
        System.out.println("Собака бежит");
        return 15;
    }

    @Override
    public double swim() {
        System.out.println("Собака плавает");
        return 2;
    }
}
