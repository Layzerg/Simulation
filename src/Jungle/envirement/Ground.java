package Jungle.envirement;

import Jungle.Coordinates;

public class Ground extends Jungle.Entity{


    public Ground(Coordinates coordinates) {

        super(coordinates);
    }

    public Grass creation(){
        return null;
    }

    @Override
    protected void disintegration() {

    }


}

