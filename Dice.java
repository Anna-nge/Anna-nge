/* Name-Nang Nu Nu Aye
 * Id-6643005
 * Section-545
 */
package classEx6;
import java.util.Random;

public class Dice {
    private Random random;

    public Dice() {
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(6) + 1; // Generate a random number between 1 and 6
    }
}


