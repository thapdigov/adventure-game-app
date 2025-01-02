package az.turing.adventuregameapp.location;

import az.turing.adventuregameapp.player.Player;
import az.turing.adventuregameapp.wolf.Bear;

public class River extends DangerZone {
    public River(Player player) {
        super(player, "River", new Bear(), "Water");
    }
}
