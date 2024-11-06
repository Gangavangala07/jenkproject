import java.util.Random;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Guess a number (1-100):");
            int guess = scanner.nextInt();
            if (guess == numberToGuess) {
                System.out.println("You won!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }
    }
}

