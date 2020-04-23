import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        logic();

    }

    static void logic(){

        System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.\n");

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int userInput = scan.nextInt();
        int randomGuess = 1 + rand.nextInt(100);
        int tries = 7;

        while (tries != 0 || userInput != randomGuess){



        }
    }

}
