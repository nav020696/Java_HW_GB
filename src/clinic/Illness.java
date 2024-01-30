package clinic;

public class Illness {
    private String title;
    private String medication;

    public Illness(String title, String medication) {
        this.title = title;
        this.medication = medication;
    }

    public String getTitle() {
        return title;
    }

    public String getMedication() {
        return medication;
    }

    @Override
    public String toString() {
        return String.format("Болезнь: %s и лечение: %s", title, medication);
    }
}
