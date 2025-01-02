package az.turing.adventuregameapp.location;

import az.turing.adventuregameapp.player.Player;
import az.turing.adventuregameapp.wolf.Zombie;

public class Cave extends DangerZone {
    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "Food");
    }
}
