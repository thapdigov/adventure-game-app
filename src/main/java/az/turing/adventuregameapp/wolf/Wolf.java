package az.turing.adventuregameapp.wolf;

public class Wolf {
    private Integer id;
    private String name;
    private Integer damage;
    private Integer health;
    private Integer originalHealth;
    private Integer gold;

    public Wolf(Integer id, String name, Integer damage, Integer health, Integer gold) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.originalHealth = health;
        this.gold = gold;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(Integer originalHealth) {
        this.originalHealth = originalHealth;
    }

    @Override
    public String toString() {
        return "Wolf " + "ID: " + id + " ,name: " + name + " ,damage: " + damage + " ,health: " + health;
    }


}
