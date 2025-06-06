/* 
  Name: Catalina Villacis
  Project:Project 6 Fishing Game 
  Date: 11/12/2024
  Date completed: 11/12/2024
  Summary:game that uses the die class to deterimine the points of fish
           
*/

import java.util.Scanner;

public class Project6_FishingGame
{
  public static void main (String[] args)
  {
      int points = 0;//total points
      int value = 0; //value of random number
      String input;  //the input of the user 
      char choice;   //converts the input into a character
      
      //object to randomly catch a fish
      Die fish = new Die();
      
      System.out.println ("Welcome to the fishing game!!!");
      
      do 
      {
         fish.roll();
         
         //and number is generated and put into value 
         value = fish.getValue();
         
         //assigns an item for each number 
         if(value == 1)
         {
            System.out.println("You caught a shark!");
            System.out.println("At least it's not a dolphin...");
            points += 50;//adds points 
            System.out.println("Points +50!");
            System.out.println("Total points: " + points);// displays total points so far
         }
         else if (value == 2)
         {
            System.out.println("You caught an Iphone!");
            System.out.println("It is destroyed beyond repair...");
            points++;
            System.out.println("Points +1!");
            System.out.println("Total points: " + points);
         }
         else if (value == 3)
         {
            System.out.println("You caught a tiger!");
            System.out.println("It seems to be as confused as you are.");
            points+= 20;
            System.out.println("Points +20!");
            System.out.println("Total points: " + points);
         }
         else if (value == 4)
         {
            System.out.println("You caught a gold bracelet!");
            System.out.println("You're filled with excitment thinking all this fishing paid off " + 
            "\nuntil you discover the 'Made in China' on the back");
            points+= 3;
            System.out.println("Points +3!");
            System.out.println("Total points: " + points); 
         }
         else if (value == 5)
         {
            System.out.println("You caught a book!");
            System.out.println("The pages have disintegrated.");
            points+= 10;
            System.out.println("Points +10!");
            System.out.println("Total points: " + points);
         }
         else if (value == 6)
         {
            System.out.println("You caught a salmon!");
            System.out.println("Probably the most normal thing you'll catch today.");
            points+= 30;
            System.out.println("Points + 30!");
            System.out.println("Total points: " + points);
         }
         else
         {
            System.out.println("oops");
         }//end of if statement 
         
         //asks the player if they want to play again
         Scanner keyboard = new Scanner(System.in);
         
         System.out.println("Want to keep fishing?");
         
	      input = keyboard.nextLine();//ask user for input
         choice = input.charAt(0);//converts answer into a single character
         
      }while(choice == 'Y'|| choice == 'y');//end of do while loop
      
  }//end of main method 
  
}//end of FishingGame class


/*
Welcome to the fishing game!!!
 You caught a salmon!
 Probably the most normal thing you will catch today.
 Points + 30!
 Total points: 30
 Want to keep fishing?
 y
 You caught a tiger!
 It seems to be as confused as you are.
 Points +20!
 Total points: 50
 Want to keep fishing?
 y
 You caught an Iphone!
 It is destroyed beyond repair...
 Points +1!
 Total points: 51
 Want to keep fishing?
 y
 You caught a shark!
 It looks a you with anger.
 Points +50!
 Total points: 101
 Want to keep fishing?
 y
 You caught a tiger!
 It seems to be as confused as you are.
 Points +20!
 Total points: 121
 Want to keep fishing?
 y
 You caught a gold bracelet!
 You're filled with excitment thinking all this fishing paid off until you discover 'Made in China' on the back
 Points +3!
 Total points: 124
 Want to keep fishing?
 n
 */