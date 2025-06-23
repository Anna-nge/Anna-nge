/* Name-Nang Nu Nu Aye
Id- 6643005
Section-545 
*/

package classEx6;


import java.util.Random;
import java.util.Scanner;

public class SimpleDiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice(); // Create a Dice object
        
        System.out.println("Welcome to the Simple Dice Game!");
        System.out.print("Enter your guess (1-6): ");
        int userGuess = scanner.nextInt();
        
        int rollResult = dice.roll(); // Roll the dice
        
        System.out.println("The dice rolled: " + rollResult);
        
        if (userGuess == rollResult) {
            System.out.println("Congratulations! You guessed correctly.");
        } else {
            System.out.println("Sorry! Better luck next time.");
        }
        
        scanner.close();
    }
}
