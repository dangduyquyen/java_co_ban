package Bai_Tap_Lap_p1;
import java.util.Scanner;

class bai_6
{
   public static void main (String[] args)
   {		
       int i =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = scanner.nextInt();
        int num;
       //Empty String
       String  primeNumbers = "";

       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to n are :");
       System.out.println(primeNumbers);
   }
}