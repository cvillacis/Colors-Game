/*Name: Catalina Villacis
  Project: Project 5 Rock, Paper, Scissors
  Date: 10/24/2024
  Date completed: 10/29/2024
  Summary:Play a rock paper scissor game using methods         
 */
 
import java.util.Random;  //to use the number generator
import java.util.Scanner; //to use the scanner 

public class Project5_RockPaperScissors
{
	public static void main(String[] args)
   {
      String stars = "******************************";
      
      //Rock, Paper, Scissors Game
      
      System.out.println("Rock, Paper, Scissors Game");
      System.out.println(stars);
      
      Random generator = new Random();
      Scanner keyboard = new Scanner(System.in);
      
      int computerChoice;  //contains random # of 1, 2, or 3
      String computerValue;//contains either rock, paper, scissor
      int playerChoice;    //contains either 1, 2, or 3 chosen by user 
      String playerValue;  //contains either rock, paper, scissor chosen by user
      String winnerIs;     //announces the winner
      
      System.out.println("Welcome to rock, paper, scissors!");
      
         do 
         {   
            //computer generates a number between 1 and 3
            computerChoice = generator.nextInt (3)+1; 
               do
               {
                  menu(); //calls the menu method
                  playerChoice = keyboard.nextInt();//player input 
                  
               }while (playerChoice > 3 || playerChoice < 1);
            
            //converts the number chosen into the corresponding choice
            playerValue = convertChoice (playerChoice); 
            //converts the generated number into the corresponding choice
            computerValue = convertChoice (computerChoice);
            
            System.out.println("Computer: " + computerValue + "\nPlayer: " + playerValue);
            System.out.println(stars);
            winnerIs = checkWinner (computerChoice, playerChoice);
            System.out.println("The winner is: "  + winnerIs);
            
         }while (playerChoice > 0); //(keepPlaying (playerStatus));
   
   }//end of main method
   
   public static void menu ()
   {
      System.out.println("Select one: Rock (1) Paper (2) Scissors (3)");
         
   }//end of menu method 
  
  //turns the number into the move
   public static String convertChoice (int num)
   {
      String choice = "Hi";
      
      
         if (num == 1)
         {
            choice = "Rock";
         }
         else if (num == 2)
         {
            choice = "Paper";
         }
         else if (num == 3)
         {
            choice = "Scissors";
         }
         else
         {
            choice = "OOPS";
         }
         return choice;     
     
   }//end of convertChoice method
   
   //finds out who the winner is
   public static String checkWinner (int computer, int player)
   {
      String winner = "hi"; 
      
         if (computer == 1 && computer != player)
         {
             if (player == 2 )
             {
                winner = "player";
             }
             else if (player == 3)
             {
                winner = "computer";
             }
         }
         else if (computer == 2 && computer != player)
         {
            if (player == 1)
            {
               winner = "computer";
            }
            if (player == 3)
            {
               winner = "player";
            }
         }
         else if (computer == 3 && computer != player)
         {
            if (player == 1)
            {
               winner = "player";
            }
            if (player == 2)
            {
               winner = "computer";
            }
         }
         else if (computer == player)
         {
            winner = "tie"; 
         }
         return winner;
      
   }//end of checkWinner method
}
/*
Rock, Paper, Scissors Game
 ******************************
 Welcome to rock, paper, scissors!
 Select one: Rock (1) Paper (2) Scissors (3)
 6
 Select one: Rock (1) Paper (2) Scissors (3)
 2
 Computer: Rock Player: Paper
 The winner is: player
 Select one: Rock (1) Paper (2) Scissors (3)
 */