package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest{
    // Test case to check the movement of the rover
    @Test
    public void turnRightFromNorth(){
        Rover rover = new Rover("North","R", 0,0);
        rover.executeInstructions();
        assertEquals("East",rover.getDirection());
    }

    @Test
    public void turnRightFromEast(){
        Rover rover = new Rover("East", "R", 0,0);
        rover.executeInstructions();
        assertEquals("South",rover.getDirection());
    }

    @Test
    public void turnRightFromSouth(){
        Rover rover = new Rover("South", "R", 0,0);
        rover.executeInstructions();
        assertEquals("West",rover.getDirection());
    }

    @Test
    public void turnRightFromWest(){
        Rover rover = new Rover("West", "R", 0,0);
        rover.executeInstructions();
        assertEquals("North",rover.getDirection());
    }

    @Test
    public void turnLeftfromNorth(){
        Rover rover = new Rover("North","L", 0,0);
        rover.executeInstructions();
        assertEquals("West",rover.getDirection());
    }

    @Test
    public void turnLeftFromWest(){
        Rover rover = new Rover("West","L", 0,0);
        rover.executeInstructions();
        assertEquals("South",rover.getDirection());
    }

    @Test
    public void turnLeftFromSouth(){
        Rover rover = new Rover("South","L",0,0);
        rover.executeInstructions();
        assertEquals("East",rover.getDirection());
    }

    @Test
    public void turnLeftFromEast(){
        Rover rover = new Rover("East","L", 0,0);
        rover.executeInstructions();
        assertEquals("North",rover.getDirection());
    }

    @Test
    public void moveForwardFromEast() {
        Rover rover = new Rover("East", "F", 0,0);
        rover.executeInstructions();
        assertEquals("1,0",rover.getCordinates());
    }

    @Test
    public void moveForwardFromWest() {
        Rover rover = new Rover("West", "F", 0,0);
        rover.executeInstructions();
        assertEquals("-1,0",rover.getCordinates());
    }
    @Test
    public void moveForwardFromNorth() {
        Rover rover = new Rover("North", "F", 0,0);
        rover.executeInstructions();
        assertEquals("0,1",rover.getCordinates());
    }
    @Test
    public void moveForwardFromSouth() {
        Rover rover = new Rover("South", "F", 0,0);
        rover.executeInstructions();
        assertEquals("0,-1",rover.getCordinates());
    }

    @Test
    public void moveBackwardFromEast() {
        Rover rover = new Rover("East", "B", 0,0);
        rover.executeInstructions();
        assertEquals("-1,0",rover.getCordinates());
    }

    @Test
    public void moveBackwardFromWest() {
        Rover rover = new Rover("West", "B", 0,0);
        rover.executeInstructions();
        assertEquals("1,0",rover.getCordinates());
    }
    @Test
    public void moveBackwardFromNorth() {
        Rover rover = new Rover("North", "B", 0,0);
        rover.executeInstructions();
        assertEquals("0,-1",rover.getCordinates());
    }
    @Test
    public void moveBackwardFromSouth() {
        Rover rover = new Rover("South", "B", 0,0);
        rover.executeInstructions();
        assertEquals("0,1",rover.getCordinates());
    }

}
