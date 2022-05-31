package ch4_MethodsAndTesting;

/*
Exercise 4.1 The purpose of this exercise is to take code from a previous
exercise and redesign it as a method that takes parameters.
Start with a working solution to Exercise 2.2.

1. Write a method called printAmerican that takes the day, date, month,
and year as parameters and displays them in American format.
2. Test your method by invoking it from main and passing appropriate arguments.
The output should look something like this (except the date might be different):

Monday, July 22, 2019

3. Once you have debugged printAmerican, write another method called
printEuropean that displays the date in European format.
*/

public class DateFormats {
	
	static void printAmerican(String day,String month,int date,int year) {
		
		System.out.println(day + ", " + month + " " + date + ", " + year);
		
	}
	static void printEuropean(String day,int date,String month,int year) {
		
		System.out.println(day + ", " + date + " " + month + " "+ year);
	}
}
