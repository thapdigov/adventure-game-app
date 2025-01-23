package az.turing.adventuregameapp.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static Weapon[] weaponList() {
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon("Gun", 1, 2, 15);
        weaponList[1] = new Weapon("Sword", 2, 4, 25);
        weaponList[2] = new Weapon("Gun", 3, 7, 40);
        return weaponList;
    }
    public static Weapon getWeaponById(int id) {
        Weapon selectedWeapon = null;
        for (Weapon weapon : weaponList()) {
            if (weapon.getID().equals(id)) {
                selectedWeapon = weapon;
            }
        }
        return selectedWeapon;
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
}
