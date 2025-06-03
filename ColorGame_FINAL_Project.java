/* 
  Name: <Enter name>
  Project: <project name>
  Date: <date due>
  Date completed: <date submitted>
  Summary: <summarize project with a sentence>
           <what did the project accomplish>
           
*/ 

import java.util.Random;
import java.util.Scanner;   
       
public class ColorGame_FINAL_Project  
{
      public static void main(String[] args)
      {
         String stars = "* * * * * * * * * * * * * * *";
         String cheatSheet = "[1]RED\n[2]YELLOW\n[3]BLUE\n[4]BLACK\n[5]WHITE\n";
         final int NUM_COLORS = 8; //# of colors 
         String[][] colors = new String [][NUM_COLORS];
         int[] colorMix = new int [2];//where the user mixes their colors 
         
         String customerColor; //color chosen by customer
         String hiddenColor; //random color that can't be seen by player
         int playerColor = 0; //color made by player 

         String result; //the finished color
         char choice;
         
         System.out.println(stars);
         info();
                  
            do
            {
               Scanner keyboard = new Scanner(System.in);
               
               //input all methods here 
               
               System.out.println(randomCustomer());
               
               System.out.println(randomColor());
               hiddenColor = randomColor();
               chooseColors(colorMix, cheatSheet);
            
               choice = playAgain();
                              
            }while(choice == 'y');//end of do while loop
            
      System.out.println("Thanks for Playing!!! \n" + stars);
      
         

      }//end of main method
      
      public static void info()
      {
         System.out.println("Welcome to the colors game!\n  ");
         System.out.println("Mix colors to fill customer orders!\n");
         System.out.println("Rules: \n- The customer will ask for a color and you have to guess the second one\n" +
                             "- choose two or three colors to mix\n" +
                             "- mix the appropriate colors to give the customer the colors they want\n" +
                             "- earn points by making customers happy \n" + 
                             "- giving the wrong color will remove points\n");
      }//end of info method 
      
      public static String randomCustomer()
      {
         Random generator = new Random();
         
         int newCustomer = 0;
         String customer;
         newCustomer = generator.nextInt (5)+1;
         
         if (newCustomer == 1)
         {
            customer = "A woman in extravagant clothes walks in. Her name is Lillian. She wants the color: ";
         }
         else if (newCustomer == 2)
         {
            customer = "A teen with baggy clothes and messy hair walks in. He wants the color: ";
         }
         else if (newCustomer == 3)
         {
            customer = "An older man walks in with his grandson. The child wants the color: ";
         }
         else if (newCustomer == 4)
         {
            customer = "A young girl with her sister walk in. They both want the color: ";
         }
         else if (newCustomer == 5)
         {
            customer = "A very fat cat walks in. It wants the color: ";
         }
         else
         {
            customer = "The door is empty!";
         }
         
         return customer;
         
      }//end of randomCustomer method 
      
      //chooses two random colors. One is hidden from the player
      public static String randomColor()
      {
         Die colors = new Die(); //changed to have 8 sides 
         String customerColor = "A";
        
            colors.roll();
            int color = colors.getValue();
            
               if(color == 0)
               {
                  customerColor = "RED\n";
               }
               else if(color == 1)
               {
                  customerColor = "YELLOW\n";
               }
               else if(color == 2)
               {
                  customerColor = "BLUE\n";
               }
               else if(color == 3)
               {
                  customerColor = "ORANGE\n";
               }
               else if(color == 4)
               {
                  customerColor = "GREEN\n";
               }
               else if(color == 5)
               {
                  customerColor = "PURPLE\n";
               }
               
               //end of else if 

         return customerColor; 
      
      }//end of randomColor method 
     
      public static void chooseColors(int[] array, String cheatSheet)
      {
         Scanner keyboard = new Scanner(System.in);
         
         int pickNum = 0; //# of colors the player will mix
         int input = 0; //input of user
         System.out.println("How many colors will you mix?");
            while (pickNum < 1 || pickNum > 3)
            {
               System.out.println("Please pick up to 2 numbers.");
               pickNum = keyboard.nextInt();
            }//end of while loop
            
            array = new int [pickNum];
            
            System.out.println("Pick " + pickNum + " color(s)");
                  System.out.println(cheatSheet);
            
            for(int index = 0; index < array.length; index++)
               {
                  input = keyboard.nextInt();
                  input = array[index];
               }//end of for loop
               
           // mixColors(array);

      } //end of choose colors method
      
      //use the numbers given to determine the mixed color 
      public static String mixColors(int array, int index)
      {
         String result;
         int color1 = array[0]
         int color2 = array[1]
         int color3 = array[3]
         
         if (color1 == 1 || color2 == )
         for(int index = 0; index < array.length; index++)
               {
                  /*if(array[index] == 1)
                  {
                     result = "RED";
                     index++
                     if (array[index] == 2)
                     {
                        result = "ORANGE";
                        index++
                        if(array[index] == 4 )
                        {
                           result = "DARK ORANGE";
                        }
                        else if (array )
                     }
                     else if(array[index] == 3)
                     {
                        result = "PURPLE";
                     }
                  }//end of IF RED IS FIRST 
                  else if (array[index] == 1)*/
                  
                  int color
               }//end of for loop

         
      }//end of mixColors method 
      
      //converts the number into a color. 
      
      public static String result()
      {
      }//end of result method
     */
      public static char playAgain()
      {
          Scanner keyboard = new Scanner(System.in);
          
          String input;  //the input of the user 
          char choice;   //converts the input into a character
          
          System.out.println("Want to keep playing?[Y][N]");
               
      	      input = keyboard.nextLine();//ask user for input
               choice = input.toLowerCase().charAt(0); //converts answer into a single character
          return choice;
      }//end of play again method 

}

