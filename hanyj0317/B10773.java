import java.io.*;
import java.util.*;

public class B10773 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		int k = Integer.parseInt(br.readLine());
		Stack<Long> stack = new Stack<>();
		long result = 0;
		
		for (int i = 0; i < k; i++) {
			long temp = Long.parseLong(br.readLine());
			if (temp != 0) {
				stack.push(temp);
			}
			else {
				stack.pop();
			}
		}
		
		while (!stack.isEmpty()) {
			result += stack.pop();
		}
		
		System.out.println(result);
	}

}
