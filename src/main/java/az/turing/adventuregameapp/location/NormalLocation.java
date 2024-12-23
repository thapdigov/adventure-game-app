package az.turing.adventuregameapp.location;

import az.turing.adventuregameapp.player.Player;

public abstract class NormalLocation extends Location {

    public NormalLocation(Player player, String name) {
        super(player, name);
    }
}
