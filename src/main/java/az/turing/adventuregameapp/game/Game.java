package az.turing.adventuregameapp.game;

import az.turing.adventuregameapp.player.Player;

public class Game {
    public void start() {
        System.out.println("\n\t\t\t\tWelcome the AdventureGame!\n");
        Player player = new Player();
        player.selectChar();
    }
}
