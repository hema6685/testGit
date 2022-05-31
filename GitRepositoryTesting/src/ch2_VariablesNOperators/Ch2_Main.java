package ch2_VariablesNOperators;

public class Ch2_Main {

	public static void main(String[] args) {

		// Ex2.1
		/*System.out.println("Hello World");*/

		//Ex2.2
		/*Date d = new Date();
		System.out.println("Today's date: " + d.day +" " + d.date +" " + d.month+ " " + d.year);

		String day = "Friday", month="May" ;
		int date = 27, year=2022;

		System.out.println("day: " + day);
		System.out.println("date: "+ date);
		System.out.println("month: " + month);
		System.out.println("year : "+ year);
		
		System.out.println("American format: " +day +", " + month +" "+date +", "+ year);
		System.out.println("European format: " +day +" " +date+" " + month +" " + year);
		*/
		
		//Ex2.3
		
		Time t = new Time();
		System.out.println("sseconds passed since mid night : " + t.timeLapsed());
		
		int a=0;
		System.out.println("sseconds remained  : " + t.remaingSeconds());
		double d1 = t.percentOfDayPassed();
		System.out.printf("passed day percentage  : %.2f " , d1, a);// will not throw error
		
		System.out.println("\nseconds for the excersize : " + t.timeConsumed());
	}

}
