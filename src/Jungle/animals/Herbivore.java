package Jungle.animals;

import Jungle.Map;
import Jungle.Coordinates;

public class Herbivore extends Creature{

    private int speed;
    private int healthPoints;


    public Herbivore(Coordinates coordinates) {

        super(coordinates);
    }


    void eat(){}
    void death(){}

    @Override
    void makeMove() {

    }

    void makeMove(Coordinates coordinates , Map map){
        for(int x=-1; x<2; x++){
            for(int y=-1; y<2; y++){
                // condition x>1, x<12; y>1, y<12
 //               if(map.get(coordinates)){}

            }
        }

    }

    @Override
    public Herbivore creation() {
        return null;
    }

    @Override
    public void disintegration() {

    }
}
