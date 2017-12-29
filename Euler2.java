//Author: Sailesh Nankani
//FileName: Euler2
//Date: 15 Feb 17
//Description: Second problem for Euler  

public class Euler2
{

   public static void main(String[] args)
   {
      int a = 1;
      int b = 2;
      int c = 0;
      int sum = 0;
      System.out.print(a+","+b);
      
      
      while (b<4000000)
      {
         if (b%2==0)
         {
            sum = sum+b;
         }
         c = b;
         b = a+b;
         a = c;
         System.out.print(","+b);
         
         
      }
      System.out.println();
      System.out.println(sum);  
   }

}