package ch2_VariablesNOperators;

public class Time {


	int hour=10,minute=13,second=30;
	
	int hour1=10,minute1=40, second1=10;


	int timeConsumed() {
		int ans=0;
		int	h = hour1- hour;		
		int m = minute1- minute;
		if(m<0) m = m*(-1);
		
		int s = second1 - second;
		if(s<0) s=s*(-1);
		
		ans = (h*60) + m*60 + s;
		
		return ans;
	}

	int timeLapsed(){
		
		int passedSecond = 0;		
		int midNight=0;			 
		passedSecond = ((hour*60*60) + (minute*60) + second) - midNight; 
		
		return passedSecond;
		
	}
	int remaingSeconds() {
		int remainedSecond=0;
		
		remainedSecond = (24*60*60) - timeLapsed();
		
		return remainedSecond;
	} 
	double percentOfDayPassed() {
		double p=0;
		double total = 24.0* 60.0* 60.0;
		double passedTime = timeLapsed();
		
		p =  passedTime/total *100;
		
		return p;		
	}
}
