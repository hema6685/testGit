package ch4_MethodsAndTesting;

public class ch4_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Ex 4.1
		DateFormats.printAmerican("Monday", "May", 30, 2022);
		DateFormats.printEuropean("Monday", 30, "May", 2020);
		*/
		
		//Ex 4.2
		//	3. Write a main method that tests multadd by invoking it with a few simple parameters,
		//	like 1.0, 2.0, 3.0.
		//	4. Also in main, use multadd to compute the following values:
		// sin pi/4 + (cos pi/4)/2
		// log 10 + log 20
		 
		double d1 = Multadd.multadd(1.0,2.0, 3.0);
		System.out.println(d1);
		double d2 = Multadd.multadd(Math.sin(Math.PI/4), 1, Math.cos(Math.PI/4)/2);
		System.out.println(d2);
		double d3 = Multadd.multadd(Math.log10(10), 1, Math.log10(20));
		System.out.println(d3);
		
		
	}

}
