package Proekt;

public class  Driver {

    private Transport transport;

    public Driver(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Driver{" + "transport=" + transport.getClass().getSimpleName() + '}';
    }
}
