package drugstore;

import drugstore.components.Azitronite;
import drugstore.components.Penicillin;
import drugstore.components.Water;

import java.util.*;

public class Drugmain {

    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);

//        PharmacyTwo p1 = new PharmacyTwo();
//        p1.addComponents(water, azitronite);
//
//        PharmacyTwo p2 = new PharmacyTwo();
//        p2.addComponents(penicillin, water);
//
//        PharmacyTwo p3 = new PharmacyTwo();
//        p3.addComponents(azitronite, penicillin);
//
//        List<Component> components = new ArrayList<>();
//
//        components.add(azitronite);
//        components.add(water);
//        components.add(penicillin);

//        System.out.println(components);
//
//        Collections.sort(components,Comparator.reverseOrder());
//        System.out.println(components);

//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

//        for (Component c : p2) {
//            System.out.println(c);
//        }

        Pharmacy pharmacy1 = new Pharmacy("Препарат 1");
        pharmacy1.addComponents(water, penicillin);
        Pharmacy pharmacy2 = new Pharmacy("Препарат 2");
        pharmacy2.addComponents(azitronite, water);
        Pharmacy pharmacy3 = new Pharmacy("Препарат 3");
        pharmacy3.addComponents(azitronite, penicillin);

        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(pharmacy3);
        pharmacyList.add(pharmacy2);
        pharmacyList.add(pharmacy1);

        System.out.println("Изначальный список");
        System.out.println(pharmacyList);
        Collections.sort(pharmacyList);
        System.out.println("Список после сортировки по сумме power");
        System.out.println(pharmacyList);
//        pharmacyList.sort((ph1, ph2) -> Integer.compare((int)ph1.sumOfPWeightInPharmacy(ph1.getComponents()),
//                (int)ph2.sumOfPWeightInPharmacy(ph2.getComponents()))); //полная запись сортировки препаратов через лямбду, ниже сокращенная версия
        pharmacyList.sort(Comparator.comparingInt(ph -> (int) ph.sumOfPWeightInPharmacy(ph.getComponents())));
        System.out.println("Список после сортировки по сумме веса");
        System.out.println(pharmacyList);
    }
}