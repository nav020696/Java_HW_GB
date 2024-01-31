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
        System.out.printf("Доктор %s и медсестра %s начинают смену\n", doctor.getFullName(), nurse.getFullName());
        Iterator<Animal> iterator = allPatient.iterator();
        while(iterator.hasNext()){
            Animal animal = iterator.next();
            nurse.invitePatient(animal.getOwner());
            doctor.askQuestions(animal.getOwner());
            nurse.bringTools();
            doctor.inspect(animal);
            nurse.providesAssistance(animal);
            doctor.writesPrescription();
            System.out.printf("%s отпущен домой\n", animal.getName());
            System.out.println();
            iterator.remove();
        }
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
