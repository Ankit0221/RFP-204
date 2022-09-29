package Day3Array;

import java.util.Scanner;

public class Day3Array_6{

	
	

	public static void main(String[]args){
	
		int a[]  = new int[5];
		System.out.println("enter elements in array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=new Scanner(System.in).nextInt();
		}	
		System.out.println("array reverse elements");
	for(int i=a.length-1;i>=0;i--) {
	
	System.out.println(a[i]+" ");
	
	}

	}
		
}