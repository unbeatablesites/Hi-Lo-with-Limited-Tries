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

        System.out.print("First guess: ");
        int userInput = scan.nextInt();
        int randomGuess = 1 ;
        int tries = 7 - 1;
        int numberOfGuesses = 0;
        int numberOfGuessesTally = 2;


        if( userInput == randomGuess ){
            System.out.println("You guessed it!  What are the odds?!?");
        }else{
            if(userInput > randomGuess){
                System.out.println("Sorry, that guess is too high.");
            }
            else {
                System.out.println("Sorry, that guess is too low.");
            }
        }

        while (tries != 0 && userInput != randomGuess){
            System.out.print("Guess # "+numberOfGuessesTally+": " );
            tries--;
            userInput = scan.nextInt();

            if(tries == 0){
                System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
            }else if(userInput > randomGuess){
                System.out.println("Sorry, that guess is too high.");
            }else{
                System.out.println("Sorry, that guess is too low.");
            }


            numberOfGuessesTally++;
            numberOfGuesses++;

        }

        System.out.println("System.out.println(\"You guessed it!  What are the odds?!?\");");
    }

}
