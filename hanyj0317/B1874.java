import java.io.*;
import java.util.*;

public class B1874 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		List<String> list = new ArrayList<>();
		int top = 0;
		int now = 0;
		boolean result = true;
		
		for (int i = 0; i < n; i++) {
			if (result == true) {
				int temp = Integer.parseInt(br.readLine());
				
				if (now == 0) {
					for (int j = 1; j < temp + 1; j++) {
						stack.push(j);
						list.add("+");
					}
					stack.pop();
					list.add("-");
					now = temp;
					if (!stack.isEmpty()) {
						top = stack.peek();
					}
					else {
						top = 0;
					}
				}
				else {
					if (temp == top) {
						stack.pop();
						list.add("-");
						if (!stack.isEmpty()) {
							top = stack.peek();
						}
						else {
							top = 0;
						}
					}
					else if (temp > top) {
						for (int j = now + 1; j < temp + 1; j++) {
							stack.push(j);
							list.add("+");
						}
						now = temp;
						stack.pop();
						list.add("-");
						if (!stack.isEmpty()) {
							top = stack.peek();
						}
						else {
							top = 0;
						}
						
					}
					else if (temp < top) {
						result = false;
					}
				}
			}
			else {
				int temp = Integer.parseInt(br.readLine());
			}
		}
		if (result == true) {
			for (int l = 0; l < list.size(); l++) {
				System.out.println(list.get(l));
			}
		}
		else {
			System.out.println("NO");
		}
	}

}