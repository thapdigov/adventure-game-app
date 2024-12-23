package az.turing.adventuregameapp.location;

import az.turing.adventuregameapp.player.Player;

public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are at SafeHouse!");
        System.out.println("Your health is full!");
        return true;
    }
}
