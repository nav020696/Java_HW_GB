package Course2.Seminar1;

import java.time.LocalDate;

public class Cat extends Animal{

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
}
