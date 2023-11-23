import java.io.*;

public class B10872 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(Factorial(N));
	}
	
	public static long Factorial(int N) {
		if (N == 0 || N == 1) {
			return 1;
		}
		return Factorial(N - 1) * N;
	}

}
