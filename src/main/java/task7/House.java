package task7;

import java.util.ArrayList;

public class House implements IHouse {

    private String address;

    private ArrayList<IFlat> flatList;

    public House(String address) {
        this.address = address;
    }

    public House() {
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public ArrayList<IFlat> getFlatList() {
        return flatList;
    }

    @Override
    public void addFlat(IFlat iFlat) {
        if (flatList == null) {
            flatList = new ArrayList<>();
        }
        flatList.add(iFlat);
    }
}