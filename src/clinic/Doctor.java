package clinic;

import animals.Animal;

public class Doctor extends Personal {
    public Doctor(String fullName, String telephone, String jobTitle) {
        super(fullName, telephone, jobTitle);
    }

    public void askQuestions(Owner owner){
        System.out.printf("Доктор задает вопросы %s\n", owner.getFullName());
    }

    public void inspect(Animal animal){
        System.out.printf("Доктор осматривает %s и озвучивает диагноз %s\n", animal.getName(), animal.getIllness().getTitle());
    }
    public void writesPrescription(){
        System.out.println("Доктор выписывает рецепт и отпускает больного");
    }
}
