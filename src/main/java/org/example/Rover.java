package org.example;

import java.util.ArrayList;
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
            int rightIdx = directions.indexOf(getDirection())+1;
            try{
                this.direction = directions.get(rightIdx);
            }
            catch(Exception e){
                this.direction = directions.get(0);
            }
        }

        else if( getInstruction().equals("L") ){
            int leftIdx = directions.indexOf(getDirection())-1;
            try{
                this.direction = directions.get(leftIdx);
            }
            catch(Exception e){
                this.direction = directions.get(directions.size()-1);
            }
        }
        return getDirection();
    }
}
