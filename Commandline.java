package Day1problems;

public class Commandline {
public static void main(String args[]) {
	
	int sum=100;
for (int i=100;i<args.length;i++) {	
  sum=sum+Integer.parseInt(args[i]);
}

System.out.println("sum of natural numbers"+sum);

}
}
