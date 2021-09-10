package fr.esgi.al2.planetrover.rover;

import org.junit.jupiter.api.Test;

import static fr.esgi.al2.planetrover.rover.PlanetRoverTest.positionFactory;
import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void goNorth() {
        assertEquals(PlanetRoverTest.positionFactory(3,2), PlanetRoverTest.positionFactory(3,1).goNorth(1));
    }

    @Test
    void goSouth() {
        assertEquals(PlanetRoverTest.positionFactory(3,2), PlanetRoverTest.positionFactory(3,3).goSouth(1));
    }

    @Test
    void goEast() {
        assertEquals(PlanetRoverTest.positionFactory(3,2), PlanetRoverTest.positionFactory(2,2).goEast(1));
    }

    @Test
    void goWest() {
        assertEquals(PlanetRoverTest.positionFactory(3,2), PlanetRoverTest.positionFactory(4,2).goWest(1));
    }
}