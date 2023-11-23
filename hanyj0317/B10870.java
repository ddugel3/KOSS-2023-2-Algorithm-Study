import java.io.*;

public class B10870 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(Fibonacci(n));
	}
	
	public static int Fibonacci(int a) {
		if (a == 1 || a == 2) {
			return 1;
		}
		
		else if (a == 0) {
			return 0;
		}
		
		else {
			return Fibonacci(a - 1) + Fibonacci(a - 2);
		}
	}
}