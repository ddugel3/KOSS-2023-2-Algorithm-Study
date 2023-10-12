import java.io.*;

public class B6588 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while (true) {
			long number = Long.parseLong(br.readLine());
			
			if (number == 0) {
				break;
			}
			
			long a = 0;
			long answer = 0;
			
			Outter: for (long i = 3; i < number + 1; i += 2) {
				boolean result = true;
				for (long j = 2; j < (int)(Math.sqrt(i)) + 1; j++) {
					if (i % j == 0) {
						result = false;
						break;
					}
				}
				
				if (result == true) {
					a = number - i;
				}
				
				boolean result2 = true;
				for (long j = 2; j < (int)(Math.sqrt(a)) + 1; j++) {
					
					if (a % j == 0) {
						result2 = false;
						break;
					}
				}
				
				if (result2 == true) {
					answer = i;
					break Outter;
				}
				
				else {
					continue Outter;
				}
			}
			
			if (answer != 0) {
				System.out.println(number + " = " + answer + " + " + a);
			}
			
			else {
				System.out.println("Goldbach's conjecture is wrong.");
			}
			
		}
		
		
	}

}
