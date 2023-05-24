public class salaryCalculator{

	public static double salaryCalc(double hourPerWeek, double amountPerHour, int vacationDays){

	        if (hourPerWeek <0){
		 return -1;
		}	
		if (amountPerHour <0){
		  return -1;
		}
		double weeklyPaycheck = hourPerWeek * amountPerHour;
		double unpaidTime = vacationDays * amountPerHour * 8;
		return (weeklyPaycheck * 52) - unpaidTime;

	}

	public static void main(String[] args){
	
		double salary = salaryCalc(40, 15,8);
		System.out.println(salary);
	}
} 
