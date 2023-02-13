package task2;

public class Kawasaki extends Motorbike {

    public Kawasaki() {
        super();
    }

    public Kawasaki(double volume, int year) {
        super(volume);
        this.year = year;
    }

    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void jump() {
        System.out.println("Kawasaki jump");
    }
}