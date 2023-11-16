import java.io.*;
import java.util.*;

public class B17413 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		String S = br.readLine();
		String[] s = new String[S.length()];
		
		for (int i = 0; i < S.length(); i++) {
			s[i] = S.substring(i, i+1);
		} // 문자열을 Stiring 으로 입력 받아 문자 하나하나를 String[]로 저장해준다.
		
		Deque<String> deque = new ArrayDeque<>(); //덱 자료 구조를 사용
		boolean tag = true; // <> 처리를 위한 변수, < 를 만나면 false가 되어 <> 를 처리하도록 함
		
		for (int i = 0; i < s.length; i++) {
			if (tag == true) {
				if (s[i].equals("<")) {
					if (!deque.isEmpty()) {
						while (!deque.isEmpty()) {
							System.out.print(deque.pollFirst());
							
						}
					}
					tag = false;
					deque.addLast(s[i]);
				} // < 를 만나면 <> 처리를 위해 tag를 false로 바꿔주고, < 를 deuqe 에 넣어준다. 만약 < 를 만나기 전에 덱에 단어가 들어있었다면 덱 안의 단어를 출력하여 덱을 초기화시킨다. 
				else {
					if (s[i].equals(" ")) {
						while (!deque.isEmpty()) {
							System.out.print(deque.pollFirst());
						}
						System.out.print(" ");
					}
					else {
						deque.addFirst(s[i]);
					}
					
				} // 일반 단어를 받는 경우, 만약 공백을 만나면 한 단어를 모두 덱에 넣은 상태이므로 덱 안의 문자를 모두 출력하고 마지막으로 공백을 출력함. 덱을 초기화시킨다.
			}
			
			else {
				if (s[i].equals(">")) {
					tag = true;
					deque.addLast(s[i]);
					while (!deque.isEmpty()) {
						System.out.print(deque.pollFirst());
					}
				}
				else {
					deque.addLast(s[i]);
				}
			} // tag가 false 일때. 즉, <> 를 처리하는 경우이다. > 를 만날 때까지 문자를 덱에 넣어주고, > 를 만나면 > 을 덱에 저장한 후 덱 안 문자들을 모두 출력하여 덱을 초기화시킨다.
		}
		if (!deque.isEmpty()) {
			while (!deque.isEmpty()) {
				System.out.print(deque.pollFirst());
			}
		}
	}

}