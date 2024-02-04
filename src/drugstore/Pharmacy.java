package drugstore;

import drugstore.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy>{

    private String title;
    private List<Component> components = new ArrayList<>();
    private int index = 0;

    public Pharmacy(String title) {
        this.title = title;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void addComponents(Component ... components) {
        for(Component c : components){
            this.components.add(c);
        }
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }

    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(sumOfPowerInPharmacy(this.components), sumOfPowerInPharmacy(o.components));
    }

    @Override
    public String toString() {
        return String.format("%s sum of power: %d, sum of weight: %s", title, sumOfPowerInPharmacy(components),
                sumOfPWeightInPharmacy(components));
    }

    private int sumOfPowerInPharmacy(List<Component> list){
        int sumOfPower = 0;
        for (Component component: list) {
            sumOfPower += component.getPower();
        }
        return sumOfPower;
    }

    public double sumOfPWeightInPharmacy(List<Component> list){
        double sumOfWeight = 0.0;
        for (Component component: list) {
            sumOfWeight += component.getWeight();
        }
        return sumOfWeight;
    }
}