public class Car {

    private int year;
    private String model;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    @Override
    public String toString() {
        return "year: " + year +
                ", model: '" + model;
    }
}
