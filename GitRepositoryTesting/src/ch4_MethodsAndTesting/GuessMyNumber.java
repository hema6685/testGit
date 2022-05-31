package ch4_MethodsAndTesting;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		// pick a random number
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		int usernum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1 and 100 (including both)."
				+"\r\nCan you guess what it is?\r\n"
				+ "Type a number:");				
		
		if (!in.hasNextDouble()) {
			usernum = in.nextInt();
			System.err.println(usernum + "is not a number");
			}

		System.out.println("Your guess is: " + usernum );
		System.out.println("The number I was thinking of is:" + number);

		int off  = number - usernum;
		System.out.println("You were off by: " + off);

		in.close();
	}
}

