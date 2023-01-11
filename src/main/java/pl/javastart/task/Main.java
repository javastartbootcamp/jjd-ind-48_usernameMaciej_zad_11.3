package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        try {
            Procesor procesor = new Procesor("i7-12700K", "Intel Core", "80BDL098SKL9", 60, 100, 3600);
            Memory memory = new Memory("FURY CL16 Beast Black", "Kingston", "3762SHNBCJ2S", 70, 100, 16, 3200);
            HardDrive hardDrive = new HardDrive("Expansion Gen. 1 Black", "Seagate", "5JKH3KJ2B6K2", 1000);

            Computer computer = new Computer(procesor, memory, hardDrive);

            System.out.println(computer);
            memory.overclock();
            memory.overclock();
            System.out.println(computer);
        } catch (TooHighTemperatureException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
