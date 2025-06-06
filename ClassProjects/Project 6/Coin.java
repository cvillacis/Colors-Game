import java.util.Random;

public class Coin
{
   public String sideUp;
   public Coin()
   {
      //sideUp = "heads";
      toss();
   }//end of coin constructor
   
   public void toss()
   {
      Random generator = new Random();
      int side = generator.nextInt(2); //0 or 1
      if (side == 0)
         sideUp = "heads";
      else 
         sideUp = "tails";
   }//end of toss method 
   public String getSideUp()
   {
      return sideUp;
   } // end of getSideUp method 


}//end of class coin