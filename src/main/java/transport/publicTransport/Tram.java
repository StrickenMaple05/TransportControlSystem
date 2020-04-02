package transport.publicTransport;

public class Tram extends PublicTransport {

    public Tram(String registerNumber, int capacity) {
        super(registerNumber, capacity);
    }

    @Override
    public String toString() {
        return String.format("Tram{ registration number: %s }", getRegisterNumber());
    }
}
