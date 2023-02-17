package task7;

import java.util.ArrayList;

public class City implements ICity {
    private String name;
    private ArrayList<IHouse> houseList;

    public City(String name) {
        this.name = name;
    }

    public City() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<IHouse> getHouseList() {
        return houseList;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showSettledList() {
        System.out.println("Город: " + name);
        for (IHouse iHouse : houseList) {
            System.out.println("Дом: " + iHouse.getAddress());
            for (IFlat iFlat : iHouse.getFlatList()) {
                System.out.println("- Квартира: " + iFlat.getNumber());
                if (iFlat.getSettlerList() == null) {
                    System.out.println("-- Никто не живет");
                    continue;
                }
                for (Settler settler : iFlat.getSettlerList()) {
                    System.out.println("-- Житель " + settler.getName());
                }
            }
        }
    }

    @Override
    public void addHouse(IHouse iHouse) {
        if (houseList == null) {
            houseList = new ArrayList<>();
        }
        houseList.add(iHouse);
    }
}