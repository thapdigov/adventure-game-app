package az.turing.adventuregameapp.location;

import az.turing.adventuregameapp.player.Player;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "ToolStore");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are at ToolStore!");
        return true;
    }
}
