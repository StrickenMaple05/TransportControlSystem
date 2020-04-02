package transport.mobility;

public class Bicycle extends IndMobility {

    public Bicycle(String registerNumber) {
        super(registerNumber);
    }

    @Override
    public String toString() {
        return String.format("Bicycle{ registration number: %s }", getRegisterNumber());
    }
}
