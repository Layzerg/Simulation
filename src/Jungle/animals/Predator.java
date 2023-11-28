package Jungle.animals;

import Jungle.Coordinates;
import Jungle.Entity;

public class Predator extends Creature{

    private  int speed;
    private int healthPoints;

    public Predator(Coordinates coordinates) {

        super(coordinates);
    }

    void eat(){}
    void death(){}
    void makeMove(){}



    @Override
    public Predator creation() {
        return null;
    }

    @Override
    public void disintegration() {

    }

}
