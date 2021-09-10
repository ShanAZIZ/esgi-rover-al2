package fr.esgi.al2.planetrover.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @Test
    void should_be_the_same_rover(){
        Rover testRover = new Rover(
                new Name("monRover"),
                new Position(2,3),
                Orientation.North
        );
        assertEquals(
                new Rover(
                        new Name("monRover"),
                        new Position(2,3),
                        Orientation.North),
                testRover);
    }


}