package fr.esgi.al2.planetrover.rover;

import fr.esgi.al2.planetrover.Name;

import java.util.Objects;

public class Rover {

    private final Name name;
    private Position position;
    private Orientation orientation;
    private static final int MOVE_LEN = 1;

    public Rover(Name name, Position position, Orientation orientation) {
        this.name = name;
        this.position = position;
        this.orientation = orientation;
    }

    public Rover() {
        this.position = new Position(0,0, 0);
        this.orientation = Orientation.North;
        this.name = new Name("My Rover");
    }

    public void moveForward (){
        switch (this.orientation) {
            case North -> this.position = this.position.goNorth(MOVE_LEN);
            case South -> this.position = this.position.goSouth(MOVE_LEN);
            case East -> this.position = this.position.goEast(MOVE_LEN);
            case West -> this.position = this.position.goWest(MOVE_LEN);
        }
    }
    public void moveBackWard (){
        switch (this.orientation) {
            case North -> this.position = this.position.goNorth(-MOVE_LEN);
            case South -> this.position = this.position.goSouth(-MOVE_LEN);
            case East -> this.position = this.position.goEast(-MOVE_LEN);
            case West -> this.position = this.position.goWest(-MOVE_LEN);
        }
    }

    public void rotateLeft(){
        this.orientation = this.orientation.left();
    }

    public void rotateRight(){
        this.orientation = this.orientation.right();
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return Objects.equals(name, rover.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, orientation);
    }
}
