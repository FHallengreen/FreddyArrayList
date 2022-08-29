import java.util.ArrayList;

public class Car {

    private int year;
    private String model;

    public Car(String model) {

        this.model = model;
    }

    @Override
    public String toString() {
        return "Model: " + model;
    }
}
