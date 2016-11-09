import java.util.Scanner;

public class GuessANumber

{

   public static void main (String [] args)

   {

      int guess;

      String replay = "";

      

      Scanner scan = new Scanner(System.in);

   

      //while(replay != 'n')

     
      {

         int random = (int)(Math.random() * 10 + 1);

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

      
         
       

         {

            System.out.print("Would you like to play again? (y or n) ");

            replay = scan.next();

         

            if(replay.equalsIgnoreCase("y"))

            {
            	System.out.println();//creates a blank line for spacing on output
            	System.out.println("Please run the program again!");
               

            }

            if(replay.equalsIgnoreCase("n"))
            {
            	System.out.println();//creates a blank line for spacing on output
                System.out.println("GoodBye!");

        
           }

         }
         }
      }
   
}




      

   

      

   



