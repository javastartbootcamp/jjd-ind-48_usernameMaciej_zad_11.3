package pl.javastart.task;

public class TooHighTemperatureException extends RuntimeException {
    public TooHighTemperatureException() {
        super("Temperatura jest zbyt wysoka, kolejne podkrecenie spaliłoby podzespół");
    }
}
