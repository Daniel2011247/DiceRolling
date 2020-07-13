package Student;
import java.security.SecureRandom;
public class DiceRolling {
	public static void main(String[] args) {

        SecureRandom randomNumber = new SecureRandom();

        int[] firstDice = new int []{1, 2, 3, 4, 5, 6};
        int[] secondDice = new int []{1, 2, 3, 4, 5, 6};

        for (int i = 0; i < 1; i++) {
            int firstDiceRoll = 1 + randomNumber.nextInt(6);
            System.out.println(firstDiceRoll);

            int secondDiceRoll = 1 + randomNumber.nextInt(6);
            System.out.println(secondDiceRoll);

            int sumOfTwoValues = firstDiceRoll + secondDiceRoll;
            System.out.println(sumOfTwoValues);
        }
    }
}
