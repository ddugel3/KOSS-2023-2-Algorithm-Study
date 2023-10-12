import java.io.*;
import java.util.*;

public class B14915 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		String[] number = br.readLine().split(" ");
		
		long m = Long.parseLong(number[0]);
		int n = Integer.parseInt(number[1]);
		
		List<Integer> list = new ArrayList<>();
		String s = "0123456789ABCDEF";
		
		if (m < n) {
			System.out.println(s.substring((int)m, (int)m+1));
		}
		
		else {
			long temp = m;
			
			while (temp >= n) {
				list.add((int)(temp % n));
				temp = (int) (temp / n);
				
			}
			
			list.add((int)temp);
			
			Collections.reverse(list);
			
			for (int i = 0; i < list.size(); i++) {
				System.out.print(s.substring(list.get(i), list.get(i)+1));
			}
		}
	}

}