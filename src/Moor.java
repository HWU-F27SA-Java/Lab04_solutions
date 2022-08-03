import java.text.DateFormatSymbols;
import java.util.Scanner;

public class Moor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month (1 to 12) ");
		int m = input.nextInt();
		System.out.print("Enter a year posterior to 2006 ");
		int y = input.nextInt();
		
		// call moor()
		double perf = moor(m,y);
		
		//print result
		String message = "According to Moor's law, computer performance would be ";
		String  monthString = new DateFormatSymbols().getMonths()[m-1] + " ";
		System.out.println(message + perf + " GHz by " + monthString + y);
		input.close();
	}

	public static double moor(int month, int year) {
		// years difference
		int dy = year - 2006;
		// months difference
		int dm = month + dy * 12;
		// calculate performance
		double performance = 3 * Math.pow(2, dm / 18.0D);

		// return result
		return performance;
	}
}
