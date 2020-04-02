package transport.cars;

public class Truck extends Car {

    public Truck(String registerNumber) {
        super(registerNumber);
    }

    @Override
    public String toString() {
        return String.format("Truck{ registration number: %s }", getRegisterNumber());
    }
}
