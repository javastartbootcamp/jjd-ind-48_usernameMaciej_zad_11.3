package pl.javastart.task;

public class Computer {
    private Procesor procesor;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer(Procesor procesor, Memory memory, HardDrive hardDrive) {
        this.procesor = procesor;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Procesor: " + procesor + "Memory: " + memory + "HardDrive: " + hardDrive;
    }
}
