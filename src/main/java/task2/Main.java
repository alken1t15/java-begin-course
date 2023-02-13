package task2;

public class Main {
    public static void main(String[] args) {
        Kawasaki kawasaki = new Kawasaki(150, 2020);
        kawasaki.jump();
        Ural ural = new Ural(130, true);
        ural.showInfo();
    }
}