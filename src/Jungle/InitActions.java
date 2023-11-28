package Jungle;

import java.util.*;

import Jungle.animals.*;
import Jungle.envirement.*;
public class InitActions extends  Actions{
    public Map map;

    public InitActions(Map map) {
        this.map = map;
    }

    public HashMap<String, Integer> amountOfEntities() {
        HashMap<String, Integer> fieldMap = new HashMap<>();
        fieldMap.put("Deer", 3);
        fieldMap.put("WildBoar", 3);
        fieldMap.put("Wolfie", 2);
        fieldMap.put("Rabbit", 10);
        fieldMap.put("Rock", 6);
        fieldMap.put("Tree", 5);
        fieldMap.put("Grass", 7);
        fieldMap.put("Ground", 108);
        //36 ne zemli
        //144 vsego polei
        return fieldMap;
    }

    public Coordinates randomCoordinates() {
        Random random = new Random();
      //  RenderMap renderMap = new RenderMap();
    //    int x = random.nextInt(renderMap.getCellHeight());
    //    int y = random.nextInt(renderMap.getCellWidth());
        int x = random.nextInt(12)+1;
        int y = random.nextInt(12)+1;
        return new Coordinates(x, y);
    }

    public Map mapFilling() {
        HashMap<String, Integer> mapForFilling = amountOfEntities();
        for(var entity : mapForFilling.keySet()){
            for(int i =0; i < mapForFilling.get(entity); i++) {
                Coordinates coordinates  = randomCoordinates();
                if (map.getEntity(coordinates) == null) {
                    map.putEntity(coordinates, EntityFabric.fabric(entity, coordinates));
                } else {
                    i--;
                }
            }
        }
        return map;
    }
}