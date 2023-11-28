package Jungle;

import java.util.*;



public class Map {

 //   public int cellAmount = RenderMap.getCellAmount();
    public HashMap <Coordinates, Entity> map = new HashMap<>();

    public Entity getEntity(Coordinates coordinates) {
        return map.get(coordinates);
    }
    public void putEntity(Coordinates coordinates, Entity entity) {
         entity.coordinates = coordinates;
         map.put(coordinates, entity);
    }
}



