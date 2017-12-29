//Author: Sailesh Nankani
//FileName: Euler1
//Date: 15 Feb 17
//Description: First problem for Euler  [User ID: hamleteuler     Password: 12345678]

public class Euler1
{

   public static void main(String[] args)
   {
      int i = 0;
      int sum = 0;
      
      
      while (i<1000)
      {
         if(i%3==0 || i%5==0)
         {
            sum=sum+i;
            i = i+1;        
         }
         else
         { i = i+1;
         }
      }
      
      System.out.println(sum);  
   }

}