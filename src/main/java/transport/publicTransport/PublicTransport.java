package transport.publicTransport;

import transport.Vehicle;

public class PublicTransport extends Vehicle {

    /** Вместимость общественного транспорта */
    private int capacity;

    public PublicTransport(String registerNumber, int capacity) {
        super(registerNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
