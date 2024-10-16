package happystring;

import java.util.*;
import java.io.*;
import java.security.SecureRandom;

public class Input {
    protected String[] input;
    protected int numA;
    protected int numB;
    protected int numC;
    protected int total;


    public Input(String input){
        this.input = input.split(", ");
        String[] inputA = this.input[0].split(" ");
        this.numA = Integer.parseInt(inputA[inputA.length - 1]);
        //System.out.printf("Number of As: %d\n",this.numA);

        String[] inputB= this.input[1].split(" ");
        this.numB = Integer.parseInt(inputB[inputA.length - 1]);
        //System.out.printf("Number of Bs: %d\n",this.numB);

        String[] inputC = this.input[2].split(" ");
        this.numC= Integer.parseInt(inputC[inputA.length - 1]);
        //System.out.printf("Number of Cs: %d\n",this.numC);
        this.total = numA + numB + numC;

        if (this.total > 101){
            System.exit(0);
        }
    }

    public String createString(){
        String res = "";
        int length = 0;
        int orginalA = this.numA;
        int orginalB = this.numB;
        int orginalC = this.numC;
        int occurA = 0;
        int occurB = 0;
        int occurC = 0;
        while(this.numA > 0 || this.numB > 0 || this.numC > 0 ){
             Random rand = new SecureRandom();

            int toGet= rand.nextInt(3);
            if(toGet == 0 && this.numA > 0 && occurA !=2){
                res += "a";
                //System.out.printf("A occurred %s times\n",occurA);
                //System.out.println("A is added");
                this.numA--;
                occurA++;
                occurB = 0;
                occurC = 0;
                length++;
            }
            else if(toGet == 1 && this.numB > 0 && occurB !=2){
                res += "b";
                //System.out.printf("B occurred %s times\n",occurA);
                //System.out.println("B is added");
                this.numB--;
                occurB++;
                occurA = 0;
                occurC = 0;
                length++;
            }
            else if(toGet == 2 && this.numC > 0 && occurC !=2){
                res += "c";
                //System.out.printf("C occurred %s times\n",occurA);
                //System.out.println("C is added");
                this.numC--;
                occurC++;
                occurA = 0;
                occurC = 0;
                length++;
            }else if ( length != this.total){
                res = ""; 
                this.numA = orginalA;
                this.numB = orginalB;
                this.numC = orginalC;
            }

        }
        return res;
    }

}
