package Day5_problems;
import java.io.*;
import java.util.*;
public class Day5_functional_threeintegers {


       public static void findTriplets(int[] arr, int N)
		{
			boolean found = false;
			for (int i = 0; i < N - 2; i++) {
				for (int j = i + 1; j < N - 1; j++) {
					for (int k = j + 1; k < N; k++) {
						if (arr[i] + arr[j] + arr[k] == 0) {
							System.out.println(arr[i] + " "
											+ arr[j] + " "
											+ arr[k]);
							found = true;
						}
					}
				}
			}

			if (found == false)
				System.out.println(" not exist ");
		}

		public static void main(String[] args)
		{
			int arr[] = { 0, -1, 2, -3, 1 };
			int n = arr.length;
			findTriplets(arr, n);
		}
	}


