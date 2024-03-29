import animals.*;
import clinic.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Мурка", new Owner("Яровой И.В."),
                LocalDate.of(2022, 1, 12),
                new Illness("Лишай", "таблетки"), 10.0);

        Animal dog = new Dog("Бобик", new Owner("Иванов Е.С."),
                LocalDate.of(2021, 6, 15), new Illness("Больное ушко", "укола"));

        Animal fish = new Fish("Дори", new Owner("Кириллова А.С."),
                LocalDate.of(2023, 11, 30), new Illness("Не ест", "укола"));

        Animal eagle = new Eagle("Миша", new Owner("Мировая И.В."),
                LocalDate.of(2023, 12, 2), new Illness("Сломано крыло", "гипса"));

        Doctor doctor = new Doctor("Ясенков П.С.", "89215433343", "Врач общей практики");
        Nurse nurse = new Nurse("Лещенко О.С.", "89345678999");
        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();
        veterinaryClinic.addNewPatient(cat);
        veterinaryClinic.addNewPatient(dog);
        veterinaryClinic.addNewPatient(fish);
        veterinaryClinic.addNewPatient(eagle);

        System.out.println("_______________ Бегающие животные _______________");
        veterinaryClinic.printPatients(veterinaryClinic.getGoableAnimals());
        System.out.println("_______________ Плавающие животные ______________");
        veterinaryClinic.printPatients(veterinaryClinic.getSwimableAnimals());
        System.out.println("_______________ Летающие животные _______________");
        veterinaryClinic.printPatients(veterinaryClinic.getSFlyableAnimals());
        System.out.println();

        veterinaryClinic.StartShift(doctor, nurse);
    }
}
