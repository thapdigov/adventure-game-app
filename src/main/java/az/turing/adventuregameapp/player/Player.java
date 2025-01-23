package az.turing.adventuregameapp.player;

import az.turing.adventuregameapp.inventory.Armor;
import az.turing.adventuregameapp.inventory.Weapon;
import az.turing.adventuregameapp.util.InputUtil;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private Integer ID;
    private String name;
    private Integer damage;
    private Integer health;
    private Integer originalHealth;
    private Integer money;
    private Weapon weapon = new Weapon("Fist", 0, 0, 0);
    private Armor armor = new Armor(0, "Nothing", 0, 0);
    private final List<String> award = new ArrayList<>();

    public Player() {
    }

    public Player(Integer ID, String name, Integer damage, Integer health, Integer money) {
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.originalHealth = health;
        this.money = money;
    }


    public void selectCharacter() {
        System.out.println("\t\t########PLAYERS########");
        System.out.println("-------------------------------------------------------------------");
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();
        System.out.println(samurai);
        System.out.println(knight);
        System.out.println(archer);
        System.out.println("-------------------------------------------------------------------");
        Integer playerId = InputUtil.getInteger("Choose the Player,Enter the playerId:");
        System.out.println("------------------------------------------------------------------------------");
        while (!(playerId == 1 || playerId == 2 || playerId == 3)) {
            playerId = InputUtil.getInteger("Invalid input,Enter the playerId between 1 and 3!");
        }
        System.out.println("------------------------------------------------------------------------------");

        switch (playerId) {
            case 1 -> {
                printPlayer(samurai, samurai.getID(), samurai.getName(), samurai.getDamage(),
                        samurai.getHealth(), samurai.getMoney());
            }
            case 2 -> {
                printPlayer(knight, knight.getID(), knight.getName(), knight.getDamage(),
                        knight.getHealth(), knight.getMoney());
            }
            case 3 -> {
                printPlayer(archer, archer.getID(), archer.getName(), archer.getDamage(),
                        archer.getHealth(), archer.getMoney());
            }
        }
        System.out.println("------------------------------------------------------------------------------");
    }

    private void printPlayer(Player player, Integer id, String name, Integer damage, Integer health, Integer money) {
        System.out.println(player);
        this.ID = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.originalHealth = health;
        this.money = money;
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

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Integer getOriginalHealth() {
        return originalHealth;
    }

    public List<String> getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award.add(award);
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", name: " + name + ", damage: " + damage + ", health: " + health + ", money: " + money;
    }
}
