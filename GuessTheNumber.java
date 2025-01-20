import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
   public GuessTheNumber() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      int var3 = 0;
      System.out.println("Welcome to the Guess the Number game!");

      boolean var4;
      do {
         int var5 = var2.nextInt(100) + 1;
         int var6 = 0;
         byte var7 = 10;
         boolean var8 = false;
         System.out.println("\nI have chosen a number between 1 and 100.");
         System.out.println("Can you guess it? You have " + var7 + " attempts.");

         while(var6 < var7) {
            System.out.print("\nEnter your guess: ");
            int var9 = var1.nextInt();
            ++var6;
            if (var9 == var5) {
               System.out.println("YaYyy Congratulations! You guessed the number in " + var6 + " attempts.");
               var8 = true;
               var3 += (var7 - var6 + 1) * 10;
               break;
            }

            if (var9 < var5) {
               System.out.println("ohoo Too low! Try again.");
            } else {
               System.out.println("ohoo Too high! Try again.");
            }
         }

         if (!var8) {
            System.out.println("\nOH no!Game Over! The correct number was " + var5 + ".");
         }

         System.out.println("Your current score is: " + var3);
         System.out.print("\nDo you want to play another round? (yes/no): ");
         var4 = var1.next().equalsIgnoreCase("yes");
      } while(var4);

      System.out.println("\nThanks for playing! Your final score is: " + var3);
      var1.close();
   }
}