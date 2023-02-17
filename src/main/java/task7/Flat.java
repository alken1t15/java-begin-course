package task7;

import java.util.ArrayList;

public class Flat implements IFlat {
    private int number;

    private ArrayList<Settler> settlerList;

    public Flat(int number) {
        this.number = number;
    }

    public Flat() {
    }

    @Override
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public ArrayList<Settler> getSettlerList() {
        return settlerList;
    }

    @Override
    public void addSettler(Settler settler) {
        if (settlerList == null) {
            settlerList = new ArrayList<>();
        }
        if (settlerList.size()==2){
            System.out.println("Нельзя заселить более 2-х жителей в квартиру " + number);
            return;
        }
        settlerList.add(settler);
    }
}