package Jungle;

public abstract class Entity {
    public Coordinates coordinates;

    public Entity(Coordinates coordinates) {

        this.coordinates = coordinates;
    }


    public abstract Entity creation();
    protected abstract void disintegration();

}
