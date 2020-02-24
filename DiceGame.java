import java.util.Random; 
import java.util.Scanner;

/**
 * This program is the "Dice Game".
 * 
 * @author Amin Zeina
 * @version 1.0
 * @since 2020-02-24
 */

public class DiceGame {
  
  /**
  * This class generates a random number from a given range, then has the user play a guessing
  * game.
  */
  
  public static void main(String[] args) throws Exception {
    
    // Create variables
    int maxRange;
    int userGuess;
    int randomNumber;
    int guessCounter = 1;
    
    // Create scanner and Random object
    Scanner userInput = new Scanner(System.in);
    Random random = new Random();
    
    // Ask user for max range
    System.out.print("Welcome to Dice Game! Enter a number to be used as the max range for "
        + "the randomizer: ");
        
    try {
      // Get max range and random number.
      maxRange = userInput.nextInt();
      randomNumber = random.nextInt(maxRange) + 1;
    
      // For testing, show random number
      System.out.println("TESTING - Random Number = " + randomNumber);
      
      // Ask user for first guess
      System.out.print("Please enter your first guessed number from 1 to "
          + maxRange + ": ");
        
      try {
        // Get user's guess
        userGuess = userInput.nextInt();
        
        while (userGuess != randomNumber) {
          guessCounter++;
          System.out.print("Incorrect. Please guess again: ");
          userGuess = userInput.nextInt();
        }
        System.out.print("Congrats! The random number was " + randomNumber + ". It took you " 
            + guessCounter + " guesses.");
        
      } catch (Exception e) {
        // Guess was not int
        System.err.println("Invalid Input. Your guess must be an integer.");
      }
      
    } catch (Exception e) {
      // Range was invalid
      System.err.println("Invalid Input. Max range must be a positve integer.");
    }
  }
}