package Course2.Seminar1;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    public Animal(String name, Owner owner, LocalDate birthDate, Illness illness) {
        this.name = name;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
        this("Котик", new Owner("Alex"), LocalDate.now(), new Illness("Болезнь"));
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

    private void wakeUp(){
        System.out.println("Животное проснулось");
    }

    private void wakeUp(String time){
        System.out.println("Животное проснулось в " + time);
    }

    private void hunt(){
        System.out.println("Животное охотится");
    }

    private void eat(){
        System.out.println("Животное ест");
    }
    private void sleep(){
        System.out.println("Животное спит");
    }

    public void lifeCircle(){
        wakeUp("12:00");
        hunt();
        eat();
        sleep();
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("Name = %s, bd = %s, Owner = %s, Illness = %s", name, birthDate, owner, illness);
    }
}
