package task7;

import java.util.ArrayList;

public interface IHouse {
    String getAddress();

    ArrayList<IFlat> getFlatList();

    void addFlat(IFlat iFlat);
}