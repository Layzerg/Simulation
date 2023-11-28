package Jungle;

import Jungle.animals.*;
import Jungle.envirement.*;
public  class EntityFabric {
    public static Entity fabric(String entity, Coordinates coordinates) {
        switch (entity){
            case "Deer":
                return new Deer(coordinates);
      //      break;
            case "Rabbit":
                return new Rabbit(coordinates);
      //      break;
            case "Wolfie":
                return new Wolfie(coordinates);
      //      break;
            case "WildBoar":
                return new WildBoar(coordinates);
      //      break;
            case "Grass":
                return new Grass(coordinates);
     //       break;
            case "Rock":
                return new Rock(coordinates);
      //      break;
            case "Tree":
                return new Tree(coordinates);
     //       break;
        default:  return new Ground(coordinates);
     //       break;
    }
}



}
