
public class Euler3
{

   public static void main(String[] args)
   {
      long a = 600851475143L;
      int i = 2;
      System.out.print(1);

      
      
      while (i<=a)
      {
         if (a%i==0)
         {
            System.out.print(","+i);
            a=a/i;
   

         }
         
         else
         {
            i+=1;
         }
         
      }
      System.out.println();

   }

}