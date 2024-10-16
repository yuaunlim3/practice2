package balls;


import java.util.*;
import java.io.*;


public class Input {
    protected int numBalls;
    protected String[] input;


    public Input(String input){
        this.input = input.split("");
        this.numBalls = input.length();
    }

    public int getNumBalls() {
        return this.numBalls;
    }

    public void getRightWhite(){
        int pos = 0;
        for(int idx = 0; idx< this.numBalls; idx++){
            String ball = this.input[idx];
            if (Constants.WHITE.equals(ball)){
                pos = idx;
            }
        }

        System.out.printf("The final white ball is in %d position\n",pos);
    }

    public void getRightBlack(){
        int pos = 0;
        for(int idx = this.numBalls - 1; idx >= 0; idx--){
            String ball = this.input[idx];
            if (Constants.BLACK.equals(ball)){
                pos = idx;
            }
        }

        System.out.printf("The first black ball is in %d position\n",pos);
    }

    public int swapBall(){
        int posBlack = 0;
        boolean blackExist = false;
        for(int idx = this.numBalls - 1; idx >= 0; idx--){
            String ball = this.input[idx];
            if (Constants.BLACK.equals(ball)){
                posBlack = idx;
                blackExist = true;
            }
        }

        int posWhite = 0;
        boolean whiteExist = false;
        for(int idx = 0; idx< this.numBalls; idx++){
            String ball = this.input[idx];
            if (Constants.WHITE.equals(ball)){
                posWhite = idx;
                whiteExist = true;
            }
        }
        
        //System.out.printf("White position: %d  Black position: %d Steps take: %d\n",posWhite,posBlack,posWhite - posBlack);
        int steps = posWhite - posBlack;
        if (posBlack < posWhite && whiteExist && blackExist){
            this.input[posBlack] = "0";
            this.input[posWhite] = "1";
            //System.out.println("Balls swap");
        }
        return steps;
    }

    public void showBall(){
        for(String ball: this.input){
            System.out.print(ball);
        }
        System.out.println("");
    }

    public boolean isDone(){
        int posBlack = 0;
        boolean blackExist = false;
        for(int idx = this.numBalls - 1; idx >= 0; idx--){
            String ball = this.input[idx];
            if (Constants.BLACK.equals(ball)){
                posBlack = idx;
                blackExist = true;
            }
        }

        int posWhite = 0;
        boolean whiteExist = false;
        for(int idx = 0; idx< this.numBalls; idx++){
            String ball = this.input[idx];
            if (Constants.WHITE.equals(ball)){
                posWhite = idx;
                whiteExist = true;
            }
        }
        if (posBlack < posWhite && whiteExist && blackExist){
            return false;
        }
        return true;
    }



}
