package transport.publicTransport;

public class Bus extends PublicTransport {

    public Bus(String registerNumber, int capacity) {
        super(registerNumber, capacity);
    }

    @Override
    public String toString() {
        return String.format("Bus{ registration number: %s }", getRegisterNumber());
    }
}
