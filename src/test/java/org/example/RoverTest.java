package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest{
    // Test case to check the movement of the rover
    @Test
    public void turnRightFromNorth(){
        Rover rover = new Rover("North","R");
        assertEquals("East",rover.executeInstructions());
    }

    @Test
    public void turnRightFromEast(){
        Rover rover = new Rover("East", "R");
        assertEquals("South",rover.executeInstructions());
    }

    @Test
    public void turnRightFromSouth(){
        Rover rover = new Rover("South", "R");
        assertEquals("West",rover.executeInstructions());
    }

    @Test
    public void turnRightFromWest(){
        Rover rover = new Rover("West", "R");
        assertEquals("North",rover.executeInstructions());
    }

    @Test
    public void turnLeftfromNorth(){
        Rover rover = new Rover("North","L");
        assertEquals("West",rover.executeInstructions());
    }

    @Test
    public void turnLeftFromWest(){
        Rover rover = new Rover("West","L");
        assertEquals("South",rover.executeInstructions());
    }

    @Test
    public void turnLeftFromSouth(){
        Rover rover = new Rover("South","L");
        assertEquals("East",rover.executeInstructions());
    }

    @Test
    public void turnLeftFromEast(){
        Rover rover = new Rover("East","L");
        assertEquals("North",rover.executeInstructions());
    }
}
