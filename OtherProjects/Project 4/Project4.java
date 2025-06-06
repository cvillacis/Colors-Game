/*Name: Catalina Villacis
  Project: Project 4
  Date: 10/15/2024
  Date completed: 10/15/2024
  Summary: using loops with user input.
           
 */

import java.util.Random;		// to use the random number generator 
import java.util.Scanner;     // to use the scanner

public class Project4
{
	public static void main(String[] args)
   {
//TASK 1
      System.out.println("Random Number Game");
      System.out.println("**  **  **  **  **  **  **  **  **  **");

      Scanner keyboard = new Scanner (System.in); //create a scanner
      Random generator = new Random(); // create a random object
    
      int randomNum;      //Random number generated 
      int guess;          //Guess by user
      int guessCount = 1; //# of guesses by the user
      
   //Generates a random number between 1 and 100   
   randomNum = generator.nextInt(100) + 1;
   
   //Asks the user to guess what the number is
   System.out.println("Guess the number between 1-100");
   guess = keyboard.nextInt();
   
   //skips the game for testing  
   if (guess == -1) 
   {
      guess = randomNum;
   }
   
   //Forces the user to type a valid number before any valid guesses have been made.
    while (guess < 1 || guess > 100)
    {
      System.out.println("Please enter a number between 1-100");
      guess = keyboard.nextInt();   
    }
   //Checks if the user's guess is within range
    while (guess != randomNum)
       {
         if (guess < randomNum) //checks if guess is too low
         {
            System.out.println("Too low, try again!");
            guessCount++;
            guess = keyboard.nextInt();
         }
         else if (guess > randomNum)//checks if guess is too high
         {
            System.out.println("Too high, try again");
            guessCount++;
            guess = keyboard.nextInt();
         }
         // Forces the user to enter a valid number after valid guesses have been made. 
         while (guess < 1 || guess > 100)
         {
            System.out.println("Please enter a number between 1-100");
            guessCount++;
            guess = keyboard.nextInt();
         }
       } 
   if (guess == randomNum)//checks if guess is correct
         {
            System.out.println("Congrats! You guessed the right number in "+ guessCount + " tries" );
            
         }

          
//TASK 2
System.out.println(" ");
System.out.println("Sum of Number");
System.out.println("**  **  **  **  **  **  **  **  **  **");

   int sum = 0; //the sum of all numbers
   int num;     //number submitted by user
   
   //asks the user for a number 
   System.out.println("Type a positive, non-zero integer.");
   num  = keyboard.nextInt();
   
   //makes sure number is greater than 0
   while (num > 0)
   {
      sum += num;
      num--;
   }
   //outputs the sum
   System.out.println(sum);
   }
}
/*
Random Number Game
 **  **  **  **  **  **  **  **  **  **
 Guess the number between 1-100
 3
 Too low, try again!
 101
 Please enter a number between 1-100
 80
 Too low, try again!
 90
 Too low, try again!
 99
 Too low, try again!
 100
 Congrats! You guessed the right number in 6 tries
  
 Sum of Number
 **  **  **  **  **  **  **  **  **  **
 Type a positive, non-zero integer.
 6
 21
 */
      
  
