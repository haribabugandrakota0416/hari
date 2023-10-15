package codesoft;

import java.util.Random;
import java.util.Scanner;

public class Game {
	 public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
	            System.out.println("Welcome to the Guess the Number game!");

	            int roundsWon = 0;

	            while (true) {
	                int secretNumber = new Random().nextInt(100) + 1;
	                int attempts = 0;
	                final int maxAttempts = 10;

	                while (attempts < maxAttempts) {
	                    System.out.print("Guess the number (1-100). You have " + (maxAttempts - attempts) + " attempts left: ");
	                    int userGuess;

	                    try {
	                        userGuess = Integer.parseInt(scanner.nextLine());
	                    } catch (NumberFormatException e) {
	                        System.out.println("Invalid input. Please enter a valid number.");
	                        continue;
	                    }
	                    attempts++;
	                    if (userGuess == secretNumber) {
	                        System.out.println("Congratulations! You've guessed the number " + secretNumber + " in " + attempts + " attempts.");
	                        roundsWon++;
	                        break;
	                    } else if (userGuess < secretNumber) {
	                        System.out.println("The number is higher. Try again.");
	                    } else {
	                        System.out.println("The number is lower. Try again.");
	                    }
	                }

	                System.out.print("Do you want to play again? (yes/no): ");
	                String playAgain = scanner.nextLine().toLowerCase();

	                if (!playAgain.equals("yes")) {
	                    System.out.println("Thanks for playing! You won " + roundsWon + " round(s).");
	                    break;
	                }
	            }
	        }
	    }
	}


