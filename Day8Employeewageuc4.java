package Day_8_problems;

public class Day8Employeewageuc4  {
	
	    public static void main(String args[])
	    {
	        final int parttime = 1;
	         final int fulltime = 2;
	         int wageperhour = 20;
	        int employee = (int)(Math.random()*100)%3;
	        int workinghour =0;
	        switch (employee)
	        {
	            case fulltime:
	                System.out.println("employee  present fulltime");
	                workinghour = 8;
	                break;
	            case parttime:
	                System.out.println("employee  Present parttime");
	                workinghour = 4;
	                break;
	            default:
	                System.out.println("employee is absent");    
	        }
	        int wage = workinghour * wageperhour;
	        System.out.println(" daily employee wage=" + wage);
	    }
	}
