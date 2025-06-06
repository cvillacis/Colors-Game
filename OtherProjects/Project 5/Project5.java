/*Name: Catalina Villacis
  Project: Project 5 Even/Odd
  Date: 10/24/2024
  Date completed: 10/24/2024
  Summary: A random number generator creates a number between 1-100 then
  checks how many are even and how many are odd.         
 */
 
import java.util.Random; //imports number generator

public class Project5
{
	public static void main(String[] args)
   {
   String stars = "******************************";
   
   //Even/Odd counter
   
   System.out.println("Even/Odd counter");
   System.out.println(stars);
   
   Random generator = new Random();
   
   int number;      //Number generated
   int evenNum = 0; //Numbers that are even
   int oddNum = 0;  //Numbers that are odd
   
      //generates 100 integers between 1 - 100 and checks if they are even or odd. 
      for (int x = 0; x < 100; x++)
      {
         number = generator.nextInt(100) + 1; 
         
         //calls isEven method
         if (isEven(number))
         {
            evenNum++; //adds to even counter
         }
         else 
         {
            oddNum++; //adds to odd counter
         }
      }//end of for loop
      
   //Prints out how many numbers were even and how many were odd
   System.out.println("Even: " + evenNum);
   System.out.println("Odd: " + oddNum);
   
   }//end of main method
   
   //Method that checks if each number is even or odd
   //returns status and parameter number 
   public static boolean isEven (int number)
   {
      boolean status;   //boolean variable to deterimine if the number is even or odd
      
      //checks if the number is even or odd
      if ((number % 2) == 0)
      {
         status = true; 
      }
      else
      {
         status = false;
      }
      
      return status;//returns the value to the main method
   } //end of isEven method
}
/*
Even/Odd counter
 ******************************
 Even: 52
 Odd: 48
*/