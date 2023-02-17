package task4;

public class Computer implements IComputer {
    private String name;

    private Monitor monitor;

    public Computer(String name, Monitor monitor) {
        this.name = name;
        this.monitor = monitor;
    }

    public Computer() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void on() {
        System.out.println("Компьютер включился " + name + ", используется монитор " + monitor.getName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер выключился  " + name + ", используется монитор " + monitor.getName());
    }
}