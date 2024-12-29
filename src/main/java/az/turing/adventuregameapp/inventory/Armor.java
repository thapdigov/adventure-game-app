package az.turing.adventuregameapp.inventory;

import java.util.ArrayList;
import java.util.List;

public class Armor {
    private Integer ID;
    private String name;
    private Integer blocke;
    private Integer price;

    public Armor(Integer ID, String name, Integer blocke, Integer price) {
        this.ID = ID;
        this.name = name;
        this.blocke = blocke;
        this.price = price;
    }

    public static List<Armor> armorList() {
        List<Armor> armorList = new ArrayList<>();
        armorList.add(new Armor(1, "light", 2, 20));
        armorList.add(new Armor(2, "medium", 3, 30));
        armorList.add(new Armor(3, "heavy", 5, 40));
        return armorList;
    }

    public static Armor getArmorById(int id) {
        Armor armor = null;
        for (Armor a : armorList()) {
            if (a.getID().equals(id)) {
                armor = a;
            }
        }
        return armor;
    }


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBlocke() {
        return blocke;
    }

    public void setBlocke(Integer blocke) {
        this.blocke = blocke;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Armor: " + "ID: " + ID + " ,name: " + name + " ,blocke: " + blocke + " ,price: " + price;
    }
}
