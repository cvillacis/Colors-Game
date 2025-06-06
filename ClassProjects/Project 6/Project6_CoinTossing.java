/* 
  Name: Catalina Villacis
  Project:Project 6 CoinToss
  Date: 11/12/2024
  Date completed: 11/12/2024
  Summary:tosses a coin until it reaches or excedes $1 using methods and the coin class.
           
*/
import java.util.Scanner;

public class Project6_CoinTossing
{
  public static void main (String[] args)
  {
   
   double NICKEL = .05; //value of a nickel
   double DIME = .10;   //value of a dime
   double QUARTER = .25;//value of a quarter
   double balance = 0.0;// total balance 
   String input;        //user input
   char choice;         //input converted to a choice
   
   //objects for each coin to be tossed 
   Coin nickel = new Coin(); 
   Coin dime = new Coin();
   Coin quarter = new Coin();
   
   System.out.println("Welcome to the coin toss game!");
   
      do
      {
         balance = 0.0;//resets balance to 0
         //tosses each coin until the balance reaches or exceeds 1
         while (balance < 1.00)
         {
            nickel.toss();
               if (isHeadsUp(nickel))
               {
                  balance += NICKEL;//adds the value of a nickel to the balance 
               }
               else 
               {
                  balance += 0;
               }// end of if statement for nickel
               
            dime.toss();
               if (isHeadsUp(dime))
               {
                  balance += DIME;//adds the value of a dime to the balance
               }
               else 
               {
                  balance += 0;
               }// end of if statement for dime
            quarter.toss();
               if (isHeadsUp(quarter))
               {
                  balance += QUARTER;//adds the value of a quarter to the balance
               }
               else 
               {
                  balance += 0;
               }// end of if statement for quarter
     
         }// end of while loop
     
     //outputs balance    
     System.out.printf("$%.2f \n", balance);
     
     //determines if the player wins 
      if (balance == 1.00)
      {
         System.out.println("Balance is exactly one dollar, you win!");
      }
      else
      {
         System.out.println("Balance exceeded one dollar, you lose.");
      }
      
      //asks the player if they want to play again
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Want to play again?");
	   input = keyboard.nextLine();
      choice = input.charAt(0);
      
      }while (choice == 'Y'|| choice == 'y');//end of do while loop
  
  } // end of main method 
  
   //method that determines if the coin is heads or tails
   public static boolean isHeadsUp(Coin coin)
   {
   	if(coin.getSideUp().equals("heads"))
      {
   		return true;
      }
      else 
      {
   		return false;
         
      } //end of if statement
         
   } // end of isHeadsUp method


} // end of CoinTossing class

/*
Welcome to the coin toss game!
 $1.10 
 Balance exceeded one dollar, you lose.
 Want to play again?
 y
 $1.15 
 Balance exceeded one dollar, you lose.
 Want to play again?
 y
 $1.05 
 Balance exceeded one dollar, you lose.
 Want to play again?
 y
 $1.15 
 Balance exceeded one dollar, you lose.
 Want to play again?
 y
 $1.20 
 Balance exceeded one dollar, you lose.
 Want to play again?
 y
 $1.10 
 Balance exceeded one dollar, you lose.
 Want to play again?
 y
 $1.05 
 Balance exceeded one dollar, you lose.
 Want to play again?
 y
 $1.00 
 Balance is exactly one dollar, you win!
 Want to play again?
 n
 */