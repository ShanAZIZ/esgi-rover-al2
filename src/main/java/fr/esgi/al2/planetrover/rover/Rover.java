package fr.esgi.al2.planetrover.rover;

public class Rover {

    private Name name;
    private Position position;
    private Orientation orientation;

    public Rover(Name name, Position position, Orientation orientation) {
        this.name = name;
        this.position = position;
        this.orientation = orientation;
    }

    public Rover() {
        this.position = new Position(0,0);
        this.orientation = Orientation.North;
        this.name = new Name("My Rover");
    }

    public void avancer (){
        switch (orientation) {
            case North -> this.position.goNorth();
            case South -> this.position.goSouth();
            case East -> this.position.goEast();
            case West -> this.position.goWest();
        }
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
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
}
