package az.turing.adventuregameapp.player;

public class Knight extends Player{
    public Knight() {
        super(2, "Knight", 6, 21, 20);
    }

    @Override
    public String toString() {
        return "Knight -> "+super.toString();
    }
}
