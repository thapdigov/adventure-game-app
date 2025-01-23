package az.turing.adventuregameapp.inventory;

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
