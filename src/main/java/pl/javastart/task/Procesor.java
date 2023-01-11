package pl.javastart.task;

public class Procesor extends Component implements Overclockable {
    private int speed;
    private double temperature;
    private double maxTemperature;

    public Procesor(String model, String producer, String serialNumber, double temperature, double maxTemperature, int speed) {
        super(model, producer, serialNumber);
        setTemperature(temperature);
        setMaxTemperature(maxTemperature);
        this.speed = speed;
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
            throw new IllegalArgumentException("Maksymalna temperatura procesora nie może wynosić więcej niż 100stopni" +
                    ", ponieważ może się spalić");
        }
        this.maxTemperature = maxTemperature;
    }

    @Override
    public void overclock() {
        speed += 100;
        temperature += 10;
        if (temperature >= maxTemperature) {
            throw new TooHighTemperatureException();
        }
    }

    @Override
    public String toString() {
        return "model:" + getModel() + ", producer:" + getProducer() + ", serialNumber:" + getSerialNumber() +
                ", temperature:" + temperature + "°C, maxTemperature:" + maxTemperature +
                "°C, speed:" + speed + "MHz\n";
    }
}
