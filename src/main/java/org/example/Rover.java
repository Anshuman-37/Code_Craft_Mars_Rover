package org.example;

import java.util.Arrays;
import java.util.List;

public class Rover {
    private String instruction;
    private String direction;

    public Rover(String direction, String instruction) {
        this.direction = direction;
        this.instruction = instruction;
    }

    public String getDirection() {
        return this.direction;
    }

    public String getInstruction() {
        return this.instruction;
    }

    public String executeInstructions() {
        List<String> directions = Arrays.asList("North","East","South","West");

        if( getInstruction().equals("R") ) {
            turn(directions.indexOf(getDirection()) + 1, directions, 0);
        }

        else if( getInstruction().equals("L") ){
            turn(directions.indexOf(getDirection()) - 1, directions, directions.size() - 1);
        }
        return getDirection();
    }

    private void turn(int directions, List<String> directions1, int index) {
        int rightIdx = directions;
        try{
            this.direction = directions1.get(rightIdx);
        }
        catch(Exception e){
            this.direction = directions1.get(index);
        }
    }
}
