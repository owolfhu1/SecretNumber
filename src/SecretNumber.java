import java.util.Random;
import java.util.Scanner;

public class SecretNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int secretNumber = rand.nextInt(100) + 1;
		int guess;
		char again = 'y';
		do {
			System.out.println("Please guess a number between 1 and 100: ");
			while (!scan.hasNextInt()){
				scan.next();
			}
			guess = scan.nextInt();
			String text;
			if (guess > secretNumber) text = "Sorry your guess is too high, please try again"; 			
			else if (guess < secretNumber) text = "Sorry your guess is too low, please try again";
			else text = "YOU GOT IT!! the number was infact " + guess;
			System.out.println(text);
			System.out.println("would you like to try again?(y/n): ");
			do {
				again = scan.next().toLowerCase().charAt(0);
			} while (again != 'y' && again != 'n');
		} while (again == 'y');
		
		
	}

}

/*
 * 
 Create a program to guess a secret number.
Use eclipse
write a program that will prompt the user to guess a secret number
loop until they get the number
Submit your solution through github
Your program should display the following:

------------------------------------
Enter your number: 999
You guessed too low, try again? (Y/N)
------------------------------------
To generate a random number in Java import the Random class from the Java API
Then use the code sample below to generate a number between 1 and 10.
import java.util.Random;

Random r = new Random();
int x = 1 + r.nextInt(10);
 * 
 */





