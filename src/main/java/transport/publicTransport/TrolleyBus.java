package transport.publicTransport;

public class TrolleyBus extends PublicTransport {

    public TrolleyBus(String registerNumber, int capacity) {
        super(registerNumber, capacity);
    }

    @Override
    public String toString() {
        return String.format("TrolleyBus{ registration number: %s }", getRegisterNumber());
    }
}
