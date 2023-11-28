package Jungle.animals;
import Jungle.Coordinates;
import Jungle.Entity;
public abstract class Creature extends Entity{

    private int speed;
    private int healthPoints;

    boolean alive;

    public Creature(Coordinates coordinates) {

        super(coordinates);
    }

    abstract void eat();
    abstract void death();
    abstract void makeMove();
    public abstract Entity creation();
    public abstract void disintegration();



}
