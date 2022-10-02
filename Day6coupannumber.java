package Day6problems;
import java.util.*;
import java.lang.Math;
public class Day6coupannumber {

			static int coupan(ArrayList<Integer> v)
			{
				
				int n = v.size();
			int num = (int)(Math.random() * n);
				int index = v.get(num);
				v.set(num, v.get(n - 1));
				v.remove(n - 1);
				return num;
			}
			static void Random(int n)
			{
				ArrayList<Integer> v = new ArrayList<>(n);
			
					for (int i = 0; i < n; i++)
					v.add(i + 1);
			
				
				while (v.size() > 0)
				{
					System.out.print(coupan(v) + " ");
				}
			}
			public static void main(String []args)
			{
				
				int n = 8;
				Random(n);
			}

	}


