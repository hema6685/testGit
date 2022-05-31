package ch3_InputAndOutput;

import java.util.Scanner;

/*
Exercise 3.3 Write a program that converts a total number of seconds to
hours, minutes, and seconds. It should
(1) prompt the user for input
(2) read an integer from the keyboard
(3) calculate the result, and
(4) use printf to display the output.

For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds".
Hint: Use the remainder operator.
*/
public class SecToHours {

	
	public static void toHoursConverter() {
		Scanner in =new Scanner(System.in);	
		System.out.println("Enter total seconds:");
		int totalSeconds = in.nextInt();
		
		int seconds = totalSeconds%60;
		int minutes = totalSeconds/60;
		int hour = minutes/60;
		minutes= minutes%60;
		
		System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", totalSeconds, hour,minutes,seconds);
		in.close();
	} 
	
}
