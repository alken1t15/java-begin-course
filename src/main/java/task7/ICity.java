package task7;

import java.util.ArrayList;

public interface ICity {
    String getName();

    ArrayList<IHouse> getHouseList();

    void showSettledList();

    void addHouse(IHouse iHouse);
}