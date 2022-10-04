package org.example;

import java.util.Arrays;
import java.util.List;

public class Rover {
    private String instruction;
    private int x;
    private int y;
    private String direction;

    private String coordinates;

    public Rover(String direction, String instruction, int x,int y) {
        this.direction = direction;
        this.instruction = instruction;
        this.x = x;
        this.y = y;
    }

    public String getDirection() {
        return this.direction;
    }

    public String getInstruction() {
        return this.instruction;
    }

    public String getCordinates(){
        return this.coordinates;
    }

    public void executeInstructions() {
        List<String> directions = Arrays.asList("North","East","South","West");

        if( getInstruction().equals("R") ) {
            turn(directions.indexOf(getDirection()) + 1, directions, 0);
        }

        else if( getInstruction().equals("L") ){
            turn(directions.indexOf(getDirection()) - 1, directions, directions.size() - 1);
        }


        else if( getInstruction().equals("F") ){
            if(getDirection().equals("West"))
                this.x = this.x-1;
            else if(getDirection().equals("East"))
                this.x = this.x+1;
            else if(getDirection().equals("North"))
                this.y = this.y+1;
            else if(getDirection().equals("South"))
                this.y = this.y-1;
            this.coordinates = Integer.toString(this.x)+","+Integer.toString(this.y);
        }

        else if( getInstruction().equals("B") ){
            if(getDirection().equals("West"))
                this.x = this.x+1;
            else if(getDirection().equals("East"))
                this.x = this.x-1;
            else if(getDirection().equals("North"))
                this.y = this.y-1;
            else if(getDirection().equals("South"))
                this.y = this.y+1;
            this.coordinates = Integer.toString(this.x)+","+Integer.toString(this.y);
        }
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
