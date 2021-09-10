package fr.esgi.al2.planetrover.rover;

import java.util.Objects;

public class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position goNorth(){
        return new Position(this.x, this.y++);
    }
    public Position goSouth(){
        return new Position(this.x, this.y--);
    }
    public Position goEast(){
        return new Position(this.x++, this.y);
    }
    public Position goWest(){
        return new Position(this.x--, this.y++);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }
}
