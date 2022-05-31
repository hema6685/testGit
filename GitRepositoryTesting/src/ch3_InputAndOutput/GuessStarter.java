/**
 * 
 */
package ch3_InputAndOutput;
import java.util.Random;
import java.util.Scanner;
/**
 * @author OM
 * 
Exercise 3.4 The goal of this exercise is to program a Guess My Number game.
When it's finished, it should work like this:

I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31

1. The definition of GuessStarter is in a file called GuessStarter.java, in
the directory called ch03, in the repository for this book.
2. Compile and run this program.
3. Modify the program to prompt the user; then use a Scanner to read a
line of user input. Compile and test the program.
4. Read the user input as an integer and display the result. Again, compile
and test.
5. Compute and display the difference between the user's guess and the
number that was generated.
*/

public class GuessStarter {
	public static void main(String[] args) {
		// pick a random number
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		System.out.println("I'm thinking of a number between 1 and 100 (including both)."
				+"\r\nCan you guess what it is?\r\n"
				+ "Type a number:");
		Scanner in = new Scanner(System.in);
		int usernum = in.nextInt();
		
		System.out.println("Your guess is: " + usernum );
		System.out.println("The number I was thinking of is:" + number);
		
		int off  = number - usernum;
		System.out.println("You were off by: " + off);
		
		in.close();
	}
}