package fr.esgi.al2.planetrover.rover;

import java.util.Objects;

public class Position {
    final int x;
    final int y;
    final int z;

    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Position goNorth(int value){
        return new Position(this.x, this.y+value, z);
    }
    Position goSouth(int value) {return new Position(this.x, this.y-value, z);}
    Position goEast(int value){
        return new Position(this.x+value, this.y, z);
    }
    Position goWest(int value){
        return new Position(this.x-value, this.y, z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y && z == position.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
