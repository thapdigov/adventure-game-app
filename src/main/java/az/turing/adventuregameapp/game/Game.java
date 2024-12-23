package az.turing.adventuregameapp.game;

import az.turing.adventuregameapp.location.Location;
import az.turing.adventuregameapp.location.SafeHouse;
import az.turing.adventuregameapp.location.ToolStore;
import az.turing.adventuregameapp.player.Player;
import az.turing.adventuregameapp.util.InputUtil;

public class Game {
    public void start() {
        System.out.println("\n\t\t\t\tWelcome the AdventureGame!\n");
        String name = InputUtil.getString("Enter the name");
        System.out.printf("Hello %s,Everything you see here is real!\n", name);
        Player player = new Player();
        player.selectCharacter();
        Location location = null;
        boolean flag = true;
        while (flag) {
            Integer selectLoc = InputUtil.getInteger("""
                    \t\t####Locations####
                    Choose where you want to go
                    1.SafeHouse
                    2.ToolStore
                    """);
            switch (selectLoc) {
                case 1 -> location = new SafeHouse(player);
                case 2 -> location = new ToolStore(player);
                default -> System.out.println("Invalid input!");
            }
            if (location != null && !location.onLocation()) {
                flag = false;
            }
        }
    }
}
