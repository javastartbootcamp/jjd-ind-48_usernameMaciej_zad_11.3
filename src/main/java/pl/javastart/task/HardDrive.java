package pl.javastart.task;

public class HardDrive extends Component {
    private int capacity;

    public HardDrive(String model, String producer, String serialNumber, int capacity) {
        super(model, producer, serialNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "model:" + getModel() + ", producer:" + getProducer() + ", serialNumber:" + getSerialNumber() +
                "°C, capacity:" + capacity + "GB\n";
    }
}
