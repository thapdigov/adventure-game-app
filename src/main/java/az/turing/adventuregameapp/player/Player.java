package az.turing.adventuregameapp.player;

import az.turing.adventuregameapp.inventory.Armor;
import az.turing.adventuregameapp.inventory.Weapon;
import az.turing.adventuregameapp.util.InputUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private Integer ID;
    private String name;
    private Integer damage;
    private Integer health;
    private Integer originalHealth;
    private Integer money;
    private Weapon weapon = new Weapon("Fist", 0, 0, 0);
    private Armor armor = new Armor(0, "Nothing", 0, 0);
    private List<String> award = new ArrayList<>();

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t########PLAYERS########");
        System.out.println("-------------------------------------------------------------------");
        System.out.println(new Samurai());
        System.out.println(new Knight());
        System.out.println(new Archer());
        System.out.println("-------------------------------------------------------------------");
        int playerId = InputUtil.getInteger("Choose the Player,Enter the playerId:");
        System.out.println("------------------------------------------------------------------------------");
        while (playerId < 1 || playerId > 3) {
            playerId = InputUtil.getInteger("Invalid input,Enter the playerId between 1 and 3!");
        }
        System.out.println("------------------------------------------------------------------------------");
        switch (playerId) {
            case 1 -> {
                System.out.println("Your Player: " + new Samurai());
                this.ID = new Samurai().getID();
                this.name = new Samurai().getName();
                this.damage = new Samurai().getDamage();
                this.health = new Samurai().getHealth();
                this.originalHealth = new Samurai().getHealth();
                this.money = new Samurai().getMoney();
            }
            case 2 -> {
                System.out.println("Your Player: " + new Knight());
                this.ID = new Knight().getID();
                this.name = new Knight().getName();
                this.damage = new Knight().getDamage();
                this.health = new Knight().getHealth();
                this.originalHealth = new Knight().getHealth();
                this.money = new Knight().getMoney();
            }
            case 3 -> {
                System.out.println("Your Player: " + new Archer());
                this.ID = new Archer().getID();
                this.name = new Archer().getName();
                this.damage = new Archer().getDamage();
                this.health = new Archer().getHealth();
                this.originalHealth = new Archer().getHealth();
                this.money = new Archer().getMoney();
            }
        }
        System.out.println("------------------------------------------------------------------------------");
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
