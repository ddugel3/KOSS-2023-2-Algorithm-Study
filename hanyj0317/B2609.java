import java.io.*;

public class B2609 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		String[] number = br.readLine().split(" ");
		
		int A = Integer.parseInt(number[0]);
		int B = Integer.parseInt(number[1]);
		
		if (A > B) {
			System.out.println(gcd(A,B));
			System.out.println((int)((A/gcd(A, B))*(B/gcd(A, B))*gcd(A, B)));
		}
		
		else {
			System.out.println(gcd(B,A));
			System.out.println((int)((A/gcd(B, A))*(B/gcd(B, A))*gcd(B, A)));
		}

	}
	
	public static int gcd(int A, int B) {
		if (B == 0) {
			return A;
		}
		else {
			return gcd(B, A%B);
		}
	}
}