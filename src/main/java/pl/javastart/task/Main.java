package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Procesor procesor = null;
        Memory memory = null;
        try {
            procesor = new Procesor("i7-12700K", "Intel Core", "80BDL098SKL9", 60, 100, 3600);
            memory = new Memory("FURY CL16 Beast Black", "Kingston", "3762SHNBCJ2S", 70, 100, 16, 3200);
            HardDrive hardDrive = new HardDrive("Expansion Gen. 1 Black", "Seagate", "5JKH3KJ2B6K2", 1000);

            Computer computer = new Computer(procesor, memory, hardDrive);

            System.out.println(computer);
            memory.overclock();
            System.out.println(computer);
        } catch (TooHighTemperatureException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            procesor.overclock();
            procesor.overclock();
            procesor.overclock();
            procesor.overclock();
        } catch (TooHighTemperatureException e ) {
            System.err.println(e.getMessage());
        }
        System.out.println(procesor);
    }
}
