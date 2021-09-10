package fr.esgi.al2.planetrover.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrientationTest {

    @Test
    void left() {
        assertEquals(Orientation.West, Orientation.North.left());
    }

    @Test
    void right() {
        assertEquals(Orientation.West, Orientation.South.right());
    }
}