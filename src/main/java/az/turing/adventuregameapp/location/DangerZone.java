package az.turing.adventuregameapp.location;

import az.turing.adventuregameapp.player.Player;
import az.turing.adventuregameapp.util.InputUtil;
import az.turing.adventuregameapp.wolf.Wolf;

import java.util.Random;

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
        Random random = new Random();
        int wolfCount = random.nextInt(3) + 1;
        System.out.println("---------------------------------------------------");
        System.out.printf("This is a %s, Be Careful! There is %d %s here!\n", getName(), wolfCount, wolf.getName());
        System.out.printf("Monster -> name: %s ,damage: %s ,health: %s \n", wolf.getName(), wolf.getDamage(), wolf.getHealth());
        System.out.println("---------------------------------------------------");
        for (int i = 1; i <= wolfCount; i++) {
            System.out.println("-------------");
            System.out.printf("%d -> monster!\n", i);
            System.out.println("-------------");
            Integer choice = InputUtil.getInteger("""
                    1.Fight
                    2.Come back to area
                    """);
            switch (choice) {
                case 1:
                    while (getPlayer().getHealth() > 0 && wolf.getHealth() > 0) {
                        if (getPlayer().getHealth() < wolf.getHealth()) {
                            System.out.println("---------------------------------");
                            System.out.println("Your health is less than monster!");
                            break;
                        }
                        System.out.println("--------------------------------------");
                        wolf.setHealth(wolf.getHealth() - getPlayer().getDamage());
                        System.out.printf("You hit the monster,monster health: %d \n", wolf.getHealth());
                        if (wolf.getHealth() > 0) {
                            getPlayer().setHealth(getPlayer().getHealth() - wolf.getDamage());
                            System.out.printf("The Monster hit you,your health: %d \n", getPlayer().getHealth());

                            System.out.println("--------------------------------------");
                            if (getPlayer().getHealth() < 0) {
                                getPlayer().setHealth(0);
                            }
                        }
                        if (wolf.getHealth() <= 0) {
                            System.out.printf("You killed the monster and won %s gold!\n", wolf.getGold());
                            getPlayer().setMoney(getPlayer().getMoney() + wolf.getGold());
                        }
                        if (getPlayer().getHealth() <= 0) {
                            System.out.println("You are dead,Game Over!");
                        }
                    }
                    break;
                case 2:
                    return true;
            }
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
