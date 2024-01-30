package animals;

import clinic.Illness;
import clinic.Owner;

import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected Owner owner;
    protected LocalDate birthDate;
    Illness illness;

    public Animal(String name, Owner owner, LocalDate birthDate, Illness illness) {
        this.name = name;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
        this("Котик", new Owner("Alex"), LocalDate.now(), new Illness("Лишай","таблетка"));
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("Кличка = %s, День рождения = %s, %s, %s", name, birthDate, owner, illness);
    }
}
