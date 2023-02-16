package task4;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung");
        Computer computer = new Computer();
        computer.setName("MacBook");
        computer.setMonitor(monitor);
        computer.on();
        computer.off();
    }
}