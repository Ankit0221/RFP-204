package Day1problems;

public class Leapyear {

public static void main(String[]args) {
int year=1900;
if(year%400==0) {
	System.out.println("Leap year");
}
else if (year==0&& year%100!=0) {
	System.out.println("Leap year");
}
else 
{
	System.out.println("Not a Leap year");}
     }
}