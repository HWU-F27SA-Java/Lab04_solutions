
public class Binary {

	public static void main(String[] args) {
		int n = 436789086;
		String bin1 = binaryRep(n);
		System.out.println(bin1);
		
		int m = binaryInvert(n);
		String bin2 = binaryRep(m);
		System.out.println(bin2);
	}
	
	public static int binaryInvert(int b) {
		int r = 0;
		for (int i = 0; i < 32; i++) {
			r = (r << 1);
			int e = b & 0x1;
			b = (b >> 1);
			r = (r | e);
		}
		return r;
	}

	static String  binaryRep(int n) {
		String bin = Integer.toBinaryString(n);
		int pad = Integer.numberOfLeadingZeros(n);
		String s = "";
		for(int i=0; i<pad; i++) {
			s += "0";
		}
		s = s + bin;
		return s;
	}


}
