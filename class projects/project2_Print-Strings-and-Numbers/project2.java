/*
  Name: Catalina Villacis
  Project: Chapter 2 Project
  Date: 9/17/24
  Date completed: 9/17/24
  Summary: This project applies what we learned in the lab to different scenarios.
 First objective is to print out information, second manipulates strings given by the user,
 Third creates a restaurant bill with the price given by the user. 
   
   */

import java.util.Scanner;
public class project2
{
   public static void main (String [] args)
   {
   //#1 Personal Information 
   
   System.out.println("Catalina Villacis\n"+
   "40 Midwood Rd, Lincoln Park, NJ, 07502 \n" +
   "555-555-5555\n" + "County College of Morris" );
      //Prints out the personal info
   System.out.println("***");
   
   //#2 String Manipulator
  
   Scanner keyboard = new Scanner(System.in);
   System.out.println("What's your favorite city?");
      String favoriteCity = keyboard.nextLine();
   
   //Asks for favorite city 
   
      favoriteCity = favoriteCity.toUpperCase();
   System.out.println(favoriteCity);
      favoriteCity = favoriteCity.toLowerCase();
   System.out.println(favoriteCity);
   
      //Prints the city in uppercase and lowercase
   
   char firstCharacter;
      firstCharacter = favoriteCity.charAt(0);
   System.out.println("The first character for "+favoriteCity+" is "+firstCharacter);
   
      //Prints the first character for favorite city 
   
   System.out.println("***");
   
   //#3 Restaurant Bill
   double tax = .0675, tip = .2;
   System.out.println("Enter charge amount");
      double chargeAmount = keyboard.nextDouble();
      //Asks for the charge amount
   double totalAmount = chargeAmount + (chargeAmount * tax) + (chargeAmount * tip);
   tax = 6.75;
   tip = 20;
   System.out.println("Tip: " + tip + "%");
   System.out.println("Tax: " + tax + "%");
   
   System.out.println("Total: " + totalAmount);
      
   }
}
/*Catalina Villacis
 40 Midwood Rd, Lincoln Park, NJ, 07502 
 555-555-5555
 County College of Morris
 ***
 What's your favorite city?
 New York
 NEW YORK
 new york
 The first character for new york is n
 ***
 Enter charge amount
 54.93
 Tip: 20.0%
 Tax: 6.75%
 Total: 69.623775
 */
 
