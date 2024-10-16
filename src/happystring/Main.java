package happystring;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console cons = System.console();
        String input = cons.readLine(">>> ");
        Input inputString = new Input(input);

        String res = inputString.createString();

        System.out.println(res);
    }
}
