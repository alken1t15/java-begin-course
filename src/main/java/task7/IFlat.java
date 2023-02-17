package task7;

import java.util.ArrayList;

public interface IFlat {
    int getNumber();

    ArrayList<Settler> getSettlerList();

    void addSettler(Settler flat);
}