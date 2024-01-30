package clinic;

import animals.Animal;
import animals.Flyable;
import animals.Goable;
import animals.Swimable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class VeterinaryClinic {
    List<Animal> allPatient = new LinkedList<>();

    public void addNewPatient(Animal animal){
        allPatient.add(animal);
    }

    public void StartShift(Doctor doctor, Nurse nurse){
        Iterator<Animal> iterator = allPatient.iterator();
        System.out.println("_______________ Бегающие животные _______________");
        printPatients(getGoableAnimals());
        System.out.println("_______________ Плавающие животные ______________");
        printPatients(getSwimableAnimals());
        System.out.println("_______________ Летающие животные _______________");
        printPatients(getSFlyableAnimals());
        System.out.println();
        System.out.printf("Доктор %s и медсестра %s начинают смену\n", doctor.getFullName(), nurse.getFullName());
//        while(iterator.hasNext()){
//            nurse.invitePatient(iterator.next().getOwner());
//            doctor.askQuestions(iterator.next().getOwner());
//            nurse.bringTools();
//            doctor.inspect(iterator.next());
//            nurse.providesAssistance(iterator.next());
//            doctor.writesPrescription();
//            System.out.printf("%s отпущен домой", iterator.next().getName());
//            iterator.remove();
//        }
    }

    public List<Animal> getGoableAnimals(){
        List<Animal> result = new ArrayList<>();
        for (Animal animal: allPatient) {
            if (animal instanceof Goable){
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getSwimableAnimals(){
        List<Animal> result = new ArrayList<>();
        for (Animal animal: allPatient) {
            if (animal instanceof Swimable){
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getSFlyableAnimals(){
        ArrayList<Animal> result = new ArrayList<>();
        for (Animal animal: allPatient) {
            if (animal instanceof Flyable){
                result.add(animal);
            }
        }
        return result;
    }

    public  void printPatients(List<Animal> patients){
        for (Animal animal: patients){
            System.out.println(animal.toString());
        }
    }
}
