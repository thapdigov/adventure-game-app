package az.turing.adventuregameapp.player;

public class Archer extends Player {
    public Archer() {
        super(3, "Archer", 4, 15, 20);
    }

    @Override
    public String toString() {
        return "Archer -> " + super.toString();
    }
}
