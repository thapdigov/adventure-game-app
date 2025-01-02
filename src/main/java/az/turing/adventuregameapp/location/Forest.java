package az.turing.adventuregameapp.location;

import az.turing.adventuregameapp.player.Player;
import az.turing.adventuregameapp.wolf.Vampir;

public class Forest extends DangerZone {
    public Forest(Player player) {
        super(player, "Forest", new Vampir(), "Wood");
    }
}
