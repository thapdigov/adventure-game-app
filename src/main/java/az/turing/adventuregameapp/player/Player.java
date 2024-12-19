package az.turing.adventuregameapp.player;

import java.util.Scanner;

public class Player {

    private Integer ID;
    private String name;
    private Integer damage;
    private Integer health;
    private Integer money;

    public Player() {
    }

    public Player(Integer ID, String name, Integer damage, Integer health, Integer money) {
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }


    public void selectChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Choose the Player!\n");
        System.out.println(new Samurai());
        System.out.println(new Knight());
        System.out.println(new Archer());
        System.out.println("Enter the playerId:");
        int playerId = scanner.nextInt();
        switch (playerId) {
            case 1 -> System.out.println("Your Player: " + new Samurai());
            case 2 -> System.out.println("Your Player: " + new Knight());
            case 3 -> System.out.println("Your Player: " + new Archer());
            default -> System.out.println("Invalid input!");
        }
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

    @Override
    public String toString() {
        return "ID: " + ID + ", name: " + name + ", damage: " + damage + ", health: " + health + ", money: " + money;
    }
}
