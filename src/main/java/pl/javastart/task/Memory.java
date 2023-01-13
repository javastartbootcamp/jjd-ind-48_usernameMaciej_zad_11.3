package pl.javastart.task;

public class Memory extends Component implements Overclockable {
    private int amount;
    private int speed;
    private double temperature;
    private double maxTemperature;

    public Memory(String model, String producer, String serialNumber,
                  double temperature, double maxTemperature, int amount, int speed) {
        super(model, producer, serialNumber);
        setTemperature(temperature);
        setMaxTemperature(maxTemperature);
        this.amount = amount;
        this.speed = speed;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if (temperature < 0) {
            throw new IllegalArgumentException("Temperatura nie może być liczbą ujemną");
        }
        this.temperature = temperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        if (maxTemperature > 100) {
            throw new IllegalArgumentException("Maksymalna temperatura pamięci nie może wynosić więcej niż 100stopni" +
                    ", ponieważ może się spalić");
        }
        this.maxTemperature = maxTemperature;
    }

    @Override
    public void overclock() {
        double checkIfCanOverclock = temperature + 15;
        if (checkIfCanOverclock >= maxTemperature) {
            throw new TooHighTemperatureException();
        }
        speed += 100;
        temperature += 15;
    }

    @Override
    public String toString() {
        return "model:" + getModel() + ", producer:" + getProducer() + ", serialNumber:" + getSerialNumber() +
                ", temperature:" + temperature + "°C, maxTemperature:" + maxTemperature +
                "°C, amount:" + amount + "MB, speed:" + speed + "MHz\n";
    }
}
