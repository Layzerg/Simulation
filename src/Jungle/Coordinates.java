package Jungle;

import java.util.Objects;

public class Coordinates {
 //   HashMap<Integer, Integer> coorditnates = new HashMap<Integer, Integer>();
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinates that)) return false;
        return getX() == that.getX() && getY() == that.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
