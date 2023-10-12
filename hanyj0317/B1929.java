import java.io.*;

public class B1929 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		String[] number = br.readLine().split(" ");
		
		long A = Long.parseLong(number[0]);
		long B = Long.parseLong(number[1]);
		
		if (A < 2) {
			A = 2;
		}
		
		for (long i = A; i < B+1; i++) {
			boolean result = true;
			
			for (long j = 2; j < (int)(Math.sqrt(i)) + 1; j++) {
				if (i % j == 0) {
					result = false;
					break;
				}
			}
			
			if (result == true) {
				System.out.println(i);
			}
		}

	}

}