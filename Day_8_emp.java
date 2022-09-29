package Day_8_problems;

import Day_8_problems.Day_8_Employee;

public class Day_8_emp {
	  public static void main(String[] args) {
	        System.out.println("Welcome Employee");
	        System.out.println("------------------------------------------------");
	        Day_8_Employee emp = new Day_8_Employee();
	        emp.isEmpPresent("user");

	        emp.calcuDailyWage(8, "FULL TIME");

	        Day_8_Employee.wagesOfMonth();

	        emp.wagestillhour();

	        emp.wagestillDays();
	    }
	}



