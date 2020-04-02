package transport;

public abstract class Vehicle {

    /** Регистрационный номер в системе учёта */
    private String registerNumber;

    public Vehicle(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }
}
