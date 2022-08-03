import java.util.Scanner;

public class BinaryInversion {

	public static void main(String[] args) {
		System.out.print("Enter a number between 0 and 127");
		Scanner input = new Scanner(System.in);
		int b = input.nextByte();


		//call binaryInvert()
		int r = binaryInvert(b);
		
		//getBinary representation
		String binaryOriginal = getBinary( b);
		String binaryResult = getBinary( r);
		
		//print original and result ion binary
		System.out.println(binaryOriginal);
		System.out.println(binaryResult);

		//close Scanner object
		input.close();
	}

	private static String getBinary( int n) {
		int offset = 24; // number of leading 0 when byte is put in an int variable
		String s = Integer.toBinaryString(n);
		int r = Integer.numberOfLeadingZeros(n);
		for (int i = offset; i < r; i++) {
			s = "0" + s;
		}
		return s;
	}

	public static int binaryInvert(int b) {
		int r = 0;
		for (int i = 0; i < 8; i++) {
			r = (r << 1);
			int e = b & 0x1;
			b = (b >> 1);
			r = (r | e);
		}
		return r;
	}
}
