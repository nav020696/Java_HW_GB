package animals;

import clinic.Illness;
import clinic.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable{

    protected Double discount;
    public Cat(String name, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(name, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10.0;
    }

    @Override
    public String toString() {
        return super.toString() + " discount " + discount;
    }

    @Override
    public double run() {
        System.out.println("Кошка бежит");
        return 14;
    }
}
