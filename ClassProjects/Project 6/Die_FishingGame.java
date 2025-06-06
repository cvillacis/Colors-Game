import java.util.Random;

public class Die
{

   private int sides;
   private int value; 
   
   public Die()
   {
      sides = 6;
      value = 1;
      
   }// end of Die constructor method 
    
   public Die (int numSides)
   {
      sides = numSides;
      roll();
   }// end of Die constructor method WITH numsides 
   
   public void roll()
   {
      Random generator = new Random();
      value = generator.nextInt(sides) + 1;
   }//end of roll method
   
   public int getValue()
   {
      return value;
   }// end of gatValue method
   


} // end of die class
