package Day9problems;

public class Day9Employeeuc1 {

	public static void main(String args[])
    {
        int fulltime = 1;
        int employee = (int)(Math.random()*100)%2;
        if (employee == fulltime)
        {
            System.out.println("employee is present ");

        } else
        {
            System.out.println("employee is absent ");

        }
    }
}


