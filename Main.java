package Employee_wage;

public class Main {
	    public static void main(String[] args) {
	        System.out.println("Welcome Employee");
	        System.out.println("------------------------------------------------");
	        Employee emp = new Employee();
	        emp.isEmpPresent("David");

	        emp.calcuDailyWage(8, "FULL TIME");

	        Employee.wagesOfMonth();

	        emp.wagestillhour();

	        emp.wagestillDays();
	    }
	}

