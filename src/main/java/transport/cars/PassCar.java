package transport.cars;

public class PassCar extends Car {

    /** Год выпуска */
    private int year;

    public PassCar(String registerNumber) {
        super(registerNumber);
    }

    public PassCar(String registerNumber, int year) {
        super(registerNumber);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("PassengerCar{ registration number: %s }", getRegisterNumber());
    }
}
