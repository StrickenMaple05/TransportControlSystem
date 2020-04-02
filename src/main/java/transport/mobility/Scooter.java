package transport.mobility;

public class Scooter extends IndMobility {

    public Scooter(String registerNumber) {
        super(registerNumber);
    }

    @Override
    public String toString() {
        return String.format("Scooter{ registration number: %s }", getRegisterNumber());
    }
}
