package fr.esgi.al2.planetrover.rover;

public enum Orientation {
    North,
    South,
    East,
    West;

    public Orientation left(){
        return switch (this) {
            case North -> West;
            case South -> East;
            case East -> North;
            default -> South;
        };
    }

    public Orientation right(){
        return switch (this) {
            case North -> East;
            case South -> West;
            case East -> South;
            default -> North;
        };
    }
}
