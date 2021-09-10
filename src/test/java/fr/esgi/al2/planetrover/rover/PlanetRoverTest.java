package fr.esgi.al2.planetrover.rover;

import fr.esgi.al2.planetrover.Name;

public class PlanetRoverTest {
    static Position positionFactory(int x, int y){
        return new Position(x, y, 0);
    }

    static Position positionFactory(int x, int y, int z){
        return new Position(x, y, z);
    }

    static Rover roverFactory(Position position){
        return new Rover(
                new Name("generatedRover"),
                position,
                Orientation.North
        );
    }
}
