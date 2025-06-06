/* 
  Name: Catalina Villacis 
  Project: Project 7 Array Operations 
  Date: 11/26/2024
  Date completed: 11/26/2024
  Summary: Using methods to calculate different values in an array.  
           
*/
import java.util.Random; 

public class Project7_ArrayOperations
{

      public static void main(String[] args)
      {
          
          int[] numbers = new int [100];
          
          fillArray(numbers);
          
          System.out.println("Here are some randomly generated numbers: ");
          printArray(numbers);
          
          System.out.println("The highest number is: " + getHighest(numbers));
          System.out.println("The lowest number is: " + getLowest(numbers));

          System.out.println("The total of all values is: " + getTotal(numbers));
          System.out.println("The average is: " + getAverage(numbers));
                    
      }//end of main method
      
      
      // fills the array with random numbers 
      public static void fillArray(int[] list) 
      { 
         Random generator = new Random();
         
          for (int index  = 0; index < list.length; index++)
          {
               list[index] = generator.nextInt(200)+1; 
          }
      }//end of fillArray method 
      
      
      // prints the array of number 
	   public static void printArray(int[] list)
	   {
         for (int index  = 0; index < list.length; index++)
         {
            if(index %10 == 0)
            {
               System.out.println();
            }
            System.out.printf("%5d", list[index]);
         }//end of for loop
         
         System.out.println();
      }//end of printArray method
      
      //calculates the total of the values in the array 
      public static double getTotal(int[] array)
      {
         int sum  = 0; 
         
         for(int index = 0; index < array.length; index++)
         {
            sum += array[index];
            
         }//end of for loop
         
         
         return sum;
         
      }//end of getTotal method 
      
      //calculates the average of the values 
      public static double getAverage(int[] array)
      {
         double sum = getTotal(array);
         double average = 0;
         
         average = sum/array.length;
         
         return average;
         
      }//end of getAverage method
      
      //finds the highest value
      public static int getHighest(int[] array)
      {
         int highest = 0;
         
         for(int index = 0; index < array.length; index++)
         {
            if(array[index] > highest)
            {
               highest = array[index];
            }//end of if statement 
            
         }//end of for loop
         return highest;
         
      }//end of getHighest method
      
      //finds the lowest value 
      public static int getLowest(int[] array)
      {
         int lowest = 0;
            
            for(int index = 0; index < array.length; index++)
            {
               if(array[index] < lowest)
               {
                  lowest = array[index];
               }//end of if statement 
               
            }//end of for loop
            
            return lowest;
            
      }//end of getLowest method
      
      
}//end of Array class
/*
Here are some randomly generated numbers: 
 
    16   54    9   55  185  180   17   92  171  139
   164  164    8   96    2  199  176   97  200   54
   131  156  198  189   99   84   35  107  119  146
    97   31   42   28  118   24  179    4   23  121
    45   40  169  104   30  193  130   82   36   26
    89  149   83   79  150   64   84  159   60  147
   112  120   67   39   34  190  186  113   90   55
    98  104  141   38   62   96   98   25   55  195
   143  194   35   60   82  143    5  199  109  198
   176  136   56   40    4   62  106  112  156   36
 The highest number is: 200
 The lowest number is: 0
 The total of all values is: 9898.0
 The average is: 98.98
*/