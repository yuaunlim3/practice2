package balls;

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        Console cons = System.console();
        String input = cons.readLine(">>> ");
        Input inputString = new Input(input);
        int steps = 0;
        //int times = 1;
        while(!inputString.isDone()){
            //System.out.println(times);
            //inputString.getRightWhite();
            //inputString.getRightBlack();

            steps +=inputString.swapBall();

            inputString.showBall();


            //inputString.getRightWhite();
            //inputString.getRightBlack();
            //times++;
        }

        System.out.printf("Total steps take: %d",steps);





    }
}