package clinic;

public class Owner {
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public Owner(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return String.format("Владелец: %s", fullName);
    }
}
