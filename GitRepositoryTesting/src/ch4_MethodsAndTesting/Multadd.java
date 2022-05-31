package ch4_MethodsAndTesting;
/*
1. Create a new program called Multadd.java.
2. Write a method called multadd that takes three doubles as parameters and returns a * b + c.
3. Write a main method that tests multadd by invoking it with a few simple parameters,
like 1.0, 2.0, 3.0.
4. Also in main, use multadd to compute the following values:

sin pi/4 + (cos pi/4)/2
log 10 + log 20

5. Write a method called expSum that takes a double as a parameter and uses multadd to calculate:
xe^-x + sqrt(1 - e^-x)
Hint: The method for raising e to a power is Math.exp.
*/
public class Multadd {

	static double multadd(double a, double b, double c) {
		
		double ans;
		ans = a * b + c ;
		return ans;
		
	}
}
