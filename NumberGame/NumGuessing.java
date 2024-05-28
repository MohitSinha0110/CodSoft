package NumberGame;//package NumberGame;

import java.io.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumGuessing {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[47m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[46m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public NumGuessing(){
   	guessingNumber();

    }

    public void	guessingNumber()
	{

		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Generate the numbers
		int number = 1 + (int)(100
							* Math.random());
		// System.out.println(number + " Generated number ");

		// Given K trials
		int K = 8;

		int i =0;
		int guess;

		System.out.println("A number is chosen"	+ " between 1 to 100."+ "Guess the number" + " within 8 trials.");


		try {
			// Iterate over K Trials
			for (i = 0; i < K; i++) {

				System.out.println("Trial left : " + (K - i));

				System.out.println(
						"Guess the number:");

				// Take input for guessing
				guess = sc.nextInt();

				// If the number is guessed
				if (number == guess) {
					System.out.println(ANSI_RED_BACKGROUND
							+ "Congratulations ! "
							+ ANSI_RESET);
					System.out.println(ANSI_YELLOW +
							"You guessed the number correctly."
							+ ANSI_RESET);
					break;
				} else if (number > guess && i != K - 1) {
					System.out.println("The number is " + "greater than " + guess);
				} else if (number < guess && i != K - 1) {
					System.out.println("The number is" + " less than " + guess);
				}
			}
		}

		catch (InputMismatchException e){
			System.out.println(ANSI_RED_BACKGROUND
					+ "Enter the valid input" + ANSI_RESET);
			System.out.println();
			System.out.println(ANSI_YELLOW_BACKGROUND
					+ "Game Ended "
					+ ANSI_RESET);

		}

		/* If loops runs completely value of K will be  8  */

		if (i == K) {
			System.out.println(
				"You have exhausted" + " 8 trials.");
			System.out.println(ANSI_GREEN_BACKGROUND+ "The number was  "+ number
					+ ANSI_RESET);

			System.out.println(ANSI_RED_BACKGROUND
					+ "Better Luck Next time "
					+ ANSI_RESET);
			System.out.println(ANSI_YELLOW_BACKGROUND
					+ "GAME ENDED"
					+ ANSI_RESET);
		}
	}
    
}
