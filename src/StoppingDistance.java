import java.util.Scanner;

public class StoppingDistance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the speed (km/h) ");
		int s = input.nextInt();
		System.out.print("Enter the fatigue (1 to 5) ");
		int f = input.nextInt();
		System.out.print("Enter the road status (0.4 to 0.8) ");
		float h = input.nextFloat();

		//calculate stopping distance
		float distance = getStoppingDistance(s,f,h);
		
		//print
		System.out.println("Stopping distance is " + distance);
		
		//close scanner
		input.close();
	}

	public static float getStoppingDistance (int s, float f, float h) {
		//reaction distance
		float dr = f * s * 1000.0F / 3600;
		//braking distance
		float db = (float) Math.pow(s,  2) / (254 * h);
		
		//stopping distance
		float ds = dr + db;
		//return result
		return ds;
	}
}
