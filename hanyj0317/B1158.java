import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.Queue;

public class B1158 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i < N+1; i++) {
			queue.offer(i);
		}
		
		System.out.print("<");
		
		while (!queue.isEmpty()) {
			for (int j = 1; j < K; j++) {
				queue.offer(queue.poll());
			}
			if (!(queue.size() == 1)) {
				System.out.print(queue.poll() + ", ");
			}
			else {
				System.out.print(queue.poll() + ">");
			}
		}
	}

}