import java.io.*;

public class B1735 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		String[] number1 = br.readLine().split(" ");
		long first_numerator = Integer.parseInt(number1[0]);
		long first_denominator = Integer.parseInt(number1[1]);
		
		String[] number2 = br.readLine().split(" ");
		long second_numerator = Integer.parseInt(number2[0]);
		long second_denominator = Integer.parseInt(number2[1]);
		long add_denominator, add_numerator;
		
		if (first_denominator > second_denominator) {
			long gcd = gcd(first_denominator, second_denominator);
			add_denominator = gcd * (first_denominator / gcd) * (second_denominator / gcd);
			add_numerator = first_numerator * (add_denominator / first_denominator) + second_numerator * (add_denominator / second_denominator);
		}
		
		else {
			long gcd = gcd(second_denominator, first_denominator);
			add_denominator = gcd * (first_denominator / gcd) * (second_denominator / gcd);
			add_numerator = first_numerator * (add_denominator / first_denominator) + second_numerator * (add_denominator / second_denominator);
		}
		
		long final_denominator, final_numerator;
		final_denominator = add_denominator / gcd(Math.max(add_denominator, add_numerator),  Math.min(add_denominator, add_numerator));
		final_numerator = add_numerator / gcd(Math.max(add_denominator, add_numerator),  Math.min(add_denominator, add_numerator));
		System.out.printf("%d %d", final_numerator, final_denominator);
		
	}
	
	public static long gcd(long A, long B) {
		if (B == 0) {
			return A;
		}
		else {
			return gcd(B, A%B);
		}
	}

}