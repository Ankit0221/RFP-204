package Day3Array;

public class Day3Array_4 {
	public static void main(String[] args)
	{

		
		int[] Scanner
			= new int[] { 25, 110, 74, 75, 5 };

		System.out.println("Given array ");

		for (int i = 0; i < Scanner.length; i++) {

			System.out.println(Scanner[i]);
		}
		int minValue = Scanner[0];	
		
		for (int i = 0; i < Scanner.length; i++) {
	if (Scanner[i] < minValue)

				minValue = Scanner[i];
		}

		System.out.println(
			"Smallest element present in given array: "
			+ minValue);
	}
}