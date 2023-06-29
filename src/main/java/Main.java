/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Scanner personNum = new Scanner(System.in); //this creates a scanner object
        Random random = new Random();
        int userGuess  = 0;
        int ranNum = random.nextInt(21); //this generates a random number until the limit of 20

        int tries = 0;
        int lastGuess = 0;

        System.out.println("Guess a number between 1-20:");


        while (userGuess != ranNum) {
            userGuess = personNum.nextInt(); //this reads the user input

            if (lastGuess==userGuess) {
                System.out.println("Duplicate guess!");
                continue; //this makes the counter not go up and resets the loop
            } else if (userGuess > 20 || userGuess < 1) {
                System.out.println("Your guess is out of bounds!");

            } else if (userGuess > ranNum) {
                System.out.println("Your guess is too high");

            } else if (userGuess < ranNum) {
                System.out.println("Your guess is too low");

            }
            tries++;
            lastGuess=userGuess;
        }

        if (userGuess == ranNum) {
            System.out.println("Correct Guess! You took " + tries + " tries");

        }

    }

}









