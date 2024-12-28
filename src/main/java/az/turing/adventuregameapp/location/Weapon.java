package az.turing.adventuregameapp.location;

public class Weapon {
    private String name;
    private Integer ID;
    private Integer damage;
    private Integer price;

    public Weapon(String name, Integer ID, Integer damage, Integer price) {
        this.name = name;
        this.ID = ID;
        this.damage = damage;
        this.price = price;
    }
    public static Weapon[] weaponList() {
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon("Gun", 1, 2, 5);
        weaponList[1] = new Weapon("Sword", 2, 4, 35);
        weaponList[2] = new Weapon("Gun", 3, 7, 45);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + ID + " ,name: " + name + " ,damage: " + damage + " ,price: " + price;
    }
}
