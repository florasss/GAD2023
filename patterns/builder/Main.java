package patterns.builder;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer.Builder("MotherBoard","19")
                .setBattery(4200)
                .setRAM(4000)
                .setColor("Red")
                .setStorage(2000)
                .setVideo("Nvidia");

        Computer computer ();


    }
}
