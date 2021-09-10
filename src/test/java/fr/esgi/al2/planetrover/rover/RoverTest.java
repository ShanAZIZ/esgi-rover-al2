package fr.esgi.al2.planetrover.rover;

import fr.esgi.al2.planetrover.Name;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    Rover testRover = new Rover(
            new Name("monRover"),
            new Position(2,3),
            Orientation.North
    );

    @Test
    void should_be_the_same_rover(){
        assertEquals(
                new Rover(
                        new Name("monRover"),
                        new Position(3,3),
                        Orientation.South),
                this.testRover);
    }

    @Test
    void should_move_rover(){
        this.testRover.move();
        assertEquals(new Position(2,4), this.testRover.getPosition());
    }

    @Test
    void should_rotate_rover_to_left(){
        this.testRover.rotateLeft();
        assertEquals(Orientation.West, testRover.getOrientation());
    }

    @Test
    void should_rotate_rover_to_right(){
        this.testRover.rotateRight();
        assertEquals(Orientation.East, testRover.getOrientation());
    }

    @Test
    void should_rotate_left_and_move(){
        this.testRover.rotateLeft();
        this.testRover.move();
        assertEquals(new Position(1,3), this.testRover.getPosition());
    }


}