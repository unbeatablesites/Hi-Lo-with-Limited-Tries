import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        logic();

    }

    static void logic(){

        System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("First guess:");
        int userInput = scan.nextInt();
        int randomGuess = 1 ;
        int tries = 7;

        if( userInput == randomGuess ){
            System.out.println("You guessed it!  What are the odds?!?");
        }

        while (tries != 0 && userInput != randomGuess){


            userInput = scan.nextInt();
            tries--;

        }
    }

}
