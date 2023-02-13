package task2;

public class Motorbike extends Transport {

    public Motorbike() {
        super();
    }

    public Motorbike(double volume) {
        this.volume = volume;
    }

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}