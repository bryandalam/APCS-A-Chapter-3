
// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
          int numOfGuesses = 1;
          int numOfHigh = 0;
          int numOfLow = 0;
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(10) + 1;
 
          //print message asking user to enter a guess
          System.out.println("Please guess an integer from 1 to 10");
          guess = scan.nextInt();
 
          //read in guess
                    
          while (guess != numToGuess  )  //keep going as long as the guess is wrong
            {
                  //print message saying guess is wrong
                  if (guess > numToGuess) {
                      System.out.println("Your guess was too high. Guess again.");
                      numOfHigh++;
                    }
                  if (guess < numToGuess) {
                      
                  System.out.println("Your guess was too low. Guess again");
                  numOfLow++;
                }
                  //get another guess from the user
                  guess = scan.nextInt();
                  numOfGuesses++;
          }
 
          //print message saying guess is right
          System.out.println("You guessed correctly. It only took you: " + numOfGuesses + " guesses." + numOfHigh + " were too high and " + numOfLow + " were too low.");
        }
}
 
