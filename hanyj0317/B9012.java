import java.io.*;
import java.util.*;

public class B9012 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			Stack<Character> stack = new Stack<>();
			String s = br.readLine();
			
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				
				if (ch == '(') {
					stack.push(ch);
				}
				else {
					if (stack.isEmpty()) {
						stack.push(ch);
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			if (stack.isEmpty()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
	}
}
