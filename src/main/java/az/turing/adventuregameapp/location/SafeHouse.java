package az.turing.adventuregameapp.location;

import az.turing.adventuregameapp.player.Player;

public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("---------------------------------------------------------------------");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        System.out.println("You are at SafeHouse,your health is full!");
        System.out.println("Your player: " + getPlayer());
        System.out.println("---------------------------------------------------------------------");
        return true;
    }
}
