package az.turing.adventuregameapp.game;

import az.turing.adventuregameapp.location.Location;
import az.turing.adventuregameapp.location.SafeHouse;
import az.turing.adventuregameapp.location.ToolStore;
import az.turing.adventuregameapp.player.Player;
import az.turing.adventuregameapp.util.InputUtil;

public class Game {
    public void start() {
        System.out.println("\n\t\t\t\tWelcome the AdventureGame!\n");
        String name = InputUtil.getString("Enter the name:");
        System.out.println("--------------------------------------------");
        System.out.printf("Hello %s,Everything is real you see here!\n", name);
        System.out.println("--------------------------------------------");
        Player player = new Player();
        player.selectCharacter();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("You've chosen a player, now choose the address you want to go to!");
        System.out.println("-----------------------------------------------------------------");
        Location location = null;
        System.out.println("\t\t########LOCATIONS########");
        boolean flag = true;
        while (flag) {
            Integer selectLoc = InputUtil.getInteger("""
                    
                    Enter the  location number!
                    -----------
                    1.SafeHouse
                    2.ToolStore
                    -----------
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
