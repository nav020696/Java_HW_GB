package clinic;

import animals.Animal;

public class Nurse extends Personal {
    public Nurse(String fullName, String telephone) {
        super(fullName, telephone, "медсестра");
    }

    public void invitePatient(Owner owner){
        System.out.printf("Медсестра приглашает на осмотр %s\n", owner.getFullName());
    }
    public void bringTools(){
        System.out.println("Медсестра приносит инструменты");
    }

    public void providesAssistance(Animal animal){
        System.out.printf("Медсестра оказывает помощь %s с помощью %s", animal.getName(), animal.getIllness().getMedication());
    }
}
