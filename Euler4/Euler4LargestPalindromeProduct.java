//Author: Sailesh Nankani
//FileName: LargestPalindromeProductEuler4
//Date: 17 Feb 17
//Description: Fourth problem for Euler  

public class Euler4LargestPalindromeProduct
{

   public static void main(String[] args)
   {
      int a = 999;
      int b = 998;
      
      int first = 0;
      int second = 0;
      int third = 0;
      
      int first1 = 0;
      int second1 = 0;
      int third1 = 1;
      
      int product = 998001;
      boolean k = first==third1 && second==second1 && third == first1;
      String i = "";
      
      
      while (!(k))
      {
          k = first==third1 && second==second1 && third == first1;
          System.out.println(k);
          if (k)
            break;
            
          first = product/100000;
          second = (product/10000)%10;
          third = (product/1000)%10;
      
          first1 = (product/100)%10;
          second1 = (product/10)%10;
          third1 = product%10;
          
          System.out.println(first+"\t" + third1);
          System.out.println(second+"\t" + second1);
          System.out.println(third+"\t" + first1);
          
          while (a>b)
          {
              a = a-1; 
              product = a*b;
              System.out.println(a);
              System.out.println(b);
              System.out.println(product);
              
              
              first = product/100000;
              second = (product/10000)%10;
              third = (product/1000)%10;
      
              first1 = (product/100)%10;
              second1 = (product/10)%10;
              third1 = product%10;
              
              k = first==third1 && second==second1 && third == first1;
              
              if (k)
               i = i+"\t"+product;
              
          }
          if (!k)
          {
            a = 999;
            b= b-1;
          }
          
          System.out.println(a);
          System.out.println(b);
          System.out.println(i);
       
          
      }
     
      System.out.println(a); 
      System.out.println(b); 
      System.out.println(k);
      
      
   }

}