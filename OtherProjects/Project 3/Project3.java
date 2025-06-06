/*
Name: Catalina Villacis 
  Project: Chapter 3 project 
  Date: 9/26/2024
  Date completed: <10/1/2024>
  Summary: This program collects data and makes different calculations for different senarios.
*/

import java.util.Scanner;


public class Project3
{
	public static void main (String [] args)
	{
   //Scanner objected imported to read input
   Scanner keyboard = new Scanner (System.in);
   
   //Task #1 Book Club Points 
   
   int booksPurchased = 0; //# of books purchased
   int pointsEarned = 0; //# of points earned
   
   //Asks the user how many books they purchased this month. 
   System.out.println ("How many books did you purchase this month?");
      booksPurchased = keyboard.nextInt();   
   
   //Points earned for amount of books purchased
   if (booksPurchased == 1)
   {
      pointsEarned = 5;
   }
   else if (booksPurchased == 2)
   {
      pointsEarned = 15;
   }
   else if (booksPurchased == 3)
   {
      pointsEarned = 30;
   }
   else if (booksPurchased >= 4)
   {
      pointsEarned = 60;
   }	

   else
   {
   System.out.println ("You entered an invalid number");
      pointsEarned = 0;
   }
  
  // Prints out how many books were ordered and how many points were earned 
   System.out.println ("This month, you have ordered " + booksPurchased + " books.");
   System.out.println ("You have earned " + pointsEarned + " points!"); 
   
   System.out.println ("* * * * *");
    /*I spent at least half the class trying to figure out why my program didn't work. 
    I was using keyboard.nextLine for an integer variable instead of keyboard.nextInt.*/
  
    //Task #2 Software Sales 
    
    final int packageCost = 99; //Cost of each package
    double totalCost = 0; //Total cost of order after discount
    double discountAmount = 0; // Discount calculated 
    int packages = 0; // # of packages ordered
    double discount = 0; // Discount that will be applied
    
    //Asking user how many packages purchased
    System.out.println ("How many packages were purchased?");
    
    //Discount recieved for each range
    packages = keyboard.nextInt();
     if (packages < 10)
     {
         discount = 0;
     }
     else if (packages >= 10 && packages <= 19)
     {
         discount = 0.2;
     }
     else if (packages >= 20 && packages <= 49)
     {
         discount = 0.3;
     }
      else if (packages >= 50 && packages <= 99)
     {
         discount = 0.4;
     }
      else if (packages >= 100)
     {
         discount = 0.5;
     }
     
     // Calculates how much to be discounted 
     discountAmount = (packageCost * packages) * discount;
     totalCost = (packageCost * packages) - discountAmount;
     
     //Prints the user's order amount
     System.out.println ("Discount: -$" + discountAmount); 
     System.out.println ("The final cost of your purchase is $" + totalCost);
   
     System.out.println ("* * * * *");
     
// Task #3 The Speed of Sound
   char mediumType; // medium chosen
   String medium = "Air"; //name of medium
   String input; // user input
   int speed = 0; //speed
   int distance = 0; //distance 
   double time = 0; //time
   
   //Asks user for distance 
   System.out.println ("Enter distance");
      distance  = keyboard.nextInt();
   
   keyboard.nextLine();
   
   //Asks user for medium
   System.out.println("Enter one of the following mediums to" 
                       + " measure the speed of sound.");
   System.out.println ("Air(A), Water(W), Steel(S)");
   
      input = keyboard.nextLine();
      
      //Converts user input to prevent error
      mediumType = input.toUpperCase().charAt(0); 
      
   //Speed for each choice of medium   
   switch (mediumType)
   {
   case 'A' :
      medium = "Air";
      speed = 1100;
      break;
   case 'W' :
      medium = "Water";
      speed = 4900;
      break;
   case 'S' :
      medium = "Steel";
      speed = 16400;
      break;
   default: 
      System.out.println("Invalid medium entered, air will be chosen.");
      medium = "Air";
   }
   //calculates time
   time = distance / speed; 
   
   //Prints outs the time it will take
   System.out.println("The amount of time it will take for sound to travel "
                        + distance + " feet through " + medium + " is " 
                        + time + " seconds");
   }
}
/*
How many books did you purchase this month?
 3
 This month, you have ordered 3 books.
 You have earned 30 points!
 * * * * *
 How many packages were purchased?
 20
 Discount: -$594.0
 The final cost of your purchase is $1386.0
 * * * * *
 Enter distance
 2200
 Enter one of the following mediums to measure the speed of sound.
 Air(A), Water(W), Steel(S)
 A
 The amount of time it will take for sound to travel 2200 feet through Air is 2.0 seconds
 */