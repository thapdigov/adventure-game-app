package az.turing.adventuregameapp.player;

import az.turing.adventuregameapp.inventory.Armor;
import az.turing.adventuregameapp.inventory.Weapon;
import az.turing.adventuregameapp.util.InputUtil;

import java.util.Scanner;

public class Player {
    private Integer ID;
    private String name;
    private Integer damage;
    private Integer health;
    private Integer money;
    private Weapon weapon = new Weapon("Fist", 0, 0, 0);
    private Armor armor = new Armor(0, "Nothing", 0, 0);

    public Player() {
    }

    public Player(Integer ID, String name, Integer damage, Integer health, Integer money) {
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.health = health;
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
                this.ID = 1;
                this.name = "Samurai";
                this.damage = 5;
                this.health = 20;
                this.money = 25;
            }
            case 2 -> {
                System.out.println("Your Player: " + new Knight());
                this.ID = 2;
                this.name = "Knight";
                this.damage = 8;
                this.health = 24;
                this.money = 25;
            }
            case 3 -> {
                System.out.println("Your Player: " + new Archer());
                this.ID = 3;
                this.name = "Archer";
                this.damage = 7;
                this.health = 18;
                this.money = 25;
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

    @Override
    public String toString() {
        return "ID: " + ID + ", name: " + name + ", damage: " + damage + ", health: " + health + ", money: " + money;
    }
}
