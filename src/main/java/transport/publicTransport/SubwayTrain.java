package transport.publicTransport;

public class SubwayTrain extends PublicTransport {

    public SubwayTrain(String registerNumber, int capacity) {
        super(registerNumber, capacity);
    }

    @Override
    public String toString() {
        return String.format("SubwayTrain{ registration number: %s }", getRegisterNumber());
    }
}
