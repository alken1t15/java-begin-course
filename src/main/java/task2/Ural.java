package task2;

public class Ural extends Motorbike {

    public Ural() {
        super();
    }

    public Ural(double volume, boolean firstAidKit) {
        super(volume);
        this.firstAidKit = firstAidKit;
    }

    private boolean firstAidKit;

    public boolean isFirstAidKit() {
        return firstAidKit;
    }

    public void setFirstAidKit(boolean firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    public void showInfo() {
        System.out.println("Объем бака: " + getVolume() + " есть ли оптечка: " + firstAidKit);
    }
}