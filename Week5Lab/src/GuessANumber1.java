import java.util.Scanner;

public class GuessANumber1

{

   public static void main (String [] args)

   {

      int guess;

    
      Scanner scan = new Scanner(System.in);

      for (int i = 0; i<3; i++)//will run the program three times
    	  
         {

         int random = (int)(Math.random() * 10 + 1);//generates random number

         System.out.print("Please Guess a number between 1 and 10: ");

         guess = scan.nextInt();//assigns user input to variable "guess"

         

         System.out.println("Secret number is: " + random);

            
         

         if ((guess != random)&&(guess > random))//checks equality condition

         {

            System.out.println("Too High!");

         }

         else if (( guess != random) || (guess < random))//evaluates relational operator

         {

            System.out.println("TOO LOW!");//prints if relational conditions are met

         }

         else

         {

            System.out.println("CONGRATS!!!");//prints if any other condition is not met

         }

      
                  }
      System.out.println();
       System.out.println("Sorry, you ran out of chances");/*will print once the 
       for loop has finished executing*/



         }

      }

   

      

   


