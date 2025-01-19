package az.turing.adventuregameapp.location;

import az.turing.adventuregameapp.player.Player;
import az.turing.adventuregameapp.util.InputUtil;
import az.turing.adventuregameapp.wolf.Wolf;

import java.util.Random;
import java.util.stream.Stream;

public abstract class DangerZone extends Location {
    private String award;
    private Wolf wolf;

    public DangerZone(Player player, String name, Wolf wolf, String award) {
        super(player, name);
        this.wolf = wolf;
        this.award = award;
    }

    @Override
    public boolean onLocation() {
        for (String s : getPlayer().getAward()) {
            if ((s.equals("Food") && this instanceof Cave)
                    || (s.equals("Water") && this instanceof River)
                    || (s.equals("Wood") && this instanceof Forest)) {
                System.out.println("You have already fought in this zone!");
                return true;
            }
        }
        Random random = new Random();
        int wolfCount = random.nextInt(3) + 1;
        System.out.println("---------------------------------------------------");
        System.out.printf("This is a %s, Be Careful! There is %d %s here!\n", getName(), wolfCount, wolf.getName());
        System.out.printf("Monster -> name: %s ,damage: %s ,health: %s \n", wolf.getName(), wolf.getDamage(), wolf.getHealth());
        System.out.println("---------------------------------------------------");
        for (int i = 1; i <= wolfCount; i++) {
            this.getWolf().setHealth(this.getWolf().getOriginalHealth());
            System.out.println("-------------");
            System.out.printf("%d -> monster!\n", i);
            System.out.println("-------------");
            Integer choice = InputUtil.getInteger("""
                    1.Fight
                    2.Come back to area
                    """);
            switch (choice) {
                case 1:
                    if (!(getPlayer().getArmor().equals("Nothing"))) {
                        wolf.setDamage(wolf.getDamage() - getPlayer().getArmor().getBlocke());
                    }
                    while (getPlayer().getHealth() > 0 && wolf.getHealth() > 0) {
                        boolean fit = new Random().nextBoolean();
                        System.out.println("--------------------------------------");
                        if (fit) {
                            if (getPlayer().getHealth() > 0) {
                                wolf.setHealth(wolf.getHealth() - getPlayer().getDamage());
                                System.out.printf("You hit the monster,monster health: %d \n", wolf.getHealth());
                            }
                            getPlayer().setHealth(getPlayer().getHealth() - wolf.getDamage());
                            System.out.printf("The Monster hit you,your health: %d \n", getPlayer().getHealth());
                        } else {
                            if (getWolf().getHealth() > 0) {
                                getPlayer().setHealth(getPlayer().getHealth() - wolf.getDamage());
                                System.out.printf("The Monster hit you,your health: %d \n", getPlayer().getHealth());
                            }
                            wolf.setHealth(wolf.getHealth() - getPlayer().getDamage());
                            System.out.printf("You hit the monster,monster health: %d \n", wolf.getHealth());
                        }
                        System.out.println("--------------------------------------");
                        if (wolf.getHealth() <= 0) {
                            System.out.printf("You killed the monster and won %s gold!\n", wolf.getGold());
                            getPlayer().setMoney(getPlayer().getMoney() + wolf.getGold());
                        }
                        if (getPlayer().getHealth() <= 0) {
                            System.err.println("YOU ARE DEAD,GAME OVER!");
                            return false;
                        }
                    }
                    break;
                case 2:
                    return true;
            }
        }
        System.out.printf("Congratulations! You cleared all of monster! Your award: %s\n", getAward());
        getPlayer().setAward(getAward());
        if (Stream.of("Wood", "Food", "Water").allMatch(getPlayer().getAward()::contains)) {
            System.err.println("YOU HAVE KILLED ALL THE MONSTERS IN THE AREA AND YOU WON THE GAME!!!");
            return false;
        }
        return true;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Wolf getWolf() {
        return wolf;
    }

    public void setWolf(Wolf wolf) {
        this.wolf = wolf;
    }
}
