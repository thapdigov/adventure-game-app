package az.turing.adventuregameapp.inventory;

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
