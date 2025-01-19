package az.turing.adventuregameapp.player;

public class Samurai extends Player{
    public Samurai() {
        super(1, "Samurai", 5, 21, 25);
    }

    @Override
    public String toString() {
        return "Samurai -> "+super.toString();
    }
}
