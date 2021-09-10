package fr.esgi.al2.planetrover.rover;

import fr.esgi.al2.planetrover.Name;
import org.junit.jupiter.api.Test;

import static fr.esgi.al2.planetrover.rover.PlanetRoverTest.positionFactory;
import static fr.esgi.al2.planetrover.rover.PlanetRoverTest.roverFactory;
import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    Rover testRover = roverFactory(positionFactory(2,3));

    @Test
    void should_be_the_same_rover(){
        assertEquals(
                new Rover(
                        new Name("generatedRover"),
                        PlanetRoverTest.positionFactory(3,3),
                        Orientation.South),
                this.testRover);
    }

    @Test
    void should_move_forward_rover_to_north(){
        this.testRover.moveForward();
        assertEquals(PlanetRoverTest.positionFactory(2, 4), this.testRover.getPosition());
    }

    @Test
    void should_move_forward_rover_to_south(){
        testRover.setOrientation(Orientation.South);
        this.testRover.moveForward();
        assertEquals(PlanetRoverTest.positionFactory(2,2), this.testRover.getPosition());
    }

    @Test
    void should_move_forward_rover_to_east(){
        testRover.setOrientation(Orientation.East);
        this.testRover.moveForward();
        assertEquals(PlanetRoverTest.positionFactory(3,3), this.testRover.getPosition());
    }

    @Test
    void should_move_forward_rover_to_west(){
        testRover.setOrientation(Orientation.West);
        this.testRover.moveForward();
        assertEquals(PlanetRoverTest.positionFactory(1,3), this.testRover.getPosition());
    }

    @Test
    void should_move_backward_rover_from_north(){
        this.testRover.moveBackWard();
        assertEquals(PlanetRoverTest.positionFactory(2,2), this.testRover.getPosition());
    }

    @Test
    void should_move_backward_rover_from_south(){
        this.testRover.setOrientation(Orientation.South);
        this.testRover.moveBackWard();
        assertEquals(PlanetRoverTest.positionFactory(2,4), this.testRover.getPosition());
    }

    @Test
    void should_move_backward_rover_from_east(){
        this.testRover.setOrientation(Orientation.East);
        this.testRover.moveBackWard();
        assertEquals(PlanetRoverTest.positionFactory(1,3), this.testRover.getPosition());
    }

    @Test
    void should_move_backward_rover_from_west(){
        this.testRover.setOrientation(Orientation.West);
        this.testRover.moveBackWard();
        assertEquals(PlanetRoverTest.positionFactory(3,3), this.testRover.getPosition());
    }

    @Test
    void should_rotate_rover_to_left_from_north(){
        this.testRover.rotateLeft();
        assertEquals(Orientation.West, testRover.getOrientation());
    }

    @Test
    void should_rotate_rover_to_left_from_south(){
        this.testRover.setOrientation(Orientation.South);
        this.testRover.rotateLeft();
        assertEquals(Orientation.East, testRover.getOrientation());
    }

    @Test
    void should_rotate_rover_to_left_from_east(){
        this.testRover.setOrientation(Orientation.East);
        this.testRover.rotateLeft();
        assertEquals(Orientation.North, testRover.getOrientation());
    }

    @Test
    void should_rotate_rover_to_left_from_west(){
        this.testRover.setOrientation(Orientation.West);
        this.testRover.rotateLeft();
        assertEquals(Orientation.South, testRover.getOrientation());
    }

    @Test
    void should_rotate_rover_to_right_from_north(){
        this.testRover.rotateRight();
        assertEquals(Orientation.East, testRover.getOrientation());
    }

    @Test
    void should_rotate_rover_to_right_from_south(){
        this.testRover.setOrientation(Orientation.South);
        this.testRover.rotateRight();
        assertEquals(Orientation.West, testRover.getOrientation());
    }

    @Test
    void should_rotate_rover_to_right_from_east(){
        this.testRover.setOrientation(Orientation.East);
        this.testRover.rotateRight();
        assertEquals(Orientation.South, testRover.getOrientation());
    }

    @Test
    void should_rotate_rover_to_right_from_west(){
        this.testRover.setOrientation(Orientation.West);
        this.testRover.rotateRight();
        assertEquals(Orientation.North, testRover.getOrientation());
    }

    @Test
    void should_rotate_left_and_move_forward(){
        this.testRover.rotateLeft();
        this.testRover.moveForward();
        assertEquals(PlanetRoverTest.positionFactory(1,3), this.testRover.getPosition());
    }

}