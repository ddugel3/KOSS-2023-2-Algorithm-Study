import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigInteger;

public class B1914 {
	static int N = 0;
	
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		N = Integer.parseInt(br.readLine());
		BigInteger res = new BigInteger("2"); // long 은 2^64 -1 까지 나타낼 수 있으므로 더 큰 자료형이 필요하다.
		
		if (N > 20) {
			res = res.pow(N);
			res = res.subtract(new BigInteger("1"));
			
			System.out.println(res);
		}
		
		if (N <= 20) {
			System.out.println((long)(Math.pow(2, N)) - 1);
			
			hanoi(N, 1, 3, 2);
		}
		
	}
	
	public static void hanoi(int n, int start, int end, int middle) { // 최종 목표: 시작 기둥에 있는 블럭을 목표 기둥에 옮겨야 한다.
		if (n == 1) {
			System.out.println(start + " " + end);
		}
		else {
			hanoi(n-1, start, middle, end); // n-1 개의 블럭을 가운데 기둥으로 모두 옮긴다.
			System.out.println(start + " " + end); // 시작 기둥에 남은 1개의 기둥을 목표 기둥으로 옮긴다.
			hanoi(n-1, middle, end, start); // 가운데 기둥에 옮겨준 n-1 개의 블럭을 최종적으로 목표 기둥으로 옮겨준다.
		}
	}
}