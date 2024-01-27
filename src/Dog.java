package Course2.Seminar1;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }
}
