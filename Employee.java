package Employee_wage;

    public class Employee 
{
   	
    public  static final int FULL_TIME_WAGE =20;
    public  final int PART_TIME_WAGE =20;
	public  void isEmpPresent(String empName) 

	{
	
	if (((int)Math.round(Math.random())) == 1)
    System.out.println(empName + " is present");
	else
	System.out.println(empName + " is not present");
}
    public  void calcuDailyWage(int hour,String tml) 
{
	
    	switch(tml) 
{
	case "FULL_TIME":
	System.out.println("numbers of daily employee wage is " + (FULL_TIME_WAGE*hour));
	break;
	case "PART_TIME":
	System.out.println("numbers of daily employee wage is " + (PART_TIME_WAGE*hour));
	break;
	default:
	System.out.println("please enter valid working time");
}
}
    public static void wagesOfMonth() {
   
    
    
    
	System.out.println("wages for days per month is " + (FULL_TIME_WAGE*20));
}
    public void wagestillhour() 
{
	int sum=0;
	int hour=100;
	while (hour>0) 
{
	hour = hour - 8;
	sum = sum + FULL_TIME_WAGE *8;
}
	System.out.println(sum);
}
	public void wagestillDays() 
{
	int sum=0;
	for (int i=1;i<21;i++) 
{
	sum = sum + FULL_TIME_WAGE *8;
}
	System.out.println(sum);
}

}