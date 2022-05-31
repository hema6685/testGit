package ch3_InputAndOutput;

import java.util.Scanner;
/*
 * Exercise 3.2 Write a program that converts a temperature from Celsius to
Fahrenheit. It should:
(1) prompt the user for input,
(2) read a double value from the keyboard
(3) calculate the result and
(4) format the output to one decimal place. 

When it's finished, it should work like this:
Enter a temperature in Celsius: 24
24.0 C = 75.2 F
Here is the formula to do the conversion:
F = C *9/5 + 32

Hint: Be careful not to use integer division
*/

public class CelsiusToFerenhit {

	Scanner in = new Scanner(System.in);
	
	public void c2fConverter() {
		
		System.out.println("Enter a temperature in Celsius:");
		double c = in.nextDouble();
		
		double f = (c * 9.0/5.0) + 32;		
		System.out.printf("%.1f C = %.1f F", c, f);				
	}
		
}
